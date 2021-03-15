/*
Autor: Guilherme Moreira;
Classe Contato: cria um contato com nome, telefone e email;
*/

public class Contato{

	private String nome;
	private String telefone;
	private String email;

	public Contato(){
		nome = "";
		telefone = "";
		email = "";
	}

	public void setNome(String nome){
		this.nome = nome;
	} 

	public String getNome(){
		return nome;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	} 

	public String getTelefone(){
		return telefone;
	}

	public void setEmail(String email){
		this.email = email;
	} 

	public String getEmail(){
		return email;
	}
}
