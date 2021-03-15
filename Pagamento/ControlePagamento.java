/*
Autor: Guilherme Moreira
Classe ControlePagamento: cria uma coleção "array" de despesas pagaveis; adicona novas despesas; calcula o valor referente a contas, a funcionários e o total a pagar; 
*/

import java.util.ArrayList;
import java.util.Iterator;

public class ControlePagamento{

	public static final double SALARIO = 954.0;
	public static final double HORA = 8.0;
	private ArrayList<Pagavel> pagamento;

	public ControlePagamento(){
		pagamento = new ArrayList<>();	
	} 

	public void setPagamento(ArrayList<Pagavel> pagamento){	
		this.pagamento = pagamento;
	}

	public ArrayList<Pagavel> getPagamento(){
		return pagamento;
	}

	public void adicionarConta(Pagavel p){
		pagamento.add(p);
	}

	public double getFuncionario(){
		double valor = 0.0;
		Pagavel aux;
		Iterator<Pagavel> it = pagamento.iterator();
		while(it.hasNext()){
			aux = it.next();
			if(aux instanceof Empregado){
				valor += aux.getValorAPagar();
			}
		}
		return valor;
	}

	public double getConta(){
		double valor = 0.0;
		Pagavel aux;
		Iterator<Pagavel> it = pagamento.iterator();
		while(it.hasNext()){
			aux = it.next();
			if(aux instanceof Conta){
				valor += aux.getValorAPagar();
			}
		}
		return valor;
	}

	public double getTotal(){
		double valor = 0.0; 
		Pagavel aux;
		Iterator<Pagavel> it = pagamento.iterator();
		while(it.hasNext()){
			aux = it.next();
			valor += aux.getValorAPagar();
		}
		return valor;
	}
}
