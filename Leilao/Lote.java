/*
Autor: Guilherme Moreira;
Classe Lote: cria um lote e guarda o maior lance;
*/

public class Lote{

	private String descricao;
	private Lance maiorLance;

	public Lote(){
		descricao="";
		maiorLance = new Lance();

	}

	public void setDescricao(String descricao){
		this.descricao=descricao;
	}

	public String getDescricao(){
		return descricao;
	}

	public Lance getMaiorLance(){
		return maiorLance;
	}

	public void verificaLance(Lance lance){
		this.maiorLance = maiorLance.verificaMaior(lance);
	}

}
