/*
Autor: Guilherme Moreira
Classe Conta: caracteriza as várias faturas de uma empresa por meio de seu valor e data de vencimento;
*/

public abstract class Conta implements Pagavel{

	protected int dia;
	protected int mes;
	protected double valor;

	public Conta(){
		dia = 1;
		mes = 1;
		valor = 0.0;
	}

	public void setValor(double valor){
		this.valor = valor;
	}

	public void setDia(int dia){
		this.dia = dia;
	}

	public int getDia(){
		return dia;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public double getMes(){
		return mes;
	}
}
