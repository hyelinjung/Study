package Lv1;

public class Example_14 {
//10~1000까지 각 숫자 분해햐여 곲하기의 전체 합 구하기
//10 = 1 * 0 = 0 11 = 1 * 1 = 1 12 = 1 * 2 = 2 13 = 1 * 3 = 3 14 = 1 * 4 = 4  15 = 1 * 5 = 5
//답은  0+1+2+3+4+5 = 15
	
//계획
//1. 0~9 까지 값을 담을 배열변수 선언
//2. 주어진 값의 범위만큼 돌릴 함수 생성
//3. 실행로직 함수 -> 변수 1개생성(1의자리 값, 십의 자리 값..등의 곱한 값) -> 10보다 클때까지 돌림 -> 반복문이 끝나면 '1'의 변수에 맞게 대입
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
