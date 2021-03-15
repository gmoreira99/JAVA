/*
Autor: Guilherme Moreira
Classe NaoExisteVolumeException: lança uma exceção ao tentar calcular um volume inexistente
*/

public class NaoExisteVolumeException extends Exception{

	public NaoExisteVolumeException(){
		super("Nao Existe Volume");
	}

}