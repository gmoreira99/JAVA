/*
Autor: Guilherme Moreira e Raiane Moraes;
Classe Batalha Dupla: Projeto de um jogo matemático de 5 rodadas no qual cada jogador retira duas cartas de um baralho, que serão somadas, subtraídas, multiplicadas ou divididas, conforme a orientação do professor. Vencerá cada rodada quem tiver o maior resultado. Vence o jogo quem ganhar mais rodadas
*/

import java.util.Scanner;

public class BatalhaDupla{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
	
		Jogador aluno1 = new Jogador();
		Jogador aluno2 = new Jogador();

		int ponto1 = 0;
		int ponto2 = 0;

		for(int j=0;j<5;j++){

			Baralho baralho = new Baralho();
			baralho.embaralhar();

			aluno1.setMao(baralho.distribuir());
			aluno2.setMao(baralho.distribuir());

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			System.out.println("Escolha a operacao: ");
			System.out.println("1. Soma\n2. Subtracao\n3. Multiplicacao\n4. Divisao");

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
		
			int op = input.nextInt();

			switch(op){

				case 1 : if(aluno1.soma()>aluno2.soma()){
							System.out.println("Jogador1 Venceu A Rodada!");
							ponto1++;
						 }else
						 if(aluno1.soma()<aluno2.soma()){
							System.out.println("Jogador2 Venceu A Rodada!");
							ponto2++;
						 }else
						 	System.out.println("Empate!");
						 break;

				case 2 : if(aluno1.subtracao()>aluno2.subtracao()){
							System.out.println("Jogador1 Venceu A Rodada!");
							ponto1++;
						 }else
						 if(aluno1.subtracao()<aluno2.subtracao()){
							System.out.println("Jogador2 Venceu A Rodada!");
							ponto2++;
						 }else
						 	System.out.println("Empate!");
						 break;
	
				case 3 : if(aluno1.multiplicacao()>aluno2.multiplicacao()){
							System.out.println("Jogador1 Venceu A Rodada!");
							ponto1++;
						 }else
						 if(aluno1.multiplicacao()<aluno2.multiplicacao()){
							System.out.println("Jogador2 Venceu A Rodada!");
							ponto2++;
						 }else
						 	System.out.println("Empate!");
						 break;
	
				case 4 : if(aluno1.divisao()>aluno2.divisao()){
							System.out.println("Jogador1 Venceu A Rodada!");
							ponto1++;
						 }else
						 if(aluno1.divisao()<aluno2.divisao()){
							System.out.println("Jogador2 Venceu A Rodada!");
							ponto2++;
						 }else
						 	System.out.println("Empate!");
						 break;
	
				default : System.out.println("Operacao Invalida!");

			}
		}

		for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
	
		if(ponto1>ponto2){
			System.out.println("Jogador1 Venceu O Jogo!");
			System.exit(0);
		}else
		if(ponto1<ponto2){
			System.out.println("Jogador2 Venceu O Jogo!");
			System.exit(0);
		}else{
			System.out.println("Empate!");
			System.exit(0);
		}
		
		for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
	}
}	
