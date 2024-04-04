package Ejercicio5;

public class Triangulo extends Poligono{
	
	public Triangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double area() {
			
		return ((this.base*this.altura)/2);
	}
}
