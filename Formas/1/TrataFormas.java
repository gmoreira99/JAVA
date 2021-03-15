/*
Autor: Guilherme Moreira
Classe TrataFormas: cria uma coleção "array" de formas; verifica se a forma é bi ou tridimensional e exibe sua area e, no caso tri, seu volume
*/

import java.util.ArrayList;
import java.util.Iterator;

public class TrataFormas{

	private ArrayList<Forma> trataFormas;

	public TrataFormas(){
		trataFormas = new ArrayList<>();
	}

	public void setTrataFormas(ArrayList<Forma> trataFormas){
		this.trataFormas = trataFormas;
	}

	public ArrayList<Forma> getTrataFormas(){
		return trataFormas;
	}

	public void adicionarForma(Forma forma){
		trataFormas.add(forma);
	}

	public String imprimirDescricao(){	
		String exibir = "";
		Forma aux;
		Iterator<Forma> it = trataFormas.iterator();
		while(it.hasNext()){
			aux = it.next();
			if(aux instanceof Quadrado){
				exibir += "O objeto e um quadrado";
			} else
			if(aux instanceof Circulo){
				exibir += "O objeto e um circulo";
			} else
			if(aux instanceof Triangulo){
				exibir += "O objeto e um triangulo";
			} else
			if(aux instanceof Cubo){
				exibir += "O objeto e um cubo";
			} else
			if(aux instanceof Esfera){
				exibir += "O objeto e um esfera";
			} else
			if(aux instanceof Tetraedro){
				exibir += "O objeto e um tetraedro";
			}

			if(aux instanceof FormaBidimensional){
				exibir += " com area igual a " + aux.obterArea() + " metros quadrados\n";
			} else
			if(aux instanceof FormaTridimensional){
				exibir += " com area igual a " + aux.obterArea() + " metros quadrados e com volume igual a " + ((FormaTridimensional)aux).obterVolume() + " metros cubicos\n";
			}
		}
		return exibir;
	}

}