package br.com.senai.naarasouza.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named //É usado parfa fazer a Inversão de Controle e Injeção de Dependências.
@RequestScoped // Um objeto que contém as informações necessárias para invocar um método

public class PageBean implements Serializable{ // O implements Serializable Basicamente serve para habilitar que um objeto de uma determinada classe possa ter seu estado persistido pela api padrão do java

	private String soma;
	Double num1;
	Double num2;
	Double num3;
	
	
	
	
	public Double getNum1() {
		return num1;
	}


	public void setNum1(Double num1) {
		this.num1 = num1;
	}


	public Double getNum2() {
		return num2;
	}


	public void setNum2(Double num2) {
		this.num2 = num2;
	}


	public Double getNum3() {
		return num3;
	}


	public void setNum3(Double num3) {
		this.num3 = num3;
	}


	@Inject //nos permite definir um ponto de injeção que é injetado durante a instanciação do bean.
	private Flash flash;
	

	public String processar() {

		flash.put("somaDaConta",(num1+num2+num3));
		return "result?faces-redirect=true";
	}
	
	
	
}

