package br.com.jequiti.relatorioocorrencia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;
import br.com.jequiti.relatorioocorrencia.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {

	@Autowired OcorrenciaRepository repository;
	

	public List<Ocorrencia> getOcorrencia() {
		return repository.findAll();
	}
	
	public Optional<Ocorrencia> getById(Long idOcorrencia) {
		return repository.findById(idOcorrencia);

	}
	
	public Optional<Ocorrencia> getByCodigoAtendimento(Long codigoAtendimento) {
		return repository.findById(codigoAtendimento);

	}
	
	public Optional<Ocorrencia> getByCodigoOcorrencia(Long codigoOcorrencia) {
		return repository.findById(codigoOcorrencia);

	}
	
	public Optional<Ocorrencia> getByCodigoConsultora(Long codigoConsultora) {
		return repository.findById(codigoConsultora);

	}
	
	public Optional<Ocorrencia> getByCodigoPedido(Long codigoPedido) {
		return repository.findById(codigoPedido);

	}

	public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
		return this.repository.saveAndFlush(ocorrencia);
	}
}

