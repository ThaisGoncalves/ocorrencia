package br.com.jequiti.relatorioocorrencia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jequiti.relatorioocorrencia.entity.TipoDano;

@Repository
public interface TipoDanoRepository extends JpaRepository<TipoDano, Long> {
	Optional<TipoDano> findAllByTipoDanoContainingIgnoreCase(String tipoDano);
}
