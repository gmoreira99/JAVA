/*
Autor: Guilherme Moreira;
Classe Teste: testa a classe relogio;
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		Relogio r = new Relogio();
	System.out.printf("Digite o formato de exibicao(12 ou 24): ");
		Scanner input = new Scanner(System.in);
		int formato = input.nextInt();
		r.setFormato(formato);
		System.out.println(r.exibirHora());
	}
}