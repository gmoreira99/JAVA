/*
Autor: Guilherme Moreira;
Classe Refeicao: cria uma refeicao;
*/

public class Refeicao{

	private String descricao;
	private double caloria;

	public Refeicao(){
		descricao = "";
		caloria = 0.0;
	}

	public void setDescricao(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}

	public void setCaloria(double caloria){
		this.caloria = caloria;
	}

	public double getCaloria(){
		return caloria;
	}
}
