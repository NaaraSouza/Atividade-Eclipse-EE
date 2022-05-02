package br.com.senai.naarasouza.application.config;

import java.io.Serializable;
import java.sql.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import org.hibernate.validator.internal.metadata.provider.AnnotationMetaDataProvider;

@Named("cadastrobean")
@RequestScoped
@SessionScoped


public class PageBean implements Serializable {
	
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
	if(pessoa==null) {
		pessoa=new Pessoa();
		
		pessoa.setEndresidencial(new Endereco());
		pessoa.getEndresidencial().setEndresidencial(getLinguagensAsString());
		pessoa.setEndcomercial(new Endereco());
		pessoa.getEndcomercial()pessoa.setEstado(new Estado());
		pessoa.setTel(new Telefone());
		pessoa.setCel(new Telefone());
		pessoa.setTelempresa(new Telefone());
		
	
	}
	return pessoa;
		}
	
	public void SetPessoa(Pessoa pessoa) {
		this.pessoa=pessoa;
		
		
	}
	
	public list<Estado> getEstados(){
		return DataProvider.ESTADOS;
		
	}
	
	
	
	//MÉTODO PARA RETORNAR STRING
	
		public String getLinguagensAsString(){
			String str="";
			boolean first=true;
			for (Integer linguagem: linguagens) {
				if(!first) {
					str+=",";
				}
				str += linguagem.LINGUAGENS;
				first =false;
			}
			return str;
		
		}
		
	
	
	
}
