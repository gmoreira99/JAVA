/*
Autor: Guilherme Moreira;
Classe Mesa: simula um jogo de cartas entre dois jogadores; cada jogador deverá selecionar sua maior carta e exibi-la; vencerá o jogador que tiver exibido a carta de maior valor; caso ocorra empate, vencerá o jogo o jogador que tiver com a carta de ouros;
*/

import java.util.Scanner;

public class Mesa{

	public static void main(String[] args){
		Baralho baralho;
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<35;i++){
				System.out.printf("=");
			}
		System.out.println();

		System.out.printf("Informe o numero de cartas a distribuir para os jogadores: ");
		int qnt = in.nextInt();

		for(int i=0;i<35;i++){
				System.out.printf("=");
			}
		System.out.println();

		Jogador JA = new Jogador(qnt);
		Jogador JB = new Jogador(qnt); 

		do{
			baralho = new Baralho();
			baralho.embaralhar();

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			System.out.println("Cartas Embaralhadas");

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			JA.setMao(baralho.distribuir(qnt));
			JB.setMao(baralho.distribuir(qnt));

			Carta CA = new Carta();
			Carta CB = new Carta();

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			CA = JA.jogar();
			System.out.println("Jogador A: " + CA.getValor() + " de " + CA.getNaipe());
			CB = JB.jogar();
			System.out.println("Jogador B: " + CB.getValor() + " de " + CB.getNaipe());

			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			switch(CA.verificaMaior(CB)){
				case 1 : System.out.println("Jogador A venceu!");
					 System.exit(0);
				case 0: System.out.println("Jogador B venceu!");
					System.exit(0);
				case 2: if(CA.getNaipe().equals("Ouros")){
						System.out.println("Jogador A venceu!");
					 	System.exit(0);
					}
					else
					if(CB.getNaipe().equals("Ouros")){
						System.out.println("Jogador B venceu!");
					 	System.exit(0);
					}
					else
						System.out.println("Empate!\nJogando Novamente...");
			}
		}while(true);
	}
}
