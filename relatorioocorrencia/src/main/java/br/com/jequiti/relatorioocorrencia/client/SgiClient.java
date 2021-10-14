package br.com.jequiti.relatorioocorrencia.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;


import lombok.Data;
@Configuration
@Transactional
@Data
public class SgiClient {
	public @Value("${sgi.swagger.client_id}") String clientId;
	public @Value("${sgi.swagger.client_secret}") String clientSecret;
	public @Value("${sgi.swagger.grant_type}") String grantType;
	public @Value("${sgi.swagger.username}") String username;
	public @Value("${sgi.swagger.password}") String password;
	
	public @Value("${sgi.swagger.url}") String urlApi;
}
