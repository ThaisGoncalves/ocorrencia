package br.com.jequiti.relatorioocorrencia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;
import br.com.jequiti.relatorioocorrencia.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OcorrenciaController {
	
	@Autowired OcorrenciaService service;
	
	@GetMapping
	public ResponseEntity<List<Ocorrencia>> getOcorrencia() {
		return ResponseEntity.ok(service.getOcorrencia());
	}
	
	@GetMapping("/{codigoPedido}")
	public ResponseEntity<Optional<Ocorrencia>> findBycodigoPedido(@PathVariable Long codigoPedido) {
		return ResponseEntity.ok(service.getByCodigoPedido(codigoPedido));
	}
	
	@PostMapping
	public ResponseEntity<Ocorrencia> post(@RequestBody Ocorrencia ocorrencia) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveOcorrencia(ocorrencia));
	}
	
	@PutMapping
	public ResponseEntity<Ocorrencia> put(@RequestBody Ocorrencia correncia) {
		return ResponseEntity.ok(service.saveOcorrencia(correncia));
	}
}
