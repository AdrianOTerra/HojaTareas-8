package Ejercicio8;

public class Punto {
	
	protected int coordenadaX;
	protected int coordenadaY;
	
	public Punto(int coordenadaX, int coordenadaY) {

		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double distancia(Object o1) {
		double distancia = 0;
		Punto punto2 = (Punto)o1;
		
		distancia = Math.sqrt(Math.pow((punto2.coordenadaX-this.coordenadaX),2)+Math.pow((punto2.coordenadaY-this.coordenadaY),2));
		
		return distancia;
	}
	@Override
	public boolean equals(Object o1) {
		
		Punto punto2 = (Punto)o1;
		return this.coordenadaX == punto2.coordenadaX&&this.coordenadaY == punto2.coordenadaY;
	}
	
}

