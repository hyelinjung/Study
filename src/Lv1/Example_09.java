package Lv1;

import java.util.Scanner;

//���α׷� ���� ����
//�Է��� ������ ������ ����ڷκ��� �Է� �޴´�.
//�Է¹��� ������ ������ŭ ������ �Է��Ѵ�.
//�Է¹��� ������ �԰� ����� ���Ѵ�.
//�Ҵ�� �޸𸮰����� ����.
//�䱸���� 1.�޸𸮰����� ������� �Է� ���� ���� �����ȴ�.2.����� ������ �������� ����� �Ѵ� 3.�迭�� ����ϸ� �ȵȴ�.
public class Example_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt(); //�Է¹��� ���� ����
		int divide = n; //������ ����
		int sum=0;
		while(n>0) { //�ش� �� ��ŭ �ձ��ϱ�
			int input = scanner.nextInt();
			sum+=input;
			n--;
		}
		int average = (int)sum/divide; //��ձ��ϱ�
		System.out.println("������ ��:"+sum);
		System.out.println("������ ���:"+average);
	}

}
