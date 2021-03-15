/*
Autor: Guilherme Moreira
Classe Cubo: cria um cubo; calcula sua area e seu volume;
*/

public class Cubo extends FormaTridimensional{

	private Quadrado[] cubo = new Quadrado[6];

	public Cubo(){
		super();
		for(int i=0;i<cubo.length;i++){
			cubo[i] = new Quadrado();
		}
	}	

	public Cubo(double lado){
		super();
		for(int i=0;i<cubo.length;i++){
			cubo[i] = new Quadrado();
			cubo[i].setLado(lado);
		}
	}

	public void setCubo(Quadrado[] cubo){
		this.cubo = cubo;
	}

	public void setCubo(double lado){
		for(int i=0;i<cubo.length;i++){
			cubo[i].setLado(lado);
		}
	}

	public Quadrado[] getCubo(){
		return cubo;
	}

	public double obterArea(){
		area = Math.pow(cubo[0].getLado(),2)*6;
		return area;
	}
	
	public double obterVolume(){
		volume = Math.pow(cubo[0].getLado(),3);
		return volume;
	}

}