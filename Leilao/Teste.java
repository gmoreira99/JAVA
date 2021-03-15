/*
Autor: Guilherme Moreira;
Classe Teste: testa a classe leilao por meio de um menu;
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Qual a quantidade de lotes do leilao? ");
		int qnt = entrada.nextInt();
		Leilao leilao = new Leilao(qnt);
		
		String descricao;
		for(int i=0;i<qnt;i++){
			System.out.println("--Lote " + (i+1) + "--");
			System.out.printf("Descricao: ");
			descricao = entrada.next();
			leilao.getLeilao()[i].setDescricao(descricao);
		}		

		
		
		String pessoa;
		double valor;

		do{
			System.out.println("----------\n1. Adicionar Lote\n2. Adicionar Lance\n3. Imprimir Lotes\n4. Encerrar Leilao");
			int op = entrada.nextInt();
			switch(op){
				case 1 : System.out.printf("Descricao do lote: ");
				 	 descricao = entrada.next();
					 Lote lote = new Lote();
				 	 lote.setDescricao(descricao);
				 	 if(leilao.adicionaLote(lote))
						System.out.println("Lote adicionado com sucesso.");
				 	 else
						System.out.println("ERRO : Limite de lotes atingido.");
					 break;
				case 2 : System.out.printf("Lote: ");
					 descricao = entrada.next();
				 	 System.out.printf("Valor do Lance: ");
				 	 valor = entrada.nextDouble();
					 Lance lance = new Lance();
				 	 lance.setValor(valor);
				 	 System.out.printf("Autor: ");
				 	 pessoa = entrada.next();
				 	 lance.getPessoa().setNome(pessoa);
				 	 if(leilao.recebeLance(lance, descricao))
				 		System.out.println("Lance aceito.");
				 	 else 						/*dois erros: lance menor ou lote inexistente*/
						System.out.println("ERRO");
				 	 break;
				case 3 : System.out.println(leilao.imprimiLotes());
					 break;
				case 4 : System.out.println(leilao.encerraLeilao());
				 	 System.exit(0);
				default : System.out.println("Opcao invalida.");		
			}
		}while(true);
	}
}