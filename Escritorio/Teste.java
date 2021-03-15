/*
Autor: Guilherme Moreira;
Classe Teste: testa as classes grampeador e folha;
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){

		Folha f1 = new Folha();
		Folha f2 = new Folha();

		Folha[] folhas = new Folha[2];
		folhas[0] = f1;
		folhas[1] = f2;
		
		Scanner input = new Scanner(System.in);
		String tamanho;
		String cor;
		for(int i=0; i<folhas.length; i++){
			System.out.printf("Digite o tamanho da folha " + (i+1) + ": ");
			tamanho = input.next();
			folhas[i].setTamanho(tamanho);
			System.out.printf("Digite a cor da folha " + (i+1) + ": ");
			cor = input.next();
			folhas[i].setCor(cor);

		}
		
		Grampeador g1 = new Grampeador();

		String tipoGrampo;
		System.out.printf("Digite o tipo de grampo: ");
		tipoGrampo = input.next();
		
		g1.setTipoGrampo(tipoGrampo);
		System.out.println(g1.grampear(folhas));

	}

}