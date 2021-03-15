/*
Autor: Guilherme Moreira
Classe Teste: testa a classe TrataFormas
*/

import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		TrataFormas tf = new TrataFormas();
		Forma aux;

		Scanner in = new Scanner(System.in);

		int op;
		double a;		

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

			System.out.println("1. ADICONAR FORMA BIDIMENSIONAL\n2. ADICIONAR FORMA TRIDIMENSIONAL\n3. IMPRIMIR DESCRICAO\n4. SAIR");

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

					System.out.println("1. QUADRADO\n2. CIRCULO\n3. TRIANGULO");

					for(int i=0;i<35;i++){
						System.out.printf("=");
					}
					System.out.println();

					System.out.printf("> ");			
					op = in.nextInt();

					switch(op){
						case 1 : aux = new Quadrado();
							 System.out.printf("LADO: ");
						 	a = in.nextDouble();
						 	((Quadrado)aux).setLado(a);
						 	tf.adicionarForma(aux);
						 	System.out.println("-- FORMA ADICIONADA --");
							 break;
						case 2 : aux = new Circulo();
							 System.out.printf("RAIO: ");
							 a = in.nextDouble();
							 ((Circulo)aux).setRaio(a);
							 tf.adicionarForma(aux);
						 	System.out.println("-- FORMA ADICIONADA --");
							 break;
						case 3 : aux = new Triangulo();
							 System.out.printf("LADO 1: ");
							 a = in.nextDouble();
							 ((Triangulo)aux).setLado1(a);
						 	System.out.printf("LADO 2: ");
						 	a = in.nextDouble();
						 	((Triangulo)aux).setLado2(a);
						 	System.out.printf("LADO 3: ");
						 	a = in.nextDouble();
						 	((Triangulo)aux).setLado3(a);
						 	tf.adicionarForma(aux);
						 	System.out.println("-- FORMA ADICIONADA --");
							 break;
						default : System.out.println("-- ENTRADA INVALIDA --");
				}
					break;
				case 2 : for(int i=0;i<35;i++){
						System.out.printf("=");
					 }
					System.out.println(); 
 
					System.out.println("1. CUBO\n2. ESFERA\n3. TETRAEDRO");

					for(int i=0;i<35;i++){
						System.out.printf("=");
					}
					System.out.println();

					System.out.printf("> ");
					 op = in.nextInt();

					 switch(op){
						case 1 : aux = new Cubo();
							 System.out.printf("LADO: ");
							 a = in.nextDouble();
							 ((Cubo)aux).setCubo(a);
							 tf.adicionarForma(aux);
							 System.out.println("FORMA ADICIONADA");
							 break;
						case 2 : aux = new Esfera();
							 System.out.printf("RAIO: ");
							 a = in.nextDouble();
							 ((Esfera)aux).setRaio(a);
							 tf.adicionarForma(aux);
							 System.out.println("FORMA ADICIONADA");
							 break;
						case 3 : aux = new Tetraedro();
							 System.out.printf("LADO: ");
							 a = in.nextDouble();
							 ((Tetraedro)aux).setTetraedro(a);
							 tf.adicionarForma(aux);
							 System.out.println("FORMA ADICIONADA");
							 break;
						default : System.out.println("ENTRADA INVALIDA");	
					 }
					break;
				case 3 : System.out.println(tf.imprimirDescricao());
					break;
				case 4 : System.exit(0);
				default : System.out.println("ENTRADA INVALIDA");
			}
		}while(true);
	}

}