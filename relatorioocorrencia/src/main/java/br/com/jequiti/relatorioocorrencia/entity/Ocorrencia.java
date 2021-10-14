package br.com.jequiti.relatorioocorrencia.entity;

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
@Table(name = "ocorrencia")
@Data
public class Ocorrencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOcorrencia;
	
	@NotNull
	private long codigoAtendimento;

	@NotNull
	private long codigoOcorrencia;

	@NotNull
	private long codigoConsultora;

	private LocalTime dataOcorrencia;

	private String ocorrencia;

	@NotNull
	private long codigoPedido;

	@NotNull
	private LocalTime dataPedido;

	@NotNull
	@Size(max = 250)
	private String bairro;

	@NotNull
	@Size(max = 250)
	private String cidade;

	@NotNull
	@Size(max = 250)
	private String uf;

	private long codigoProduto;

	private long codigoDano;

	@Size(max = 250)
	private String gerenteVendas;

	@Size(max = 250)
	private String gerenteRegional;

	@NotNull
	private LocalTime anoPedido;

	@NotNull
	private LocalTime mesPedido;

	@NotNull
	private LocalTime anoRegistro;

	@NotNull
	private LocalTime mesRegistro;

	private long quantidadeProduto;

	@Size(max = 30)
	private String caixaViolada;

	@NotNull
	private int turnoOcorrencia;

	@NotNull
	private String episodioPedido;

	private LocalTime DataCaixaFinalizada;

	private LocalTime HoraCaixaFinalizada;

	private long codigoEntregaUf;

	@Size(max = 2)
	private String caixaConferida;
	

}
