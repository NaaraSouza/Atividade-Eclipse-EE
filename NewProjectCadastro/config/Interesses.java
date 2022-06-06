package br.com.senai.naarasouza.application.config;

public class Interesse extends Interesses { //Usa-se extends quando você deseja aplicar herança á sua classe

	private Integer id;
	private String area;



	public Interesse(Integer id, String area) {
		super();
		this.id = id;
		this.area = area;
	}

	public Interesse() {

	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}




}





