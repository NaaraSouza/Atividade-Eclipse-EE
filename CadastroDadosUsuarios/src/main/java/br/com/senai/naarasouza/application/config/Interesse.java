package br.com.senai.naarasouza.application.config;

public class Interesse extends Interesses { //Usa-se extends quando você deseja aplicar herança á sua classe
	
	private Integer id;
	private String area;
	

	
	public Interesse(Integer id, String area) {
		super();
		this.id = id; ////O this é usado para referenciar a um atributo externo fora do metodo. Por exemplo ser dentro de um método se estiver dois atributos com o mesmo nome oque estiver com a palavra "this" estará se referenciando a um atributo fora do metodo.
		this.area = area;
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
