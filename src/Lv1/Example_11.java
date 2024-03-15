package Lv1;

import java.util.Scanner;

// 1_1000에서 각 숫자의 개수 구하기
//예로 10~15까지의 각 숫자의 개수를 구해보자
//10=1,0 11 =1,1 12=1,2 13=1,3 답은 0;1개 1;4개 2;1개 3;1개
//<문풀 계획>
//1.	문자로 받아서 모든 값을 문자열로 만든다
//2.  	0,1,2,3... 등의 개수를 담을 변수를 생성
//3.	문자열의 길이만큼 반복문을 돌리면서 char타입으로 쪼개고 switch case문으로 "2번" 변수에 저장
public class Example_11 {

	public static void main(String[] args) {
		String input = "";
		System.out.println("수를 몇 번 추가할것:");
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

		System.out.println("0:"+n0+"개 1:"+n1+"개 2:"+n2+"개 3:"+n3+"개 4:"+n4+"개 5:"+n5+"개 6:"+n6+"개 7:"+n7+"개 8:"+n8+"개 9:"+n9+"개");
	}
}
