package br.com.jequiti.relatorioocorrencia.entity;

import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "turno")
@Data
public class Turno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTurno;

	@NotNull
	private Time horaInicio;

	@NotNull
	private Time horaFim;

	@NotNull
	@Size(min = 1, max = 1)
	private String status;

	@NotNull
	private LocalTime dataCadastro;

	@NotNull
	private long criadoPor;

	@NotNull
	private LocalTime dataAtualizacao;

	private long atualizadoPor;

}
