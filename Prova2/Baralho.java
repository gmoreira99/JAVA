/*
Autor: Guilherme Moreira;
Classe Baralho: cria um baralho com 52 cartas e 4 naipes (13 cartas para cada naipe);  embaralha e distribui as cartas;
*/

import java.security.SecureRandom;

public class Baralho{

	private Carta[] baralho;
	private String[] naipe = {"Copas", "Ouros", "Paus", "Espadas"};
	public SecureRandom gerador = new SecureRandom();

	public Baralho(){
		baralho = new Carta[52];
		for(int i=0;i<52;i++){
			baralho[i] = new Carta();
		}
		for(int i=0, n=0;i<52;n++){
			for(int j=1;j<=13;j++, i++){
				baralho[i].setValor(j);
				baralho[i].setNaipe(naipe[n]);
			}
		}
	}	

	public void setBaralho(Carta[] baralho){
		this.baralho = baralho;
	}

	public Carta[] getBaralho(){
		return baralho;
	}

	public void embaralhar(){
		
		Carta aux = new Carta();
		int j;
		for(int i=0; i<52; i++){
			j = gerador.nextInt(52);
			aux = baralho[j];
			baralho[j] = baralho[i];
			baralho[i] = aux;
		}
	}

	public Carta[] distribuir(){
		Carta[] mao = new Carta[2];
		int j;
		for(int i=0;i<2;i++){
			j = gerador.nextInt(52);				
			if(baralho[j]==null)
				i--;
			else{
				mao[i] = baralho[j];
				baralho[j] = null;
			}
		}
		return mao;
	}
}
