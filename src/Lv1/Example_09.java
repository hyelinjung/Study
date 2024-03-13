package Lv1;

import java.util.Scanner;

//프로그램 실행 순서
//입력할 정수의 개수를 사용자로부터 입력 받는다.
//입력받은 정수의 개수만큼 정수를 입력한다.
//입력받은 정수의 함과 평균을 구한다.
//할당된 메모리공간을 비운다.
//요구사항 1.메모리공간은 사용자의 입력 수의 따라 변동된다.2.사용한 공간은 마지막에 비워야 한다 3.배열을 사용하면 안된다.
public class Example_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt(); //입력받은 정수 개수
		int divide = n; //나누기 변수
		int sum=0;
		while(n>0) { //해당 수 만큼 합구하기
			int input = scanner.nextInt();
			sum+=input;
			n--;
		}
		int average = (int)sum/divide; //평균구하기
		System.out.println("정수의 합:"+sum);
		System.out.println("정수의 평균:"+average);
	}

}
