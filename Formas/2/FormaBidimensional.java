/*
Autor: Guilherme Moreira
Classe FormaBidimensional: caracteriza uma forma bidimensional; lança uma exceção ao tentar calcular seu volume;
*/

public abstract class FormaBidimensional extends Forma{

	public FormaBidimensional(){
		super();
	}

	public double obterVolume() throws NaoExisteVolumeException{
		throw new NaoExisteVolumeException();
	}	

}