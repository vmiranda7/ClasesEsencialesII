package dsa.grupo1.tema3.ClasesEsencialesII.Threads8;

public class CuentaAtras extends Thread {
	String id;
	int tiempo;
	
	public CuentaAtras(String v, int c) {
		this.id = v;
		this.tiempo = c;
	}
	
	 public void empezar() {
		 while (tiempo >= 0) {
				System.out.println(id + " - " + tiempo+ " s");
				--tiempo;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	    }

}
