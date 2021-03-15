public class Turma{

	private Aluno[] turma;

	public Turma(Aluno[] turma){
		turma = new Aluno[7];
		for(int i=0;i<7;i++){
			turma[i] = new Aluno();
		}
		turma=turma;
	}

	public Turma(){
		turma = new Aluno[7];
		for(int i=0;i<7;i++){
			turma[i] = new Aluno();
		}
	}

	public void setTurma(Aluno[] turma){
		this.turma=turma;
	}

	public Aluno[] getTurma(){
		return turma;
	}
}
