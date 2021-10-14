package br.com.jequiti.relatorioocorrencia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jequiti.relatorioocorrencia.entity.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

	List<Ocorrencia> buscarOcorrencia();
	
	Optional<Ocorrencia> findAllByCodigoAtendimento(Long codigoAtendimento);

	Optional<Ocorrencia> findAllByCodigoOcorrencia(Long codigoOcorrencia);

	Optional<Ocorrencia> findAllByCodigoConsultora(Long codigoConsultora);

	Optional<Ocorrencia> findAllByCodigoPedido(Long codigoPedido);

}