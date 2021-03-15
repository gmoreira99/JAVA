/*
Autor: Guilherme Moreira e Raiane Moraes;
Classe Jogador: cria um jogador com uma mao de cartas de quantidade a ser definida pelo usuario;  identifica a carta da mao de maior valor;
*/

public class Jogador{

	private Carta[] mao;

	public Jogador(){
		mao = new Carta[2];
	}

	public void setMao(Carta[] mao){
		this.mao = mao;
	}

	public Carta[] getMao(){
		return mao;
	}

	public int soma(){

		int total = 0;
		for(int i=0;i<mao.length;i++){
			total += mao[i].getValor();
		}
		return total;

	}

	public int subtracao(){

		int total = 0;
		switch(mao[0].verificaMaior(mao[1])){
			case 1 : total = mao[0].getValor() - mao[1].getValor();
				 break;
			case 2 : total = 0;
				 break;
			case 3 : total = mao[1].getValor() - mao[0].getValor();
		}
		return total;

	}


	public int multiplicacao(){

		int total = 1;
		for(int i=0;i<mao.length;i++){
			total *= mao[i].getValor();
		}
		return total;

	}

	public int divisao(){

		int total = 0;
		switch(mao[0].verificaMaior(mao[1])){
			case 1 : total = mao[0].getValor()/mao[1].getValor();
				 break;
			case 2 : total = 1;
				 break;
			case 3 : total = mao[1].getValor()/mao[0].getValor();
		}
		return total;

	}

}
