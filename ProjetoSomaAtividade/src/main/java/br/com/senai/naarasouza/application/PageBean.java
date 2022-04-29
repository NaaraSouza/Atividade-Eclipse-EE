package br.com.senai.naarasouza.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class PageBean implements Serializable{

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


	@Inject
	private Flash flash;
	

	public String processar() {

		flash.put("somaDaConta",(num1+num2+num3));
		return "result?faces-redirect=true";
	}
	
	
	
}

