package Lv1;
//0~9������ ���ڷ� �� ���ڸ� �Է� �޾��� ��, �� �Է� ���� 0~9������ ���ڰ� ���� �� �� ���� ���� ������ Ȯ���ϴ� �Լ��� ���Ͻÿ�
//sample inputs: 0123456789 01234 01234567890 6789012345 012322456789


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] s = input.split(""); //�ɰ���
		List<String> list = new ArrayList<String>(); //���ڿ� ���� ����Ʈ ����
		String result=null; //����� ���� ����
		if(input.length()<10) { //0~9���� ���̰� �ƴϸ� �ڿ� �ڵ� ���������ʰ� false
			result = "false";
			System.out.println(result);
			return;
		}
		for(String a : s) { //�迭���̸�ŭ ���鼭 ����Ʈ�� �� �ְ� �����ϸ�==�ߺ��̸� false
			if(!list.contains(a)) {
				list.add(a);
			}else {
				result = "false";
				break;
			}
			
		}
		if(result=="false") {
			System.out.println(result);
		}else {
			System.out.println("true");
		}
	}

}
