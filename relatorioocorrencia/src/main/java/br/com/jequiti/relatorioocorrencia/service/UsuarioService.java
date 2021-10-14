package br.com.jequiti.relatorioocorrencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.entity.Usuario;
import br.com.jequiti.relatorioocorrencia.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	public UsuarioRepository repository;

	public List<Usuario> getUsuario() {
		return repository.findAll();

	}

	public Optional<Usuario> findByAtualizadoPor(String atualizadoPor) {
		return repository.findByAtualizadoPor(atualizadoPor);

	}

	public Usuario saveUsuario(Usuario usuario) {
		return this.repository.saveAndFlush(usuario);
	}
}
