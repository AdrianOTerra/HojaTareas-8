package Ejercicio5;

public class Rectangulo extends Poligono{
	
	public Rectangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double area() {
			
		return (this.base*this.altura);
	}
}
