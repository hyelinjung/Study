package Lv1;

import java.util.Scanner;

// 1_1000���� �� ������ ���� ���ϱ�
//���� 10~15������ �� ������ ������ ���غ���
//10=1,0 11 =1,1 12=1,2 13=1,3 ���� 0;1�� 1;4�� 2;1�� 3;1��
//<��Ǯ ��ȹ>
//1.	���ڷ� �޾Ƽ� ��� ���� ���ڿ��� �����
//2.  	0,1,2,3... ���� ������ ���� ������ ����
//3.	���ڿ��� ���̸�ŭ �ݺ����� �����鼭 charŸ������ �ɰ��� switch case������ "2��" ������ ����
public class Example_11 {

	public static void main(String[] args) {
		String input = "";
		System.out.println("���� �� �� �߰��Ұ�:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while(n>0) {
			Scanner scanner2 = new Scanner(System.in);
			String preInput = scanner2.next();
			input+=preInput;
			System.out.println(input);
			n--;
		}
		add(input);

	}
	
	public static void add(String input) {
		int i =0;
		int n1=0, n2=0,n3=0,n4=0,n5 = 0,n6=0,n7=0,n8=0,n9=0,n0=0 ;
		while(i<input.length()) {
			switch (input.charAt(i)){
			case '0': 
				n0++;
				break;
			case '1': 
				n1++;
				break;
			case '2': 
				n2++;
				break;
			case '3': 
				n3++;
				break;
			case '4': 
				n4++;
				break;
			case '5': 
				n5++;
				break;
			case '6': 
				n6++;
				break;
			case '7': 
				n7++;
				break;
			case '8': 
				n8++;
				break;
			case '9': 
				n9++;
				break;
			
		}
			i++;
	}

		System.out.println("0:"+n0+"�� 1:"+n1+"�� 2:"+n2+"�� 3:"+n3+"�� 4:"+n4+"�� 5:"+n5+"�� 6:"+n6+"�� 7:"+n7+"�� 8:"+n8+"�� 9:"+n9+"��");
	}
}
