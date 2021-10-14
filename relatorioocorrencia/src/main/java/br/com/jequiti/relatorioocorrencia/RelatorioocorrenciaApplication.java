package br.com.jequiti.relatorioocorrencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RelatorioocorrenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelatorioocorrenciaApplication.class, args);
	}

}
