package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램ㅇ르 작성하시오
//예) 이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//1. 김씨와 이씨가 몇명인지	2."이재영"이란 이름이 몇번 반복되는지		3.중복을 제거한 이름을 출력	4.중복을 제거한 이름을 오름차순으로 정렬하여 출력
public class Example_04 {

	public static void main(String[] args) {
		String[] s = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
		List<String> list = Arrays.asList(s);
		int count =countFamilyname(list);
		System.out.println("김씨와 이씨가 몇명:"+count);
		System.out.println("\"이재영\"이란 이름이 몇번 반복되는지: "+countname(list));
		System.out.println("중복을 제거한 이름을 출력"+Arrays.toString(deletedoublename(list)));
		System.out.println("중복을 제거한 이름을 오름차순으로 정렬하여 출력"+acname(deletedoublename(list)));

	}
	
	//1
	public static int countFamilyname(List<String> lists) {
		int sum =0;
		for(int i =0; i<lists.size(); i++) {
			char c = lists.get(i).charAt(0);
			if(c == '김'||c=='이') {
				sum+=1;
			}
		}
		return sum;
	}
	//2
	public static int countname(List<String> lists) {
		int n =0;
		for(String s : lists) {
			if(s.contains("이재영"))
				n++;
		}
		return n;
	}
	//3
	public static String[] deletedoublename(List<String> lists) {
		List<String> list = new ArrayList<String>();
		for(String s: lists) {
			if(!list.contains(s))
				list.add(s);
		}
		String[] aa =list.toArray(new String[list.size()]);
		return aa;
		
	}
	//4
	public static String acname(String[] lists){
		Arrays.sort(lists);
		return  Arrays.toString(lists); 
	}

}
