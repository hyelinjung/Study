package Lv1;
//주어진 숫자의 중간값을 구하시오
//3개의 숫자를 입력받고 중간값을 구해라
//예)2,5,3 -> 3  4,6,4 -> 4 352

import java.util.List;
import java.util.Scanner;

//문풀 계획
//1.값을 입력받는다
//2.배열 정렬 -> 버블정렬
//3. 중간 배열 값 구하기
public class Example_15 {

	public static void main(String[] args) {
		int n =0;
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		while(n<3) {
			int nm = scanner.nextInt();
			arr[n] = nm;
			n++;
		}
		arr = middleValue(arr);
		System.out.println("결과값"+arr[1]);

	}
	public static int[] middleValue(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr.length-i; j++) { //3
				int temp = 0;
				try {
					if(arr[j]>arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] =temp;
						
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
		return arr;
	}

}
