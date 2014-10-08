package dsa.grupo1.tema3.ClasesEsencialesII.Threads10;

/**
 * Ejercicio 11.- Threads
 * Similar al ejercicio 11.- pero en este caso usando synchronized gestionar el acceso
 * a ultimaEscritura.
 */
import java.io.IOException;

public class MainUltima {
	public static void main(String args[]) throws IOException, InterruptedException {

		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		CuentaAtras contador3 = new CuentaAtras("ID3", 8);

		// El Start llama al método run()
		contador1.start();
		contador2.start();
		contador3.start();
	}
}

