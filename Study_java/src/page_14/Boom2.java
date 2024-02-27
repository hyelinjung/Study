package page_14;

import java.awt.Toolkit;

public class Boom2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int n =5;
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				while(n>0) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					n--;
				}
				
			}
		});
		thread.start();
		int n =5;
		while(n>0) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n--;
		}
		
	}

}
