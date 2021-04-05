package MultiTread;

public class Nothread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	public static void main(String[] args) {
		Nothread nothread= new Nothread();
		nothread.start();
	}
}
