package dsa.grupo1.tema3.ClasesEsencialesII.Threads9;

public class CuentaAtrasRunnable extends Thread {
	String id;
	int tiempo;
	
	public CuentaAtrasRunnable(String v, int c) throws InterruptedException {
		
		this.id = v;
		this.tiempo = c;		
	}
	 public void run() {
		 while (tiempo >= 0) {
				System.out.println(id + " - " + tiempo);
				--tiempo;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
	    }

}
