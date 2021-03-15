/*
Autor: Guilherme Moreira;
Classe Enquete: cria uma enquete com notas inteiras; informa a quantidade de entrevistados e a frequencia de cada nota (0 a 10); calcula a media das notas
*/

public class Enquete{
	private int[] notas;

	public Enquete(int qnt){
		notas = new int[qnt];
	}

	public void setNotas(int[] notas){
		this.notas = notas;
	}	

	public int[] getNotas(){
		return notas;
	}

	public int quantidadeEntrevistados(){
		return notas.length;
	}

	public String informarFrequencia(){
		int[] f = new int[10];
		int n=0;
		for(int j=1;j<=10;j++){
			for(int i=0; i<notas.length; i++){
				if(notas[i]==j)
					n++;
			}
			f[j-1]=n;
			n=0;
		}
		String frequencia = "";
		for(int i=0;i<10;i++)
			frequencia = frequencia + "Frequencia de notas " + (i+1) + ":" + f[i] + "\n";
		return frequencia;	
	}

	public double calcularMedia(){
		double n=0.0;
		for(int i=0;i<notas.length;i++){
			n+=notas[i];
		}
		return n/notas.length;
	}
}