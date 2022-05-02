package br.com.senai.naarasouza.application.config;

import java.sql.Date;

public class Pessoa {
	
	private String nome;
	private String email;
	private Date datanasc;
	private Endereco endereco;
	private String tel;
	private String telempresa;
	private String nomeempresa;
	private String endcomercial;
	private String endresidencial;
	private String Cargo;
	private double salario;
	private String cel;
	

	
	
	private Integer [] interesses;
	

	public String getCel() {
		return cel;
	}


	public void setCel(String cel) {
		this.cel = cel;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDatanasc() {
		return datanasc;
	}


	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getTelempresa() {
		return telempresa;
	}


	public void setTelempresa(String telempresa) {
		this.telempresa = telempresa;
	}


	public String getNomeempresa() {
		return nomeempresa;
	}


	public void setNomeempresa(String nomeempresa) {
		this.nomeempresa = nomeempresa;
	}


	public String getEndcomercial() {
		return endcomercial;
	}


	public String getEndresidencial() {
		return endresidencial;
	}


	public void setEndresidencial(String endresidencial) {
		this.endresidencial = endresidencial;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Integer[] getInteresses() {
		return interesses;
	}


	public void setInteresses(Integer[] interesses) {
		this.interesses = interesses;
	}
	


	
}