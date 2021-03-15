/*
Autor: Guilherme Moreira;
Classe Leilao: cria um leilao com n lotes; adiciona um lote se possivel; recebe um lance se for maior que o atual; imprime e encerra o leilao; 
*/

public class Leilao{

	private Lote[] leilao;

	public Leilao(int qnt){
		leilao = new Lote[qnt];
		for(int i=0;i<leilao.length;i++)
			leilao[i] = new Lote();
	}

	public void setLeilao(Lote[] leilao){
		this.leilao=leilao;
	}

	public Lote[] getLeilao(){
		return leilao;
	}

	public boolean adicionaLote(Lote lote){
		for(int i=0;i<leilao.length;i++){
			if(leilao[i].getDescricao().equals("")){
				leilao[i]=lote;
				return true;
			}
		}
		return false;
	}

	public boolean recebeLance(Lance lance, String descricao){
		for(int i=0;i<leilao.length;i++){
			if(leilao[i].getDescricao().equals(descricao)){
				leilao[i].verificaLance(lance);
				if(leilao[i].getMaiorLance().getPessoa().equals(lance.getPessoa()))
					return true;
				
			}

		}
		return false;
	}

	public String imprimiLotes(){
		String lotes = "";
		for(int i=0;i<leilao.length;i++){
			lotes = lotes + "-- Lote " + (i+1) + "--" + "\nDescricao: " + leilao[i].getDescricao() + "\nMaior Lance Atual: R$" + leilao[i].getMaiorLance().getValor() + "\nAutor do Lance: " + leilao[i].getMaiorLance().getPessoa().getNome() + "\n";
		}
		return lotes;
	}

	public String encerraLeilao(){
		String lotes = "";
		for(int i=0;i<leilao.length;i++){
			lotes = lotes + "O lote " + leilao[i].getDescricao() + " foi vendido para " + leilao[i].getMaiorLance().getPessoa().getNome() + " por R$" + leilao[i].getMaiorLance().getValor() + "\n";
		}
		return lotes;
	}
}
