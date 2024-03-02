package page_11;

public class Excrption_thr {

	public static void main(String[] args) {
		try {
			thr();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	public static void thr() throws ClassNotFoundException {
		Class.forName("Happy");
	}

}
