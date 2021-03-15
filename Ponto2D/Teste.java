import java.util.Scanner;

public class Teste{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);		
		System.out.printf("Digite as coordenadas do primeiro ponto: ");
		int x = input.nextInt();
		int y = input.nextInt();
		Ponto2D p1 = new Ponto2D();
		p1.setX(x);
		p1.setY(y);
		System.out.printf("Digite as coordenadas do segundo ponto: ");
		x = input.nextInt();
		y = input.nextInt();
		Ponto2D p2 = new Ponto2D(x,y);
		Ponto2D p3 = new Ponto2D(p1);
		System.out.printf("Distancia entre os pontos: %.2f", p3.calcularDistancia(p2));
	}
}