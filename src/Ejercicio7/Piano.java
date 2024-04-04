package Ejercicio7;

import Ejercicio6.Instrumento;

public class Piano extends Instrumento{

	@Override
	public void interpretar() {
		
		for(Nota n:melodia) {
			System.out.print(n +" ");
		}
		
	}

	
	
}
