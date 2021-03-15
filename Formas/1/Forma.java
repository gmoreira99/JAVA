/*
Autor: Guilherme Moreira
Classe Forma: caracteriza uma forma bi ou tridimensional
*/

public abstract class Forma{

	protected double area;

	public Forma(){
		area = 0.0;
	}

	abstract double obterArea();

}