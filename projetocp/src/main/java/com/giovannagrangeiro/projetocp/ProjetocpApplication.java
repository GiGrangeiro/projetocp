package com.giovannagrangeiro.projetocp;


import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.giovannagrangeiro.projetocp.domain.Contato;
import com.giovannagrangeiro.projetocp.domain.Pessoa;

import com.giovannagrangeiro.projetocp.repositories.PessoaRepository;

@SpringBootApplication
public class ProjetocpApplication implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetocpApplication.class, args);
		 	
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa(null, "Ana", "09971542927", LocalDate.of(2000, 1, 1));
		
		
		
		
		Contato c1 = new Contato(null, "Paulo", "(44)997456321", "Paulo@gmail.com");
		Contato c2 = new Contato(null, "Marcelo", "(44)998632547", "Marcelo@gmail.com");
		
	
		p1.addContato(c1);
		p1.addContato(c2);
		

		
		pessoaRepository.saveAll(Arrays.asList(p1));
		
		
		
	}

}
