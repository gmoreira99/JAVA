/*
Autor: Guilherme Moreira
Classe Assalariado: cria um funcionario assalariado, que recebe um salario fixo acrescido do valor referente às horas extras trabalhadas;
*/

public class Assalariado extends Empregado{

	private double valor;
	private int horaExtra; 

	public Assalariado(){
		super();
		valor = ControlePagamento.SALARIO;
		horaExtra = 0;
	}

	public double getValorAPagar(){
		valor += (ControlePagamento.HORA*horaExtra);
		return valor;
	}

	public void setHoraExtra(int horaExtra){
		this.horaExtra = horaExtra;
	}

	public int getHoraExtra(){
		return horaExtra;
	}
}
