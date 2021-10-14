package br.com.jequiti.relatorioocorrencia.serviceImpl.login;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;
import br.com.jequiti.relatorioocorrencia.login.dto.Autenticacao;
import br.com.jequiti.relatorioocorrencia.login.dto.Requisicao;
import br.com.jequiti.relatorioocorrencia.service.login.AutenticacaoService;
import br.com.jequiti.relatorioocorrencia.service.login.ClienteRestService;
import br.com.jequiti.relatorioocorrencia.service.login.RequisicaoService;

@Service
public class ClienteRestServiceImpl implements ClienteRestService {
	private static final Logger log = LoggerFactory.getLogger(ClienteRestServiceImpl.class);

	@Autowired
	private AutenticacaoService _autenticacaoService;
	@Autowired
	private RequisicaoService _requisicaoService;

	public Ocorrencia[] buscarOcorrenciasPorData(String dataIni, String dataFim) {

		Ocorrencia[] retorno = null;

		try {

			Autenticacao autenticacao = this._autenticacaoService.autenticar();

			Requisicao requisicao = new Requisicao();
			requisicao.setUrl("http://qaapijequiti.geravd.com.br/api/Notifications?initialNotificationDate=" + dataIni
					+ "&finalNotificationDate=" + dataFim);
			requisicao.setOperacao("SELECT");

			ObjectMapper mapper = new ObjectMapper();
			retorno = mapper.readValue(this._requisicaoService.requerer(requisicao).toString(), Ocorrencia[].class);

		} catch (Exception e) {

		}
		return retorno;
	}
}