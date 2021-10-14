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

import br.com.jequiti.relatorioocorrencia.entity.StatusCaixa;
import br.com.jequiti.relatorioocorrencia.service.StatusCaixaService;

@RestController
@RequestMapping("/statusCaixa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StatusCaixaController {

	@Autowired
	StatusCaixaService service;

	@GetMapping
	public ResponseEntity<List<StatusCaixa>> getStatusCaixa() {
		return ResponseEntity.ok(service.getStatusCaixa());
	}

	@GetMapping("/{descricao}")
	public ResponseEntity<Optional<StatusCaixa>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(service.getByDescricao(descricao));
	}

	@PostMapping
	public ResponseEntity<StatusCaixa> post(@RequestBody StatusCaixa caixa) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveStatusCaixa(caixa));
	}

	@PutMapping
	public ResponseEntity<StatusCaixa> put(@RequestBody StatusCaixa caixa) {
		return ResponseEntity.status(HttpStatus.OK).body(service.saveStatusCaixa(caixa));
	}
}
