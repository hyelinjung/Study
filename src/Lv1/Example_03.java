package Lv1;

import java.util.Scanner;

//게시물의 총 건수와 한 페이지에 보여줄 게시물 수 를 입력으로 주었을 때 총 페이지 수를 리턴하는 
//입력 : 총건수 m 한페이지에 보일 수 n (n은 1보다 크거나 같다)
//출력 : 총페이지 수
public class Example_03 {

	public static void main(String[] args) {
		int output ,m,n =0;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 건수:");
		m =scanner.nextInt();
		System.out.println();
		System.out.print("페이지에 보일 수:");
		 n =scanner.nextInt();
		}while(n<1);
		if(m%n>0) {
			output =(m/n)+1;
		}else {
		output =m/n;
		}
		System.out.println("m	n	총합");
		System.out.println(m+"\t"+n+"\t"+output);
	}

}
