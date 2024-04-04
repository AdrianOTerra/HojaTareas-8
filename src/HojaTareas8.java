import Ejercicio1.Hora;
import Ejercicio1.HoraNoValida;
import Ejercicio2.HoraExacta;
import Ejercicio3.Caja;
import Ejercicio4.CajaCarton;
import Ejercicio5.Rectangulo;
import Ejercicio5.Triangulo;
import Ejercicio6.Instrumento;
import Ejercicio7.Piano;
import Ejercicio8.Punto;
import Ejercicio8.Punto3d;

public class HojaTareas8 {

	public static void main(String[] args) throws HoraNoValida {
		
		
		
	}
	public static void ejercicio1y2() throws HoraNoValida {
		System.out.println("Este es el ejercicio 1 y el 2");
		Hora hora1 = new Hora(23,59);
		System.out.println(hora1.toString());
		
		hora1.inc();
		System.out.println(hora1.toString());
		HoraExacta hora2 = new HoraExacta(23,59,59);
		System.out.println(hora2.toString());
		HoraExacta hora3 = new HoraExacta(23,58,59);
		System.out.println(hora2.equals(hora3));
		hora3.setMinutos(59);
		System.out.println(hora2.equals(hora3));
		hora2.inc();
		System.out.println(hora2.toString());
	}
	public static void ejercicio3y4() {
		System.out.println("Este es el ejercicio 3 y el 4");
		
		Caja c1 = new Caja(200,300,400,Caja.Unidad.cm);
		System.out.println(c1.getVolumen());
		Caja c2 = new Caja(2,3,4,Caja.Unidad.m);
		System.out.println(c2.getVolumen());
		c1.setEtiqueta("Adrián Ortega c/pelícano 25 Valladolid");
		System.out.println(c1.toString());
		c1.setEtiqueta("Adrián Ortega c/pelícano 25");
		System.out.println(c1.toString());
		
		CajaCarton c3 = new CajaCarton(200,300,400);
		System.out.println(c3.getVolumen());
		System.out.println(c3.getSuperficie());
	}
	
	public static void ejercicio5() {
		System.out.println("Este es el ejercicio 5");
		
		Triangulo t1 = new Triangulo(2,3);
		System.out.println("El área de un triángulo de base 2 y altura 3 es: "+ t1.area());
		
		Rectangulo r1 = new Rectangulo(2,3);
		System.out.println("El área de un rectángulo de base 2 y altura 3 es: "+ r1.area());
		
	}
	
	public static void ejercicio6y7() {
		System.out.println("Este es el ejercicio 6 y el 7");
		
		Piano p1 = new Piano();
		p1.add(Instrumento.Nota.DO);
		p1.add(Instrumento.Nota.RE);
		p1.add(Instrumento.Nota.DO);
		p1.add(Instrumento.Nota.MI);
		p1.add(Instrumento.Nota.SOL);
		
		p1.interpretar();
	}
	
	public static void ejercicio8() {
		System.out.println("Este es el ejercicio 8");
		
		Punto p1 = new Punto(0, 0);
		Punto p2 = new Punto(0, 0);
		Punto p3 = new Punto(1, 1);
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		
		Punto3d p4 = new Punto3d(0, 0, 0);
		Punto3d p5 = new Punto3d(0, 0, 0);
		Punto3d p6 = new Punto3d(1, 1, 1);
		System.out.println(p4.equals(p5));
		System.out.println(p4.equals(p6));
	}
}
