package br.com.jequiti.relatorioocorrencia.serviceImpl.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jequiti.relatorioocorrencia.exception.PrincipalException;
import br.com.jequiti.relatorioocorrencia.login.dto.Requisicao;
import br.com.jequiti.relatorioocorrencia.service.login.RequisicaoService;

public class RequisicaoImpl implements RequisicaoService{
	private static final Logger log = LoggerFactory.getLogger(RequisicaoImpl.class);
	
	@Autowired
	RestTemplate _restTemplate;

	@Override
	public String requerer(Requisicao requisicao) throws Exception {

		String retorno = null;

		HttpHeaders headers = new HttpHeaders();

		try {

			if (requisicao.getToken() != null) {
				headers.add("Authorization", requisicao.getToken());
			}

			headers.setContentType(MediaType.APPLICATION_JSON);

			HttpEntity<String> entity = null;

			if (requisicao.getObjeto() != null) {

				String json = new ObjectMapper().writeValueAsString(requisicao.getObjeto());
				entity = new HttpEntity<String>(json, headers);

			} else {
				entity = new HttpEntity<String>(headers);
			}

			ResponseEntity<String> response = null;
			switch (requisicao.getOperacao()) {
			case "UPDATE":
				response = this._restTemplate.exchange(requisicao.getUrl(), HttpMethod.POST, entity, String.class);
				break;
			case "SELECT":
				response = this._restTemplate.exchange(requisicao.getUrl(), HttpMethod.GET, entity, String.class);
				break;
			case "DELETE":
				response = this._restTemplate.exchange(requisicao.getUrl(), HttpMethod.DELETE, entity, String.class);
				break;
			default:
				log.info("erro: " + requisicao.getOperacao() + " não identificada no sistema");
			}

			retorno = response.getBody();
			if (response.getStatusCode() != HttpStatus.OK) {

				String msg = "erro integração: " + response.getBody().toString();
				log.info(msg);
				throw new PrincipalException(msg);
			}

		} catch (Exception e) {
			log.error("erro: " + e.getMessage());
		}

		return retorno;
	}
}
