package br.com.jequiti.relatorioocorrencia.serviceImpl.login;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import br.com.jequiti.relatorioocorrencia.exception.PrincipalException;
import br.com.jequiti.relatorioocorrencia.login.dto.Autenticacao;
import br.com.jequiti.relatorioocorrencia.login.dto.Parametros;
import br.com.jequiti.relatorioocorrencia.service.login.AutenticacaoService;
import br.com.jequiti.relatorioocorrencia.service.login.ParametrosService;

public class AutenticacaoImpl implements AutenticacaoService {
	private static final Logger log = LoggerFactory.getLogger(AutenticacaoImpl.class);
	@Autowired
	RestTemplate _restTemplate;
	@Autowired
	ParametrosService _parametrosService;

	@Override
	public Autenticacao autenticar() {
		try {
			Parametros parametros = this._parametrosService.buscarParametros();

			HttpHeaders headers = new HttpHeaders();
			headers.setBasicAuth(parametros.getClientId(), parametros.getPassword());
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);
			headers.setAccept(Arrays.asList(MediaType.MULTIPART_FORM_DATA));

			MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
			map.add("clientId", parametros.getClientId());
			map.add("clientSecret", parametros.getClientSecret());
			map.add("grantType", parametros.getGrantType());
			map.add("username", parametros.getUsername());
			map.add("password", parametros.getPassword());
			
			HttpEntity<MultiValueMap<String, String>> params = new HttpEntity<>(map,
					  headers);
			
			/*
			 * 
			 * ResponseEntity<AutenticacaoGkoDTO> response =
			 * restTemplate.postForEntity(parametros.getAuthenticationUrl(), params,
			 * AutenticacaoGkoDTO.class);
			 * 
			 * if (response.getStatusCode() == HttpStatus.OK) return response.getBody();
			 * else throw new PrincipalException(response.getBody().toString());
			 */
		} catch (Exception e) {

		}
		return null;
	}

}
