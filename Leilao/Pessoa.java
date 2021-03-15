/*
Autor: Guilherme Moreira;
Classe Pessoa: cria uma pessoa;
*/

public class Pessoa{

	private String nome;
	private String contato;

	public Pessoa(){
		nome="";
		contato="";
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return nome;
	}

	public void setContato(String contato){
		this.contato=contato;
	}

	public String getContato(){
		return contato;
	}
}
