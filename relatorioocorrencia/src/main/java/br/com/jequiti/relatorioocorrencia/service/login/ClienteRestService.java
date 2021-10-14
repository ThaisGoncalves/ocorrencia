package br.com.jequiti.relatorioocorrencia.service.login;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;

public interface ClienteRestService {
	
	Ocorrencia[] buscarOcorrenciasPorData(String dataIni, String dataFim);
	
}
