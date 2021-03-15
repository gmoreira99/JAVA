/*
Autor: Guilherme Moreira
Classe Circulo: cria um circulo; calcula sua area
*/

public class Circulo extends FormaBidimensional{

	private double raio;

	public Circulo(){
		super();
		raio = 0.0;
	}

	public void setRaio(double raio){
		this.raio = raio;
	}

	public double getRaio(){
		return raio;
	}

	public double obterArea(){
		area = Math.PI*Math.pow(raio,2);
		return area;
	}
}