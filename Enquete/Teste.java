/*
Autor: Guilherme Moreira;
Classe Teste: testa a classe enquete;
*/

import java.util.Scanner;
import java.util.Random;

public class Teste{	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Digite a quantidade de alunos entrevistados: ");
		int qnt = input.nextInt();
		int[] notas = new int[qnt];
		Enquete e = new Enquete(qnt);
		Random gerador = new Random();
		for(int i=0; i<qnt; i++){
			notas[i] = gerador.nextInt(10)+1;
		}

		e.setNotas(notas);
		System.out.println(e.informarFrequencia());
		System.out.printf("Media das notas: %.2f\n", e.calcularMedia());
		System.out.printf("Quantidade de entrevistados: %d", e.quantidadeEntrevistados());
	}
}