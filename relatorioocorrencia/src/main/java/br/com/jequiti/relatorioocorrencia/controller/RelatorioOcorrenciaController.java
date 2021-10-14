package br.com.jequiti.relatorioocorrencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;
import br.com.jequiti.relatorioocorrencia.service.login.ClienteRestService;

@RestController
public class RelatorioOcorrenciaController {

	@Autowired
	private ClienteRestService _clienteRestService;

	@GetMapping("/listarOcorrenciasPorPeriodo")
	public ResponseEntity<Ocorrencia[]> listarOcorrenciasPorPeriodo(
			@RequestParam(value = "dataIni", required = true) String dataIni,
			@RequestParam(value = "dataFim", required = true) String dataFim) {
		return new ResponseEntity<Ocorrencia[]>(this._clienteRestService.buscarOcorrenciasPorData(dataIni, dataFim),
				HttpStatus.OK);
	}
}
