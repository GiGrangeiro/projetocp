package com.giovannagrangeiro.projetocp.repositories;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovannagrangeiro.projetocp.domain.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	Page<Pessoa> findByNomeContainingIgnoreCase(String nome, Pageable page);
	
	
	 
	
	
}
