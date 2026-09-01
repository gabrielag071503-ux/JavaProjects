package entites;

public class Retangulo {
	public double a;
	public double b;

	public double area() {
		return b * a;
	}

	public double perimetro() {
		return (2 * b) + (2 * a);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
	}

}
