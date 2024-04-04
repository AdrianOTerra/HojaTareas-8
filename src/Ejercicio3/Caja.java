package Ejercicio3;

public class Caja {
	
	public enum Unidad{cm,m}
	protected double alto;
	protected double ancho;
	protected double fondo;
	protected Unidad unidad;
	protected String etiqueta;
	
	public Caja(double alto, double ancho, double fondo, Unidad unidad) {
		
		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.unidad = unidad;
	}
	
	public double getVolumen() {
		
		double volumen = this.alto*this.ancho*this.fondo;
		
		if(this.unidad == Unidad.cm) {
			volumen = volumen/1000000;
		}
		
		return volumen;
	}
	
	public boolean setEtiqueta(String etiqueta) {
		
		boolean valido = true;
		if(etiqueta.length()>30) {
			System.out.println("Etiqueta demasiado larga.");
			valido = false;
		}else {
			this.etiqueta = etiqueta;
		}
		
		return valido;
	}
	
	@Override
	public String toString() {
		
		return "Alto: "+ this.alto +"\nAncho: "+ this.ancho +"\nFondo: "+ this.fondo +"\nEtiqueta: "+ this.etiqueta;
	}
}
