package br.com.jequiti.relatorioocorrencia.login.dto;

import lombok.Data;

@Data

public class Autenticacao {
	private String authToken;
	private Long issuedAt;
	private String endPoint;
}
