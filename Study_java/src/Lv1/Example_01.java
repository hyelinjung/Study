package Lv1;

public class Example_01 {

	public static void main(String[] args) {
	int sum =0;
	int n =0;
	while(n<1000) {
		if(n%3==0 || n%5==0) {
			sum+=n;
		}
		n++;
	}
	System.out.println("1000�̸��� �ڿ������� 3,5�� ����� ����:"+sum);
	}

}
