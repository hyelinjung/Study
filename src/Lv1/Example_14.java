package Lv1;

public class Example_14 {
//10~1000���� �� ���� �����Ῡ ���ϱ��� ��ü �� ���ϱ�
//10 = 1 * 0 = 0 11 = 1 * 1 = 1 12 = 1 * 2 = 2 13 = 1 * 3 = 3 14 = 1 * 4 = 4  15 = 1 * 5 = 5
//����  0+1+2+3+4+5 = 15
	
//��ȹ
//1. 0~9 ���� ���� ���� �迭���� ����
//2. �־��� ���� ������ŭ ���� �Լ� ����
//3. ������� �Լ� -> ���� 1������(1���ڸ� ��, ���� �ڸ� ��..���� ���� ��) -> 10���� Ŭ������ ���� -> �ݺ����� ������ '1'�� ������ �°� ����
	public static void main(String[] args) {
		int sum = loop1(10, 12);
		System.out.println(sum);

	}
	
	static int[] arr = new int[10];
	
	public static void loop2(int n) {
		int t =0;
		t=n%10;
		while(n>=10) {
			n = n/10;
			t *= n%10;
		}
		
		arr[t]++;
	}
	
	public static int loop1(int n, int m) {
		int sum =0;
		for(int x =n; x<=m; x++) {
			loop2(x);
		}
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}
