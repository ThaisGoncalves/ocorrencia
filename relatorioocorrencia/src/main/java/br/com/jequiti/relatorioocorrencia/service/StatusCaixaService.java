package br.com.jequiti.relatorioocorrencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.entity.StatusCaixa;
import br.com.jequiti.relatorioocorrencia.repository.StatusCaixaRepository;

@Service
public class StatusCaixaService {
	@Autowired
	StatusCaixaRepository repository;
	
	public List<StatusCaixa> getStatusCaixa() {
		return repository.findAll();

	}

	public Optional<StatusCaixa> getById(Long idCaixa) {
		return repository.findById(idCaixa);

	}
	
	public Optional<StatusCaixa> getByDescricao(String descricao) {
		return repository.findAllByDescricaoContainingIgnoreCase(descricao);

	}

	public StatusCaixa saveStatusCaixa(StatusCaixa caixa) {
		return this.repository.saveAndFlush(caixa);
	}
}
