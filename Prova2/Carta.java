/*
Autor: Guilherme Moreira e Raiane Moraes
Classe Carta: cria uma carta com um naipe e um valor; compara duas cartas;
*/

public class Carta{

	private String naipe;
	private int valor;

	public Carta(){
		naipe = "";
		valor = 0;
	}

	public void setNaipe(String naipe){
		this.naipe = naipe;
	}

	public String getNaipe(){
		return naipe;
	}

	public void setValor(int valor){
		this.valor = valor;
	}

	public int getValor(){
		return valor;
	}

	public int verificaMaior(Carta c){
		if(valor > c.valor)
			return 1;
		else
		if(valor == c.valor)
			return 2;
		else
			return 3;
	}
}
