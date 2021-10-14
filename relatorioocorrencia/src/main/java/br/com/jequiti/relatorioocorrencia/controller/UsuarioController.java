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

import br.com.jequiti.relatorioocorrencia.entity.Usuario;
import br.com.jequiti.relatorioocorrencia.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class UsuarioController {

	@Autowired UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getUsuario() {
		return ResponseEntity.ok(service.getUsuario());
	}

	@GetMapping("/{atualizadoPor}")
	public ResponseEntity<Optional<Usuario>> findByAtualizadoPor(@PathVariable String atualizadoPor) {
		return ResponseEntity.ok(service.findByAtualizadoPor(atualizadoPor));
	}

	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveUsuario(usuario));
	}
	
	
	@PutMapping
	public ResponseEntity<Usuario> put(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(service.saveUsuario(usuario));
	}
}