/*
Autor: Guilherme Moreira;
Classe Grampeador: cria um grampeador; grampea folhas;
*/

public class Grampeador{

	private String tipoGrampo;

	public Grampeador(){
		this.tipoGrampo = "";
	}

	public String grampear(Folha[] folhas){
		String grampear = "";
		for(int i=0; i<folhas.length; i++){
			grampear = grampear + "A folha " + (i+1) + " de tamanho " + folhas[i].getTamanho() + " e cor " + folhas[i].getCor() + " foi grampeada com grampo de " + this.getTipoGrampo() + ".\n";
		}
		return grampear;
	}

	public void setTipoGrampo(String tipoGrampo){
		this.tipoGrampo = tipoGrampo;
	}	

	public String getTipoGrampo(){
		return tipoGrampo;
	}

}