package page_11;

public class Exception_ex01 {

	public static void main(String[] args) {
		String[] s = {"100","1oo"};
		
		for(int i =0; i<= s.length; i++) {
			try {
				String t = s[i];
				System.out.println(t);
				int a = Integer.parseInt(t);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�ش��ε����� �迭�� ������ �Ѿ���");
			}catch(NumberFormatException n) {
				System.out.println("���ڷ� ������ �� ����.");
			}
			
		}

	}

}
