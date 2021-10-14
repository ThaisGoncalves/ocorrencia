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

import br.com.jequiti.relatorioocorrencia.entity.Turno;
import br.com.jequiti.relatorioocorrencia.service.TurnoService;

@RestController
@RequestMapping("/turno")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TurnoController {

	@Autowired
	TurnoService service;

	@GetMapping
	public ResponseEntity<List<Turno>> getTurno() {
		return ResponseEntity.ok(service.getTurno());
	}

	@PostMapping
	public ResponseEntity<Turno> post(@RequestBody Turno turno) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveTurno(turno));
	}
	
	@PutMapping
	public ResponseEntity<Turno> put(@RequestBody Turno turno) {
		return ResponseEntity.ok(service.saveTurno(turno));
	}
}