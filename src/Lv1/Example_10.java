package Lv1;
//0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한 번 씩만 사용된 것인지 확인하는 함수를 구하시오
//sample inputs: 0123456789 01234 01234567890 6789012345 012322456789


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] s = input.split(""); //쪼개기
		List<String> list = new ArrayList<String>(); //문자열 담을 리스트 생성
		String result=null; //결과값 변수 생성
		if(input.length()<10) { //0~9까지 길이가 아니면 뒤에 코드 실행하지않고 false
			result = "false";
			System.out.println(result);
			return;
		}
		for(String a : s) { //배열길이만큼 돌면서 리스트에 값 넣고 존재하면==중복이면 false
			if(!list.contains(a)) {
				list.add(a);
			}else {
				result = "false";
				break;
			}
			
		}
		if(result=="false") {
			System.out.println(result);
		}else {
			System.out.println("true");
		}
	}

}
