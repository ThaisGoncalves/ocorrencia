package br.com.jequiti.relatorioocorrencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jequiti.relatorioocorrencia.entity.TipoDano;
import br.com.jequiti.relatorioocorrencia.service.TipoDanoService;

@RestController
@RequestMapping("/tipoDano")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class TipoDanoController {
	@Autowired
	TipoDanoService service;

	@GetMapping
	public ResponseEntity<List<TipoDano>> getTipoDano() {
		return ResponseEntity.ok(service.getTipoDano());
	}

	@PostMapping
	public ResponseEntity<TipoDano> post(@RequestBody TipoDano tipoDano) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveTipoDano(tipoDano));
	}

	@PutMapping
	public ResponseEntity<TipoDano> put (@RequestBody TipoDano tipoDano) {
		return ResponseEntity.status(HttpStatus.OK).body(service.saveTipoDano(tipoDano)); 
	}

	

}
