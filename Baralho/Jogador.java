/*
Autor: Guilherme Moreira;
Classe Jogador: cria um jogador com uma mao de cartas de quantidade a ser definida pelo usuario;  identifica a carta da mao de maior valor;
*/

public class Jogador{

	private Carta[] mao;

	public Jogador(int qnt){
		mao = new Carta[qnt];
	}

	public void setMao(Carta[] mao){
		this.mao = mao;
	}

	public Carta[] getMao(){
		return mao;
	}

	public Carta jogar(){
		Carta aux = new Carta();
		for(int i=0;i<mao.length;i++){
			if(aux.verificaMaior(mao[i])==0)
				aux = mao[i];
		}
		return aux;
	}
}
