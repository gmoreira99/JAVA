/*
Autor: Guilherme Moreira;
Classe Folha: cria uma folha;
*/

public class Folha{

	private String tamanho;
	private String cor;

	public Folha(){
		this.tamanho = "";
		this.cor = "";
	}

	public void setTamanho(String tamanho){
		this.tamanho = tamanho;
	}

	public String getTamanho(){
		return tamanho;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

	public String getCor(){
		return cor;
	}	

}