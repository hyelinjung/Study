package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//�־��� ���ڿ�(���� ���� ��ǥ�� ���еǾ� ����)�� ������ �Ʒ� ������ ���� ���α׷����� �ۼ��Ͻÿ�
//��) ������,���翵,����ǥ,���翵,�ڹ�ȣ,������,���翵,������,�ֽ���,�̼���,�ڿ���,�ڹ�ȣ,������,����ȯ,���缺,������,������
//1. �达�� �̾��� �������	2."���翵"�̶� �̸��� ��� �ݺ��Ǵ���		3.�ߺ��� ������ �̸��� ���	4.�ߺ��� ������ �̸��� ������������ �����Ͽ� ���
public class Example_04 {

	public static void main(String[] args) {
		String[] s = {"������","���翵","����ǥ","���翵","�ڹ�ȣ","������","���翵","������","�ֽ���","�̼���","�ڿ���","�ڹ�ȣ","������","����ȯ","���缺","������","������"};
		List<String> list = Arrays.asList(s);
		int count =countFamilyname(list);
		System.out.println("�达�� �̾��� ���:"+count);
		System.out.println("\"���翵\"�̶� �̸��� ��� �ݺ��Ǵ���: "+countname(list));
		System.out.println("�ߺ��� ������ �̸��� ���"+Arrays.toString(deletedoublename(list)));
		System.out.println("�ߺ��� ������ �̸��� ������������ �����Ͽ� ���"+acname(deletedoublename(list)));

	}
	
	//1
	public static int countFamilyname(List<String> lists) {
		int sum =0;
		for(int i =0; i<lists.size(); i++) {
			char c = lists.get(i).charAt(0);
			if(c == '��'||c=='��') {
				sum+=1;
			}
		}
		return sum;
	}
	//2
	public static int countname(List<String> lists) {
		int n =0;
		for(String s : lists) {
			if(s.contains("���翵"))
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
