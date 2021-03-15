/*
Autor: Guilherme Moreira
Classe Tetraedro: cria um tetraedro regular; calcula sua area e seu volume
*/

public class Tetraedro extends FormaTridimensional{

	private Triangulo[] tetraedro = new Triangulo[4];

	public Tetraedro(){
		super();
		for(int i=0;i<tetraedro.length;i++){
			tetraedro[i] = new Triangulo();
		}
	}

	public Tetraedro(double lado){
		super();
		for(int i=0;i<tetraedro.length;i++){
			tetraedro[i] = new Triangulo();
			tetraedro[i].setLado1(lado);
			tetraedro[i].setLado2(lado);
			tetraedro[i].setLado3(lado);
		}
	}

	public void setTetraedro(Triangulo[] tetraedro){
		this.tetraedro = tetraedro;
	}

	public void setTetraedro(double lado){
		for(int i=0;i<tetraedro.length;i++){
			tetraedro[i].setLado1(lado);
			tetraedro[i].setLado2(lado);
			tetraedro[i].setLado3(lado);
		}
	}

	public Triangulo[] getTetraedro(){
		return tetraedro;
	}

	public double obterArea(){
		area = Math.sqrt(3)*Math.pow(tetraedro[0].getLado1(),2);
		return area;
	}

	public double obterVolume(){
		volume = Math.pow(tetraedro[0].getLado1(),3)*Math.sqrt(2)/12;
		return volume;
	}

}