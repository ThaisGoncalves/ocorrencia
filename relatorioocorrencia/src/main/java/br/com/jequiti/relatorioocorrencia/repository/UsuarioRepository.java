package br.com.jequiti.relatorioocorrencia.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jequiti.relatorioocorrencia.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario>findByAtualizadoPor(String atualizadoPor);
}
