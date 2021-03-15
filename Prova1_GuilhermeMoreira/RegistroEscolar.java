import java.util.Scanner;

public class RegistroEscolar{

	public static void main(String[] args){
	
		Turma turma = new Turma();
		Avaliacao avaliacao = new Avaliacao();
		Scanner in = new Scanner(System.in);

		turma.getTurma()[0].setNome("Vitor Cavalcanti Ribeiro");
		turma.getTurma()[0].setMatricula(11111);

		turma.getTurma()[1].setNome("Davi Fernandes Barros");
		turma.getTurma()[1].setMatricula(22222);

		turma.getTurma()[2].setNome("Nicole Azevedo Santos");
		turma.getTurma()[2].setMatricula(33333);

		turma.getTurma()[3].setNome("Julia Ribeiro Goncalves");
		turma.getTurma()[3].setMatricula(44444);

		turma.getTurma()[4].setNome("Luana Carvalho Pereira");
		turma.getTurma()[4].setMatricula(55555);

		turma.getTurma()[5].setNome("Samuel Pereira Gomes");
		turma.getTurma()[5].setMatricula(66666);

		turma.getTurma()[6].setNome("Ana Gomes Barbosa");
		turma.getTurma()[6].setMatricula(77777);

		int op=0;
		int matricula=0;
		int n=0;
		double nota=0.0;
		do{
			System.out.println("1. Adicionar Nota\n-1.Calcular Media\n3.Sair");
			op = in.nextInt();		
			switch(op){
				case 1: System.out.printf("Matricula do Aluno: ");
						matricula = in.nextInt();
						for(int i=0;i<7;i++){
							if(matricula==turma.getTurma()[i].getMatricula()){
								n=i;
								System.out.printf("Nota do Aluno: ");
								nota = in.nextDouble();
								break;
							}
						}
						if(avaliacao.inserirAluno(turma.getTurma()[n], nota))
							System.out.println("Nota Adicionada");
						else
							System.out.println("ERRO");
						break;
				case -1 : System.out.printf("Media das Notas: %.2f\n", avaliacao.calcularMedia());
					break;
				case 3 : System.exit(0);
				default : System.out.println("Opcao invalida.");
			}
		}while(true);
	}
}
