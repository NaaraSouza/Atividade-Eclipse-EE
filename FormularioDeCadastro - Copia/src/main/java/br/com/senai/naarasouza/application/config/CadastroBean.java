package br.com.senai.naarasouza.application.config;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.naarasouza.model.Linguagem;

@SuppressWarnings("serial") //é uma notação que serve para impedir o compilador de emitir algumas advertências.
@RequestScoped // Um objeto que contém as informações necessárias para invocar um método
@Named("cadastro") //É usado parfa fazer a Inversão de Controle e Injeção de Dependências.
public class CadastroBean implements Serializable {

	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private Character sexo;
	private Boolean receberEmails;
	private  String observacoes;
	private Integer [] linguagens;
	
	public Linguagem[] getListaLinguagens() { 
		return Linguagem.LINGUAGENS;// para retornar a constante 
	
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
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	
	//MÉTODO PARA RETORNAR STRING
	
	public String getLinguagensAsString(){
		String str="";
		boolean first=true;
		for (Integer linguagem: linguagens) {
			if(!first) {
				str+=",";
			}
			str += linguagem;
			first =false;
		}
		return str;
	
	}
	
	
	
	
	
}
