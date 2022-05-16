package br.com.senai.naarasouza.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named ////É usado parfa fazer a Inversão de Controle e Injeção de Dependências.
@RequestScoped // Um objeto que contém as informações necessárias para invocar um método


public class PageBean implements Serializable{// O implements Serializable Basicamente serve para habilitar que um objeto de uma determinada classe possa ter seu estado persistido pela api padrão do java
	
	String texto;
	String textoInvertido;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto; //O this é usado para referenciar a um atributo externo fora do metodo. Por exemplo ser dentro de um método se estiver dois atributos com o mesmo nome oque estiver com a palavra "this" estará se referenciando a um atributo fora do metodo.
	}
	public String getTextoInvertido() {
		return textoInvertido;
	}
	public void setTextoInvertido(String textoInvertido) {
		this.textoInvertido = textoInvertido;
	}
	
	public String Inverter() {
		//Inverte o Texto e direciona usuário pra própria tela onde ele estava
		textoInvertido=new StringBuilder(texto).reverse().toString();
		return null;
	}

}
