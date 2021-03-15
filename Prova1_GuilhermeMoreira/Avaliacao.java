public class Avaliacao{

	private Aluno[] avaliacao;
	private double[] notas;

	public Avaliacao(){
		avaliacao = new Aluno[7];
			for(int i=0;i<7;i++){
			avaliacao[i] = new Aluno();
			}
		notas = new double[7];
	}

	public Aluno[] getAvaliacao(){
		return avaliacao;
	}

	public double[] getNotas(){
		return notas;
	}

	public boolean inserirAluno(Aluno aluno, double nota){
		for(int i=0;i<7;i++){
			if(avaliacao[i].getNome().equals("")){
				avaliacao[i]=aluno;
				notas[i]=nota;
				return true;			
			}
		}
				return false;
	}

	public double calcularMedia(){
		double total = 0.0;
		for(int i=0;i<7;i++){
			total+=notas[i];
		}
		return total/7;
	}

}
