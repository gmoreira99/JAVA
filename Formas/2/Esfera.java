/*
Autor: Guilherme Moreira
Classe Esfera: cria uma esfera; calcula sua area e seu volume;
*/

public class Esfera extends FormaTridimensional{

	private double raio;

	public Esfera(){
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
		area = 4*Math.PI*Math.pow(raio,2);
		return area;
	}

	public double obterVolume(){
		volume = 4*Math.PI*Math.pow(raio,3)/3;
		return volume;
	}

}