package br.com.jequiti.relatorioocorrencia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jequiti.relatorioocorrencia.entity.StatusCaixa;

@Repository
public interface StatusCaixaRepository extends JpaRepository<StatusCaixa, Long> {

	Optional<StatusCaixa> findAllByDescricaoContainingIgnoreCase(String descricao);
}
