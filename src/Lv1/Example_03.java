package Lv1;

import java.util.Scanner;

//�Խù��� �� �Ǽ��� �� �������� ������ �Խù� �� �� �Է����� �־��� �� �� ������ ���� �����ϴ� 
//�Է� : �ѰǼ� m ���������� ���� �� n (n�� 1���� ũ�ų� ����)
//��� : �������� ��
public class Example_03 {

	public static void main(String[] args) {
		int output ,m,n =0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� �Ǽ�:");
		m =scanner.nextInt();
		System.out.println();
		System.out.print("�������� ���� ��:");
		 n =scanner.nextInt();
		}while(n<1);
		if(m%n>0) {
			output =(m/n)+1;
		}else {
		output =m/n;
		}
		System.out.println("m	n	����");
		System.out.println(m+"\t"+n+"\t"+output);
	}

}
