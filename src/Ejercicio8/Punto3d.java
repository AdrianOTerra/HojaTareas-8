package Ejercicio8;

public class Punto3d extends Punto{

	private int coordenadaZ;
	
	public Punto3d(int coordenadaX, int coordenadaY, int coordenadaZ) {
		super(coordenadaX, coordenadaY);
		this.coordenadaZ = coordenadaZ;
	}
	
	@Override
	public double distancia(Object o1) {
		double distancia = 0;
		Punto3d punto2 = (Punto3d)o1;
		
		distancia = Math.sqrt(Math.pow((punto2.coordenadaX-this.coordenadaX),2)+Math.pow((punto2.coordenadaY-this.coordenadaY),2)+Math.pow((punto2.coordenadaZ-this.coordenadaZ),2));
		
		return distancia;
	}
	
	@Override
	public boolean equals(Object o1) {
		
		Punto3d punto2 = (Punto3d)o1;
		return this.coordenadaX == punto2.coordenadaX&&this.coordenadaY == punto2.coordenadaY&&this.coordenadaZ == punto2.coordenadaZ;
	}
	
}
