package modelos;

public class Ciruculo extends Figura {
	private double raio;
	
	public Ciruculo() {
		
	};
	
	public Ciruculo(double raio) {
		this.raio = raio;
	};
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return 3.14*Math.pow(getRaio(), 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*(3.14*getRaio());
	}
	
}
