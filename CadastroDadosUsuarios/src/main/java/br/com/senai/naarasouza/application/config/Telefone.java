package br.com.senai.naarasouza.application.config;

public class Telefone {

	public enum Tipo{
		FIXO,CELULAR
	}
	
	private String ddd;
	private String numero;
	private String tipo;
	
	
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
