/*
Autor: Guilherme Moreira
Classe Triangulo: cria um triangulo (equilatero ou isosceles); calcula sua area
*/

public class Triangulo extends FormaBidimensional{

	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(){
		super();
		this.lado1 = 0.0;
		this.lado2 = 0.0;
		this.lado3 = 0.0;
	}

	public Triangulo(double lado1, double lado2, double lado3){
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public void setLado1(double lado1){
		this.lado1 = lado1;
	}

	public double getLado1(){
		return lado1;
	}

	public void setLado2(double lado2){
		this.lado2 = lado2;
	}

	public double getLado2(){
		return lado2;
	}

	public void setLado3(double lado3){
		this.lado3 = lado3;
	}

	public double getLado3(){
		return lado3;
	}

	public double obterArea(){
		if(lado1==lado2 && lado1==lado3){
			area = Math.sqrt(3)/4*Math.pow(lado1,2);
		} else
		if(lado1==lado2 && lado1!=lado3){
			area = lado3*Math.sqrt(Math.pow(lado1,2) - Math.pow(lado3/2,2))/2;
		} else
		if(lado1==lado3 && lado1!=lado2){
			area = lado2*Math.sqrt(Math.pow(lado1,2) - Math.pow(lado2/2,2))/2;
		} else
		if(lado2==lado3 && lado2!=lado1){
			area = lado1*Math.sqrt(Math.pow(lado2,2) - Math.pow(lado1/2,2))/2;
		}/*else
		if(escaleno){}*/
		return area;
	}
}