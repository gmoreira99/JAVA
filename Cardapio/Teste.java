/*
Autor: Guilherme Moreira;
Classe Teste: testa a classe Cardapio por meio de um menu;
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		Cardapio c = new Cardapio();
		Refeicao[][] r = new Refeicao[6][7];

		String[] dia = {"Domingo", "Segunda-Feira", "Terca-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
		String[] horario = {"Cafe da Manha", "Lanche da Manha", "Almoco", "Lanche da Tarde", "Jantar", "Ceia"};

		String d, h;

		Scanner input = new Scanner(System.in);
		String descricao;
		double caloria;
		
		//System.out.println("Digite o cardapio: ");
		
		for(int i=0;i<7;i++){
			//System.out.println("-------" + dia[i] + "-------"); caso queira que o usuario digite
			for(int j=0;j<6;j++){
				//System.out.printf("%s : ", horario[j]);
				//descricao = input.next();
				descricao = "pao";
				r[j][i] = new Refeicao();
				r[j][i].setDescricao(descricao);								
				//System.out.printf("Caloria: ");
				//caloria = input.nextDouble();
				caloria = 10.4;
				r[j][i].setCaloria(caloria);
			}
		}

		c.setCardapio(r);

		int op;
		Refeicao aux = new Refeicao();
		do{
			System.out.println("1. Adicionar Refeicao\n2. Remover Refeicao\n3. Substituir Refeicao\n4. Listar Cardapio Semana\n5. Listar Cardapio Dia\n6. Calcular Calorias\n7. Sair");	
			op = input.nextInt();
			switch(op){
				case 1 : System.out.printf("Dia: ");
					 d = input.next();
					 System.out.printf("Horario: ");
					 h = input.next();	 
					 System.out.printf("Descricao: ");
					 descricao = input.next();
					 aux.setDescricao(descricao);								 	 System.out.printf("Caloria: ");
					 caloria = input.nextDouble();
					 aux.setCaloria(caloria);
					 c.adicionarRefeicao(d, h, aux);
					 break;
				case 2 : System.out.printf("Dia: ");
					 d = input.next();
					 System.out.printf("Horario: ");
					 h = input.next();
					 c.removerRefeicao(d, h);
					 break;
				case 3 : System.out.printf("Dia: ");
					 d = input.next();
					 System.out.printf("Horario: ");
					 h = input.next();
					 aux = new Refeicao();	 
					 System.out.printf("Descricao: ");
					 descricao = input.next();
					 aux.setDescricao(descricao);								 	 System.out.printf("Caloria: ");
					 caloria = input.nextDouble();
					 aux.setCaloria(caloria);
					 c.adicionarRefeicao(d, h, aux);
					 break;
				case 4 : System.out.println(c.listarSemana());
					 break;
				case 5 : System.out.printf("Dia: ");
					 d = input.next();
					 System.out.println(c.listarDia(d));
					 break;
				case 6 : System.out.printf("Calorias: %.2f\n", c.calcularCaloria());
					 break;
				case 7 : System.exit(0);
				default : System.out.println("ERRO");
			}
		}while(true);
	}
}