package br.com.jequiti.relatorioocorrencia.login.dto;

import lombok.Data;

@Data
public class Parametros {
	private String clientId;
	private String clientSecret;
	private String grantType;
	private String username;
	private String password;
}
