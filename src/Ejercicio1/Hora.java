package Ejercicio1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hora {

	protected int hora;
	protected int minutos;
	
	public Hora(int hora, int minutos) throws HoraNoValida {
		if(hora>23||hora<0) {
			throw new HoraNoValida();
		}
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public void inc() {
		
		this.minutos++;
		if(this.minutos>59) {
			this.hora++;
			if(this.hora>23) {
				this.hora = 0;
			}
			this.minutos = 0;
		}
	}
	
	public boolean setMinutos(int valor) {
		
		boolean valido = true;
		if(valor>59||valor<0) {
			System.out.println("Introduce un valor válido.");
			valido = false;
		}else {
			this.minutos = valor;
		}
		
		return valido;
	}
	
	public boolean setHora(int valor) {
		
		boolean valido = true;
		if(valor>23||valor<0) {
			System.out.println("Introduce un valor válido.");
			valido = false;
		}else {
			this.hora = valor;
		}
		
		return valido;
	}

	@Override
	public String toString() {
		
		LocalTime Hora = LocalTime.of(this.hora,this.minutos,0);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
		String horaImprimir = formato.format(Hora);
		return "Hora actual: "+ horaImprimir;
	}
}
