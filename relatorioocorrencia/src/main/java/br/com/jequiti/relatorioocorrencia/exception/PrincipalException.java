package br.com.jequiti.relatorioocorrencia.exception;

import lombok.Data;

@Data
public class PrincipalException extends Exception{

	private static final long serialVersionUID = 758372394639574417L;
	private String msg;
	
	public PrincipalException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
