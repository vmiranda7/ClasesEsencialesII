package dsa.grupo1.tema3.ClasesEsencialesII.Threads8;

/**
 * Ejercicio 8.- Threads
 * Crea la clase CuentaAtras que muestra por consola la cuenta atrás (por ejemplo un 
 * número cada segundo). Para este ejercicio usa extends Thread.
 * Un esquema del programa en principal en el que hay tres cuentas atrás
 * concurrentes podría ser.
 */

import java.io.IOException;

public class MainPruebaThreads {
	public static void main(String args[]) throws IOException, InterruptedException {

		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		CuentaAtras contador3 = new CuentaAtras("ID3", 8);

		// El Start llama al método run()
		contador1.empezar();
		contador2.empezar();
		contador3.empezar();
	}
}
