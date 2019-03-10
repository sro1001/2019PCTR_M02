package pr02;

public class HiloDirector extends Thread{

	private Ball bola;
	private Board tablero;
	
	public HiloDirector(Ball b, Board t) {
		this.bola=b;
		this.tablero=t;
	}
	
	public void run() {
		
		try {
			while(true) {
				bola.move();
				tablero.repaint();
				Thread.sleep(15);
			}
		}catch(InterruptedException ex) {
			return;
		}
		
	}
	
}
