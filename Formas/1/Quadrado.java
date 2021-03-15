/*
Autor: Guilherme Moreira
Classe Quadrado: cria um quadrado; calcula sua area
*/

public class Quadrado extends FormaBidimensional{

	private double lado;

	public Quadrado(){
		super();
		lado = 0.0;
	}

	public void setLado(double lado){
		this.lado = lado;
	}

	public double getLado(){
		return lado;
	}

	public double obterArea(){
		area = Math.pow(lado,2);
		return area;
	}
}