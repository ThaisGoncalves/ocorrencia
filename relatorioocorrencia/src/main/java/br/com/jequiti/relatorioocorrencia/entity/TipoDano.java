package br.com.jequiti.relatorioocorrencia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "tipoDano")
@Data
public class TipoDano {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDano;

	@Size(max = 50)
	private String tipoDano;
}
