/*
Autor: Guilherme Moreira
Classe AssalariadoComissionado: cria um funcionario assalariado e comissionado, que recebe um salário fixo, uma taxa de 6% sobre suas vendas e, temporariamente, um bonus de 10% sobre o valor total
*/

public class AssalariadoComissionado extends Comissionado{

	private double valor;

	public AssalariadoComissionado(){
		super();
		valor = ControlePagamento.SALARIO;
	}

	public double getValorAPagar(){
		valor += 0.06*getVenda();
		valor += 0.1*valor;
		return valor;
	}

}
