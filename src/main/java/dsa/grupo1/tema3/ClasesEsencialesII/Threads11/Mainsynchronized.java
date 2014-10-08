package dsa.grupo1.tema3.ClasesEsencialesII.Threads11;

public class Mainsynchronized {
	public static void main(String args[])
	{
		CuentaAtras contador1 = new CuentaAtras("ID1", 4);
		CuentaAtras contador2 = new CuentaAtras("ID2", 7);
		CuentaAtras contador3 = new CuentaAtras("ID3", 8);
	// el metodo run es propio de java y el start usa el metodo run 
	contador1.run();
	contador2.run();
	contador3.run();
	}
}
