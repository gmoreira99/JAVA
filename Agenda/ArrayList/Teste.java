/*
Autor: Guilherme Moreira;
Classe Teste: testa a classe agenda;
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		Agenda agenda = new Agenda();
		Contato aux;
		Scanner input = new Scanner(System.in);
		String nome;
		String telefone;
		String email;
		int op;
		do{
			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
			System.out.println("Selecione a opcao desejada:");
			System.out.println("1. Adicionar Novo Contato\n2. Exibir Quantidade de Contatos\n3. Exibir Contato\n4. Excluir Contato\n5. Exibir Contatos\n0. Sair");
			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
			System.out.printf("> ");
			op = input.nextInt();
			switch(op){
				case 1: aux = new Contato();
					System.out.printf("Nome: ");
					nome = input.next();
					System.out.printf("Telefone: ");
					telefone = input.next();
					System.out.printf("E-mail: ");
					email = input.next();
					aux.setNome(nome);
					aux.setTelefone(telefone);
					aux.setEmail(email);
					System.out.println(agenda.adicionarContato(aux));
					break;
				case 2: System.out.println("\n" + agenda.totalContato() + " contatos\n");
					break;
				case 3: System.out.printf("Nome: ");
					nome = input.next();
					System.out.println("\n" + agenda.exibirContato(nome) + "\n");
					break;
				case 4: System.out.printf("Nome: ");
					nome = input.next();
					System.out.println("\n" + agenda.excluirContato(nome) + "\n");
					break;
				case 5: System.out.println(agenda.exibirContatos());
					break;
				case 0: System.exit(0);
				default: System.out.println("Digite uma Opcao Valida");
			}
		}while(true);
	}
}
