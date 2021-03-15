public class Ponto2D{

	private int x;
	private int y;
	
	public Ponto2D(){
		this.x=0;
		this.y=0;
	}

	public Ponto2D(int x, int y){
		this.x=x;
		this.y=y;
	}

	public Ponto2D(Ponto2D p){
		this.x=p.getX();
		this.y=p.getY();
	}

	public void setX(int x){
		this.x=x;
	}

	public int getX(){
		return x;
	}

	public void setY(int y){
		this.y=y;
	}

	public int getY(){
		return y;
	}

	public double calcularDistancia(Ponto2D p){
		double d;
		d=Math.sqrt(Math.pow((p.getX()-this.x),2)+Math.pow((p.getY()-this.y),2));
		return d;
	}	
}