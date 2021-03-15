/*
Autor: Guilherme Moreira
Classe SistemaPagamentoTeste: testa a classe ControlePagamento; 
*/

import java.util.Scanner;

public class SistemaPagamentoTeste{

	public static void main(String[] args){
		ControlePagamento pg = new ControlePagamento();
		Pagavel aux;

		int op;
		int dia, mes;
		double valor;
		int hora;
		double venda;

		Scanner in = new Scanner(System.in);

		do{
			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();
			System.out.println("Selecione a opcao desejada:");
			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			System.out.println("1. ADICIONAR DESPESA\n2. CALCULAR DESPESAS\n3. SAIR");
			for(int i=0;i<35;i++){
				System.out.printf("=");
			}
			System.out.println();

			System.out.printf("> ");
			op = in.nextInt();

			switch(op){		
				case 1 : for(int i=0;i<35;i++){
						System.out.printf("=");
					 }
					 System.out.println();

					 System.out.println("1. CONTA\n2. EMPREGADO");

					 for(int i=0;i<35;i++){
						System.out.printf("=");
					 }
					 System.out.println();

					 System.out.printf("> ");
					 op = in.nextInt();

					 switch(op){  
						case 1 : for(int i=0;i<35;i++){
								System.out.printf("=");
							 }
							 System.out.println();

							 System.out.println("1. TITULO\n2. CONCESSIONARIA");

							 for(int i=0;i<35;i++){
								System.out.printf("=");
							 }
							 System.out.println();

							System.out.printf("> ");
							 op = in.nextInt();

							 switch(op){
								case 1 : aux = new Titulo();
									 System.out.printf("Valor: R$");
									 valor = in.nextDouble();
									 System.out.printf("--VENCIMENTO--\nDIA: ");
									 dia = in.nextInt();
									 System.out.printf("MES: ");
									 mes = in.nextInt();
									 ((Titulo)aux).setDia(dia); ((Titulo)aux).setMes(mes); ((Titulo)aux).setValor(valor);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								case 2 : aux = new Concessionaria();
									 System.out.printf("Valor: R$");
									 valor = in.nextDouble();
									 ((Concessionaria)aux).setValor(valor);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								default : System.out.println("Entrada Invalida");
							 }
							 break;
						case 2 : for(int i=0;i<35;i++){
								System.out.printf("=");
							 }
							 System.out.println();

							 System.out.println("1. ASSALARIADO\n2. COMISSIONADO\n3. ASSALARIADO-COMOSSIONADO\n4. TERCEIRIZADO");

							 for(int i=0;i<35;i++){
								System.out.printf("=");
							 }
							 System.out.println();

							 System.out.printf("> ");
							 op = in.nextInt();

							 switch(op){
								case 1 : aux = new Assalariado();
									 System.out.printf("HORA(s) EXTRA(s): ");
									 hora = in.nextInt();
									 ((Assalariado)aux).setHoraExtra(hora);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								case 2 : aux = new Comissionado();
									 System.out.printf("VENDAS : R$");
									 venda = in.nextDouble();
									 ((Comissionado)aux).setVenda(venda);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								case 3 : aux = new AssalariadoComissionado();
									 System.out.printf("VENDAS : R$");
									 venda = in.nextDouble();
									 ((AssalariadoComissionado)aux).setVenda(venda);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								case 4 : aux = new Terceirizado();
									 System.out.printf("HORA(s): ");
									 hora = in.nextInt();
									 ((Terceirizado)aux).setHora(hora);
									 pg.adicionarConta(aux);
									 System.out.println("-- CONTA ADICIONADA --");
									 break;
								default : System.out.println("Entrada Invalida");
							 }
							 break;
							 default : System.out.println("Entrada Invalida");
					 }
					 break;
				case 2 : System.out.println("Conta : R$" + pg.getConta() + "\nFuncionario : R$" + pg.getFuncionario() + "\nTotal : R$" + pg.getTotal());
					 break;
				case 3 : System.exit(0);
				default : System.out.println("Entrada Invalida");
			}
		}while(true);

	}
}
