package page_11;

public class ExceptionHandling {
	public static void test(String s) {
		try { 
		int len = s.length();
		System.out.println("������ ����:"+len);
		}catch (NullPointerException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace(); //���ܰ� �Ͼ ��ġ���� �����ش�
		}finally {
			System.out.println("������ ����");
		}
		
		}
		

	public static void main(String[] args) {
		System.out.println("���α׷�����");
		test("HELLOJAVA");
		test(null);
		System.out.println("���α׷� ����");

	}

}
