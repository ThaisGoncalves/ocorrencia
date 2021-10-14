package br.com.jequiti.relatorioocorrencia.serviceImpl.login;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.client.SgiClient;
import br.com.jequiti.relatorioocorrencia.login.dto.Parametros;
import br.com.jequiti.relatorioocorrencia.service.login.ParametrosService;


@Service
public class ParametrosImpl implements ParametrosService {
	private static final Logger log = LoggerFactory.getLogger(ParametrosImpl.class);
	@Autowired
	SgiClient _sgiClient;

	@Override
	public Parametros buscarParametros() {
		Parametros retorno = null;

		try {
			retorno = new Parametros();

			retorno.setClientId(_sgiClient.clientId);
			retorno.setClientSecret(_sgiClient.clientSecret);
			retorno.setGrantType(_sgiClient.grantType);
			retorno.setPassword(_sgiClient.password);
			retorno.setUsername(_sgiClient.username);

		} catch (Exception e) {
			log.error("Exception " + e);
		}

		return retorno;
	}

}
