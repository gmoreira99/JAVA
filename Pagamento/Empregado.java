/*
Autor: Guilherme Moreira
Classe Empregado: caracteriza um empregado da empresa por meio de seu nome, sobrenome e numero de identificação;
*/
public abstract class Empregado implements Pagavel{

	protected String nome;
	protected String sobrenome;
	protected int numId;

	public Empregado(){
		nome = "";
		sobrenome = "";
		numId = 0;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public String getSobrenome(){
		return sobrenome;
	}

	public void setnumId(int numId){
		this.numId = numId;
	}

	public int getNumId(){
		return numId;
	}
}
