package com.giovannagrangeiro.projetocp.dto;

import java.time.LocalDate;
import java.util.List;

public class PessoaDTO {
	private Integer id;
	private String nome;
	private String cpf;
	private LocalDate dataDeNascimento;
	private List<ContatoDTO> contatos;
	


	public PessoaDTO(Integer id, String nome, String cpf, LocalDate dataDeNascimento, List<ContatoDTO> contatos) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.contatos = contatos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public List<ContatoDTO> getContatos() {
		return contatos;
	}

	public void setContatos(List<ContatoDTO> contatos) {
		this.contatos = contatos;
	}
	
	
	
	
}
