package br.com.jequiti.relatorioocorrencia.entity;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	@NotNull
	@Size(min = 3, max = 80)
	private String nome;

	@NotNull
	@Size(min = 3, max = 180)
	private String sobrenome;

	@NotNull
	@Size(min = 1, max = 1)
	private String status;

	@NotNull
	private Date dataCadastro;

	@NotNull
	private long criadoPor;

	private LocalTime dataAtualizacao;

	private String atualizadoPor;

}
