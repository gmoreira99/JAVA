/*
Autor: Guilherme Moreira;
Classe Contador: cria um contador e incrementa seu valor;
*/

public class Contador{

	private int valor;
	private int limite;

	public Contador(int limite){
		valor=0;
		this.limite=limite;
	}

	public int getValor(){
		return valor;
	}

	public void setLimite(int limite){
		this.limite=limite;
	}

	public int getLimite(){
		return limite;
	}

	public void incrementar(){
		if(valor<limite)
			valor++;
		else
			valor=0;
	}
}