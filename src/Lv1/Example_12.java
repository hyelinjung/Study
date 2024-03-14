package Lv1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//a씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다.
//버전은 다음처럼"."으로 구분된 문자열이다.
//버전 예) 1.0.0 ,1.0.23  // 0.0.2>0.0.1 // 1.1 >1.0.1 // 1.1<1.1.1
public class Example_12 {
	//계획
	//1. 외부에서 문자열 2개를 입력받는다.
	//2. 문자열을 "."기준으로 쪼갠다
	//3. 정수값을 비교해야하기 때문에 정수배열로 바꾼다.
	//4. 반복문을 돌아야하는데 2자리 보단 3자리가 더 값이 크기때문에 2자리에서 결론이 나오지않으면 3자리가 더큰것으로 값이 나오게 해야한다.

	public static void main(String[] args) {
		//1
		Scanner scanner = new Scanner(System.in);
		String ori_a =scanner.nextLine();
		String ori_b =scanner.nextLine();
		//2
		String[] a = ori_a.split("[.]");
		String[] b = ori_b.split("[.]");
		//3
		int[] i_a = sIntoi(a);
		int[] i_b = sIntoi(b);
		//4
		int t =0;
			int len = Math.min(i_a.length, i_b.length);
			 t = (len ==i_a.length) ? 1 : 2; //1.0.1 > 1.0
			for(int i =0; i< len; i ++) { 
			
			if(i_a[i] > i_b[i]) {
				System.out.println(ori_a+">"+ori_b); t=0;
				break;
			}else if(i_a[i] < i_b[i]){
				System.out.println(ori_a+"<"+ori_b); t=0;
				break;
			}else if(i_a[i] == i_b[i]) {
				System.out.println(ori_a+"="+ori_b); t=0;
				break;
			}
			}
			
			if(t ==0) {
				return;
			}else {
				if(t==1) {
					System.out.println(ori_a+"<"+ori_b);
				}else {
					System.out.println(ori_a+">"+ori_b);
				}
			}
			
		
	}
	public static int[] sIntoi(String[] s) {
		int[] is =new int[s.length];
		int i =0;
		for(String ss : s) {
			int a = Integer.parseInt(ss);
			is[i] =a;
			i++;
		}
		return is;
	}

}
