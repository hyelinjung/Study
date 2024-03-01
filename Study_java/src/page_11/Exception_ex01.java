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
				System.out.println("해당인덱스가 배열의 범위를 넘었다");
			}catch(NumberFormatException n) {
				System.out.println("숫자로 변경할 수 없다.");
			}
			
		}

	}

}
