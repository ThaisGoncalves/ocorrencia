package br.com.jequiti.relatorioocorrencia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "statusCaixa")
@Data
public class StatusCaixa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idStatusCaixa;

	@NotNull
	@Size(min = 2, max = 2)
	private String tipo;

	@Size(max = 80)
	private String descricao;
}
