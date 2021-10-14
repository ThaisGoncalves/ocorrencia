package br.com.jequiti.relatorioocorrencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.entity.TipoDano;
import br.com.jequiti.relatorioocorrencia.repository.TipoDanoRepository;

@Service
public class TipoDanoService {
	@Autowired TipoDanoRepository repository;

	public List<TipoDano> getTipoDano() {
		return repository.findAll();

	}
	
	public Optional<TipoDano> getById(Long idDano) {
		return repository.findById(idDano);

	}
	
	public Optional<TipoDano> getByTipo(String tipoDano) {
		return repository.findAllByTipoDanoContainingIgnoreCase(tipoDano);

	}

	public TipoDano saveTipoDano(TipoDano tipoDano) {
		return this.repository.saveAndFlush(tipoDano);
	}
	
}
