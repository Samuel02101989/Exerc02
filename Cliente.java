package com.indra.exerc02.model;

public class Cliente {
	
	private String nome;
	private String rua;
	private Integer numeroCasa;
	private Long telefone;
	private Long celular;
	private String cpf;
	private String cnpj;
	
	public Cliente(String nome, String rua, Integer numeroCasa, Long telefone, Long celular, String cpf,
			String cnpj) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.telefone = telefone;
		this.celular = celular;
		this.cpf = cpf;
		this.cnpj = cnpj;
	}
	
	public Cliente(){
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Long getCelular() {
		return celular;
	}
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString(){
		return nome+ " " +rua+" "+numeroCasa+" "+telefone+" "+telefone+" "+celular+ " "+cpf+" "+cnpj;
	}

}
