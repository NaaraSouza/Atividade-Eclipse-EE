package br.com.senai.naarasouza.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class PageBean implements Serializable{
	
	String texto;
	String textoInvertido;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTextoInvertido() {
		return textoInvertido;
	}
	public void setTextoInvertido(String textoInvertido) {
		this.textoInvertido = textoInvertido;
	}
	
	public String Inverter() {
		//Inverte o Texto e direciona usuário pra p´ropria tela onde ele estava
		textoInvertido=new StringBuilder(texto).reverse().toString();
		return null;
	}

}