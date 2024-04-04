package Ejercicio2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Ejercicio1.Hora;
import Ejercicio1.HoraNoValida;

public class HoraExacta extends Hora{
	
	private int segundos;

	public HoraExacta(int hora, int minutos, int segundos) throws HoraNoValida {
		super(hora, minutos);
		this.segundos = segundos;
	}
	
	public boolean setSegundo(int valor) {
		
		boolean valido = true;
		if(valor>59||valor<0) {
			System.out.println("Introduce un valor válido.");
			valido = false;
		}else {
			this.segundos = valor;
		}
		
		return valido;
	}
	
	@Override
	public void inc() {
		this.segundos++;
		if(this.segundos>59) {
			this.segundos = 0;
			this.minutos++;
			if(this.minutos>59) {
				this.minutos = 0;
				this.hora++;
				if(this.hora>23) {
					this.hora = 0;
				}
			}
		}
	}
	
	@Override
	public boolean equals(Object o1) {
		
		HoraExacta hora2 = (HoraExacta)o1;
		
		return this.hora == hora2.hora&&this.minutos == hora2.minutos&&this.segundos == hora2.segundos;
	}
	
	@Override
	public String toString() {
		
		LocalTime Hora = LocalTime.of(this.hora,this.minutos,this.segundos);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horaImprimir = formato.format(Hora);
		return "Hora actual: "+ horaImprimir;
	}
}