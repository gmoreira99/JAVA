/*
Autor: Guilherme Moreira;
Classe Relogio: cria um relogio; incrementa a hora; exibe as horas no formato de 12h ou 24h;
*/

public class Relogio{

	private Contador hora;
	private Contador minuto;
	private boolean formato;

	public Relogio(){
		hora = new Contador(23);
		minuto = new Contador(59);
		formato=false;
	}

	public void setHora(Contador hora){
		this.hora=hora;
	}

	public Contador getHora(){
		return hora;
	}

	public void setMinuto(Contador minuto){
		this.minuto=minuto;
	}
	
	public Contador getMinuto(){
		return minuto;
	}

	public void setFormato(int formato){
		if(formato==12){
			this.formato=true;
			hora.setLimite(12);
		}
		else
			this.formato=false;
	}

	public boolean getFormato(){
		return formato;
	}

	public void ticTac(){
		if(minuto.getValor()==0)
			hora.incrementar();
	}

	public String exibirHora(){
		String mostrador = "";
		if(formato){
			//manha 00:00-09:59
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + " a.m." + "\n";
					this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":" + this.getMinuto().getValor() + " a.m." + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
			//manha 10:00-11:59
			for(int i=10;i<12;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + " a.m." + "\n";
				this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + this.getHora().getValor() + ":" + this.getMinuto().getValor() + " a.m." + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
			//meio-dia
			for(int j=0;j<10;j++){
					mostrador = mostrador + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
			for(int j=10;j<60;j++){
					mostrador = mostrador + this.getHora().getValor() + ":" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
				this.ticTac();
			//tarde 01:00-09:59
			for(int i=1;i<10;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
			//noite 10:00-11:59
			for(int i=10;i<12;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + this.getHora().getValor() + ":" + this.getMinuto().getValor() + " p.m." + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
		}
		else{
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + "\n";
					this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + "0" + this.getHora().getValor() + ":" + this.getMinuto().getValor() + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
			for(int i=10;i<24;i++){
				for(int j=0;j<10;j++){
					mostrador = mostrador + this.getHora().getValor() + ":0" + this.getMinuto().getValor() + "\n";
					this.getMinuto().incrementar();
				}
				for(int j=10;j<60;j++){
					mostrador = mostrador + this.getHora().getValor() + ":" + this.getMinuto().getValor() + "\n";
					this.getMinuto().incrementar();
				}
				this.ticTac();
			}
		}
		return mostrador;
	}
}