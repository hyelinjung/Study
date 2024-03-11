package Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어 지는 수열을 말한다.
//예) 0,1,1,2,3,5,8,13
//인풋으로 정수 n으로 받았을때, n이하까지의 파보나치 수열을 출력하는 프로그램을 작성하세요
public class Example_07 {
	
	public static int fabu(int n) {
		if(n<=1) {
			return n;
		}else {
			return fabu(n-2)+fabu(n-1); //3번째 값은 1번째+2번째
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); 
		int t =0;
		while(true) { //인풋으로 정수 n으로 받았을때, n이하까지의 파보나치 수열을 출력
			int a =fabu(t);
			t++;
			if(a>n) break;
			System.out.print(a);
		}
		
	}
	

}
