package Ejercicio4;

import Ejercicio3.Caja;

public class CajaCarton extends Caja{
	
	
	
	public CajaCarton(double alto, double ancho, double fondo) {
		super(alto, ancho, fondo, null);
		this.unidad = Unidad.cm;
	}
	
	@Override
	public double getVolumen() {
		
		return Math.floor((super.getVolumen()*0.8*100))/100;
	}
	
	public double getSuperficie() {
		
		return ((2*this.alto*this.ancho)+(2*this.alto*this.fondo)+(2*this.ancho*this.fondo));
	}
}
