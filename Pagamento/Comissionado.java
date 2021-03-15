/*
Autor: Guilherme Moreira
Classe Comissionado: cria um funcionário comissionado, que recebe uma taxa de 6% do valor de suas vendas;
*/

public class Comissionado extends Empregado{

	private double venda;

	public Comissionado(){
		super();
		venda = 0.0;
	}

	public double getValorAPagar(){	
		double valor = 0.06*venda;
		return valor;
	}

	public void setVenda(double venda){
		this.venda = venda;
	}

	public double getVenda(){
		return venda;
	}
}
