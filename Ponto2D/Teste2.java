import java.util.Scanner;

public class Teste2{

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
		System.out.printf("Digite as coordenadas do terceiro ponto: ");
		x = input.nextInt();
		y = input.nextInt();
		Ponto2D p3 = new Ponto2D(x,y);
		System.out.printf("d1 = %.2f\nd2 = %.2f\nd3 = %.2f\n", p1.calcularDistancia(p2), p1.calcularDistancia(p3), p2.calcularDistancia(p3));
		if(Triangulo.formaTriangulo(p1, p2, p3)){
			Triangulo t = new Triangulo(p1, p2, p3);
			if(t.equilatero())
				System.out.println("O triangulo e equilatero.");
			else
			if(t.isosceles())
				System.out.println("O triangulo e isosceles.");
			else
			if(t.escaleno())
				System.out.println("O triangulo e escaleno");
		System.out.printf("O perimetro do triangulo e %.2f\n", t.perimetro());
		System.out.printf("A area do triangulo e %.2f\n", t.area());
		}
	}
}