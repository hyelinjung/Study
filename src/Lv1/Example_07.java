package Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�Ǻ���ġ �����̶�, ù ��° ���� ���� 0�̰� �� ��° ���� ���� 1�� ��, ������ �׵��� ������ �� ���� ���� ������ �̷�� ���� ������ ���Ѵ�.
//��) 0,1,1,2,3,5,8,13
//��ǲ���� ���� n���� �޾�����, n���ϱ����� �ĺ���ġ ������ ����ϴ� ���α׷��� �ۼ��ϼ���
public class Example_07 {
	
	public static int fabu(int n) {
		if(n<=1) {
			return n;
		}else {
			return fabu(n-2)+fabu(n-1); //3��° ���� 1��°+2��°
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); 
		int t =0;
		while(true) { //��ǲ���� ���� n���� �޾�����, n���ϱ����� �ĺ���ġ ������ ���
			int a =fabu(t);
			t++;
			if(a>n) break;
			System.out.print(a);
		}
		
	}
	

}
