public class Aluno{

	private String nome;
	private int matricula;

	public Aluno(){
		nome="";
		matricula=0;
	}

	public Aluno(String nome, int matricula){
		this.nome=nome;
		this.matricula=matricula;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return nome;
	}

	public void setMatricula(int matricula){
		this.matricula=matricula;
	}

	public int getMatricula(){
		return matricula;
	}
}
