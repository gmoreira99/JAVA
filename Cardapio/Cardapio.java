/*
Autor: Guilherme Moreira;
Classe Cardapio: cria um cardapio semanal; adiciona, substiui e/ou remove uma refeicao; imprime o cardapio(semanal ou diario) ;  
*/


public class Cardapio{

	private Refeicao[][] cardapio;
	private String[] dia = {"Domingo", "Segunda-Feira", "Terca-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado"};
	private String[] horario = {"Cafe da Manha", "Lanche da Manha", "Almoco", "Lanche da Tarde", "Jantar", "Ceia"};

	public Cardapio(){
		cardapio = new Refeicao[6][7];
		for(int i=0;i<6;i++){
			for(int j=0;j<7;j++){
				cardapio[i][j] = new Refeicao();
			}
		}
	}

	public void setCardapio(Refeicao[][] cardapio){
		this.cardapio = cardapio;
	}

	public Refeicao[][] getCardapio(){
		return cardapio;
	}

	public void adicionarRefeicao(String dia, String horario, Refeicao refeicao){
		if(dia.startsWith("seg")){
			if(horario.startsWith("cafe"))
				cardapio[0][1] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][1] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][1] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][1] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][1] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][1] = refeicao;
		}
		else
		if(dia.startsWith("ter")){
			if(horario.startsWith("cafe"))
				cardapio[0][2] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][2] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][2] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][2] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][2] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][2] = refeicao;
		}
		else
		if(dia.startsWith("qua")){
			if(horario.startsWith("cafe"))
				cardapio[0][3] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][3] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][3] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][3] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][3] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][3] = refeicao;
		}
		else
		if(dia.startsWith("qui")){
			if(horario.startsWith("cafe"))
				cardapio[0][4] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][4] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][4] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][4] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][4] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][4] = refeicao;
		}
		else
		if(dia.startsWith("sex")){
			if(horario.startsWith("cafe"))
				cardapio[0][5] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][5] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][5] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][5] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][5] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][5] = refeicao;
		}
		else
		if(dia.startsWith("sab")){
			if(horario.startsWith("cafe"))
				cardapio[0][6] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][6] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][6] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][6] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][6] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][6] = refeicao;
		}
		else
		if(dia.startsWith("dom")){
			if(horario.startsWith("cafe"))
				cardapio[0][0] = refeicao;
			else
			if(horario.equals("lanche da manha"))
				cardapio[1][0] = refeicao;
			else
			if(horario.equals("almoco"))
				cardapio[2][0] = refeicao;
			else
			if(horario.equals("lanche da tarde"))
				cardapio[3][0] = refeicao;
			else
			if(horario.equals("jantar"))
				cardapio[4][0] = refeicao;
			else
			if(horario.equals("ceia"))
				cardapio[5][0] = refeicao;
		}
	}

	public void removerRefeicao(String dia, String horario){
		if(dia.startsWith("seg")){
			if(horario.startsWith("cafe")){
				cardapio[0][1].setDescricao("");
				cardapio[0][1].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][1].setDescricao("");
				cardapio[1][1].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][1].setDescricao("");
				cardapio[2][1].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][1].setDescricao("");
				cardapio[3][1].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][1].setDescricao("");
				cardapio[4][1].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][1].setDescricao("");
				cardapio[5][1].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("ter")){
			if(horario.startsWith("cafe")){
				cardapio[0][2].setDescricao("");
				cardapio[0][2].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][2].setDescricao("");
				cardapio[1][2].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][2].setDescricao("");
				cardapio[2][2].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][2].setDescricao("");
				cardapio[3][2].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][2].setDescricao("");
				cardapio[4][2].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][2].setDescricao("");
				cardapio[5][2].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("qua")){
			if(horario.startsWith("cafe")){
				cardapio[0][3].setDescricao("");
				cardapio[0][3].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][3].setDescricao("");
				cardapio[1][3].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][3].setDescricao("");
				cardapio[2][3].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][3].setDescricao("");
				cardapio[3][3].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][3].setDescricao("");
				cardapio[4][3].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][3].setDescricao("");
				cardapio[5][3].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("qui")){
			if(horario.startsWith("cafe")){
				cardapio[0][4].setDescricao("");
				cardapio[0][4].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][4].setDescricao("");
				cardapio[1][4].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][4].setDescricao("");
				cardapio[2][4].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][4].setDescricao("");
				cardapio[3][4].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][4].setDescricao("");
				cardapio[4][4].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][4].setDescricao("");
				cardapio[5][4].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("sex")){
			if(horario.startsWith("cafe")){
				cardapio[0][5].setDescricao("");
				cardapio[0][5].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][5].setDescricao("");
				cardapio[1][5].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][5].setDescricao("");
				cardapio[2][5].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][5].setDescricao("");
				cardapio[3][5].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][5].setDescricao("");
				cardapio[4][5].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][5].setDescricao("");
				cardapio[5][5].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("sab")){
			if(horario.startsWith("cafe")){
				cardapio[0][6].setDescricao("");
				cardapio[0][6].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][6].setDescricao("");
				cardapio[1][6].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][6].setDescricao("");
				cardapio[2][6].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][6].setDescricao("");
				cardapio[3][6].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][6].setDescricao("");
				cardapio[4][6].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][6].setDescricao("");
				cardapio[5][6].setCaloria(0.0);
			}
		}
		else
		if(dia.startsWith("dom")){
			if(horario.startsWith("cafe")){
				cardapio[0][0].setDescricao("");
				cardapio[0][0].setCaloria(0.0);
			}
			else
			if(horario.equals("lanche da manha")){
				cardapio[1][0].setDescricao("");
				cardapio[1][0].setCaloria(0.0); 
			}
			else
			if(horario.equals("almoco")){
				cardapio[2][0].setDescricao("");
				cardapio[2][0].setCaloria(0.0);	
			}
			else
			if(horario.equals("lanche da tarde")){
				cardapio[3][0].setDescricao("");
				cardapio[3][0].setCaloria(0.0);
			}
			else
			if(horario.equals("jantar")){
				cardapio[4][0].setDescricao("");
				cardapio[4][0].setCaloria(0.0);	
			}
			else
			if(horario.equals("ceia")){
				cardapio[5][0].setDescricao("");
				cardapio[5][0].setCaloria(0.0);
			}
		}
	}
	
	public String listarDia(String dia){
		String exibir = "";
		if(dia.startsWith("seg")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][1].getDescricao() + "\n-------------------------";
			}		
		}
		else
		if(dia.startsWith("ter")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][2].getDescricao() + "\n-------------------------";
			}		
		}
		else
		if(dia.startsWith("qua")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][3].getDescricao() + "\n-------------------------";
			}
		}
		else
		if(dia.startsWith("qui")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + "|" + cardapio[j][4].getDescricao() + "\n-------------------------";
			}		
		}
		else
		if(dia.startsWith("sex")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][5].getDescricao() + "\n-------------------------";
			}		
		}
		else
		if(dia.startsWith("sab")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][6].getDescricao() + "\n-------------------------";
			}		
		}
		else
		if(dia.startsWith("dom")){
			for(int j=0;j<6;j++){	
				exibir = exibir + "-------------------------\n" + horario[j] + " | " + cardapio[j][0].getDescricao() + "\n-------------------------";
			}		
		}
		return exibir;
	}

	public String listarSemana(){
		String exibir = "";	
		for(int i=0;i<7;i++){
				exibir = exibir + "\t" + dia[i];
			for(int j=0;j<6;j++){
				exibir = exibir + "\n-------------------------\n" + horario[j] + " | " + cardapio[j][i].getDescricao() + "\n-------------------------\n";
			}
		}
		return exibir;
	}

	public double calcularCaloria(){
		double caloriat = 0.0;
		for(int i=0;i<7;i++){
			for(int j=0;j<6;j++){
				caloriat = caloriat + cardapio[j][i].getCaloria();
			}
		}
		return caloriat;
	}
}
