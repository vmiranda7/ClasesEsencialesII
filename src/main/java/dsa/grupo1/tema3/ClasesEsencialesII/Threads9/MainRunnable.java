package dsa.grupo1.tema3.ClasesEsencialesII.Threads9;

/**
 * Ejercicio 9.- Threads
 * Similar al ejercicio 8.- pero en este caso usando implements Runnable.
 */
import java.io.IOException;

public class MainRunnable {
	public static void main(String args[]) throws IOException, InterruptedException {

		CuentaAtrasRunnable contador1 = new CuentaAtrasRunnable("ID1", 4);
		CuentaAtrasRunnable contador2 = new CuentaAtrasRunnable("ID2", 7);
		CuentaAtrasRunnable contador3 = new CuentaAtrasRunnable("ID3", 8);

		// El Start llama al método run()
		contador1.start();
		contador2.start();
		contador3.start();
	}
}

