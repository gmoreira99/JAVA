/*
Autor: Guilherme Moreira
Classe FormaTridimensional: caracteriza formas tridimensionais 
*/

public abstract class FormaTridimensional extends Forma{

	protected double volume;

	public FormaTridimensional(){
		super();
		volume = 0.0;
	}

	abstract double obterVolume();

}