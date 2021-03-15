/*
Autor: Guilherme Moreira;
Classe Lance: cria um lance; compara dois lances e retorna o maior;
*/

public class Lance{

	private Pessoa pessoa;
	private double valor;

	public Lance(){
		pessoa = new Pessoa();
		valor=0.0;
	}

	public void setPessoa(Pessoa pessoa){
		this.pessoa=pessoa;
	}

	public Pessoa getPessoa(){
		return pessoa;
	}

	public void setValor(double valor){
		this.valor=valor;
	}

	public double getValor(){
		return valor;
	}

	public Lance verificaMaior(Lance lance){
		if(this.valor<lance.getValor())
			return lance;
		else
			return this;
	}
} 
