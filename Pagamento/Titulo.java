/*
Autor: Guilherme Moreira
Classe Titulo: cria uma conta do tipo titulo, cujo status de vencimento interfere no valor a ser pago; verifica se a conta está vencida;
*/

import java.util.Calendar;

public class Titulo extends Conta{

	public Calendar calendario = Calendar.getInstance();
	
	public Titulo(){
		super();
	}

	public double getValorAPagar(){
		if(vencimento())
			valor += (0.1*valor);
		return valor;
	}

	public boolean vencimento(){
		if((calendario.get(calendario.MONTH)+1)>mes)
			return true;
		if((calendario.get(calendario.MONTH)+1)==mes && calendario.get(calendario.DAY_OF_MONTH)>dia)
			return true;
		return false;
	}
}
