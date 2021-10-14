package br.com.jequiti.relatorioocorrencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jequiti.relatorioocorrencia.entity.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {

}