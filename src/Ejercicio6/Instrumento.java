package Ejercicio6;

import java.util.Arrays;

public abstract class Instrumento {
	
	public enum Nota{DO,RE,MI,FA,SOL,LA,SI}
	protected Nota[] melodia = new Nota[0];
	
	public Instrumento() {
		
	}
	
	public void add(Nota nota) {
		this.melodia = Arrays.copyOf(melodia,melodia.length+1);
		melodia[melodia.length-1] = nota;
	}
	
	public abstract void interpretar();
}
