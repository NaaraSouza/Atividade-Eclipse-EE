package br.com.senai.naarasouza.model;

public class Linguagem {
	
	
	private Integer id;
	private String nome;
	
	public static final Linguagem[] LINGUAGENS;//É o que cria uma constante (criado para mostrar os cursos que temos a oferecer)
	
	static{ // Static-Inicializar o array de constantes
		
		LINGUAGENS=new Linguagem[5];
		LINGUAGENS[0]=new Linguagem (1,"Java");
		LINGUAGENS[1]=new Linguagem (2,"IOS");
		LINGUAGENS[2]=new Linguagem (3,"C++");
		LINGUAGENS[3]=new Linguagem (4,"C#");
		LINGUAGENS[4]=new Linguagem (5,"PHP");
		
	}
	
	public Linguagem(Integer id, String nome) { // Esse método é o nosso construtor
		this.id=id;
		this.nome=nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}

