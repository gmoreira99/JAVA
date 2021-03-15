/*
Autor: Guilherme Moreira
Classe Forma: caracteriza uma forma bi ou tridimensional por meio de sua area e seu volume;
*/

public abstract class Forma{

	protected double area;
	protected double volume;

	public Forma(){
		area = 0.0;
		volume = 0.0;
	}
	

	abstract double obterArea();
	abstract double obterVolume() throws NaoExisteVolumeException;

}