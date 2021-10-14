package br.com.jequiti.relatorioocorrencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.entity.Turno;
import br.com.jequiti.relatorioocorrencia.repository.TurnoRepository;

@Service
public class TurnoService {
	@Autowired
	TurnoRepository repository;

	public List<Turno> getTurno() {
		return repository.findAll();

	}

	public Turno saveTurno(Turno turno) {
		return this.repository.saveAndFlush(turno);
	}

}
