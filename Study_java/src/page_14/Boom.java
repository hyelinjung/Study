package page_14;

import java.awt.Toolkit;

public class Boom {

	public static void main(String[] args) {
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
		 n =5;
		while(n>0) {
			System.out.println("��");
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
