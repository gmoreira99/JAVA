public class Triangulo{

	private Ponto2D p1;
	private Ponto2D p2;
	private Ponto2D p3;
	double perimetro;
	double area;

	public Triangulo(){
		this.p1 = new Ponto2D();
		this.p2 = new Ponto2D();
		this.p3 = new Ponto2D();
		this.perimetro=0.0;
		this.area=0.0;
	}

	public Triangulo(Ponto2D p1, Ponto2D p2, Ponto2D p3){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.perimetro=perimetro();
		this.area=area();
	}

	public void setP1(Ponto2D p){
		this.p1=p;
	}

	public Ponto2D getP1(){
		return p1;
	}

	public void setP2(Ponto2D p){
		this.p2=p;
	}

	public Ponto2D getP2(){
		return p2;
	}

	public void setP3(Ponto2D p){
		this.p3=p;
	}

	public Ponto2D getP3(){
		return p3;
	}

	public void setPerimetro(double perimetro){
		this.perimetro=perimetro;
	}

	public double getPerimetro(){
		return perimetro;
	}	

	public void setArea(double area){
		this.area=area;
	}

	public double getArea(){
		return area;
	}

	public static boolean formaTriangulo(Ponto2D p1, Ponto2D p2, Ponto2D p3){
		if(p1.calcularDistancia(p2)+p1.calcularDistancia(p3)<=p2.calcularDistancia(p3))
			return false;
		if(p1.calcularDistancia(p2)+p2.calcularDistancia(p3)<=p1.calcularDistancia(p3))
			return false;
		if(p1.calcularDistancia(p3)+p2.calcularDistancia(p3)<=p1.calcularDistancia(p2))
			return false;
		return true;
	}
	
	public boolean equilatero(){
		if(formaTriangulo(p1, p2, p3))
			if(p1.calcularDistancia(p2)==p1.calcularDistancia(p3)&&p1.calcularDistancia(p2)==p2.calcularDistancia(p3))
				return true;
		return false;
	}

	public boolean isosceles(){
		if(formaTriangulo(p1, p2, p3)){
			if(p1.calcularDistancia(p2)==p1.calcularDistancia(p3))
				return true;
			if(p1.calcularDistancia(p2)==p2.calcularDistancia(p3))
				return true;
			if(p1.calcularDistancia(p3)==p2.calcularDistancia(p3))
				return true;	
		}
		return false;
	}

	public boolean escaleno(){
		if(formaTriangulo(p1, p2, p3)){
			if(p1.calcularDistancia(p2)==p1.calcularDistancia(p3))
				return false;
			if(p1.calcularDistancia(p2)==p2.calcularDistancia(p3))
				return false;
			if(p1.calcularDistancia(p3)==p2.calcularDistancia(p3))
				return false;	
		}
		return true;
	}

	public double perimetro(){
		return (p1.calcularDistancia(p2)+p1.calcularDistancia(p3)+p2.calcularDistancia(p3))/2.0;
	}

	public double area(){
		return Math.sqrt(perimetro()*(perimetro()-p1.calcularDistancia(p2))*(perimetro()-p1.calcularDistancia(p3))*(perimetro()-p2.calcularDistancia(p3)));
	}	
}