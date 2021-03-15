/*
Autor: Guilherme Moreira
Classe Terceirizado: cria um funcionário terceirizado, que recebe um salário referente às horas trabalhadas;
*/
public class Terceirizado extends Empregado{

	private int hora;

	public Terceirizado(){
		super();
		hora = 1;
	}

	public double getValorAPagar(){
		double valor = (ControlePagamento.HORA*hora);
		return valor;
	}

	public void setHora(int hora){
		this.hora = hora;
	}

	public int getHora(){
		return hora;
	}
}
