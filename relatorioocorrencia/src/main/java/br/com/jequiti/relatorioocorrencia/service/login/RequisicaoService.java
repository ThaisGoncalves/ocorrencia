package br.com.jequiti.relatorioocorrencia.service.login;

import br.com.jequiti.relatorioocorrencia.login.dto.Requisicao;

public interface RequisicaoService {
	String requerer(Requisicao requisicao) throws Exception;
}
