package page_11;

public class ExceptionHandling {
	public static void test(String s) {
		try { 
		int len = s.length();
		System.out.println("문장의 길이:"+len);
		}catch (NullPointerException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace(); //예외가 일어난 위치까지 말해준다
		}finally {
			System.out.println("마무리 실행");
		}
		
		}
		

	public static void main(String[] args) {
		System.out.println("프로그램시작");
		test("HELLOJAVA");
		test(null);
		System.out.println("프로그램 종료");

	}

}
