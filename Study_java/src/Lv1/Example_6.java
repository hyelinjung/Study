package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//n���� ������ ���� �迭�� �ִ�. �̹迭�� ���� ������ ���� ������ ��� ������ �ִ�. ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
//������ �ǰ� �� ��, ���� ������ ���ʿ� ���� ������ ���ʿ� �־�� �Ѵ�.���� ���������� ���������� �������� ������ ����.
//��)-1,1,3,-2,2 >-1,-2,1,3,2
public class Example_6 {

	public static void main(String[] args) {
		Integer[] integers = {-1,1,3,0,-2,2};
			//sort(integers);
		Example_ex.sort2(integers);
	    }
	public static void sort(Integer[] integers) { //��������
		int len = integers.length-1;
		for(int i =1; i<=len; i++) { //���̺��� -1 Ƚ����ŭ ����
			for(int j =0; j<=len-i; j++) { // ���ĵ� ���� ���� 
				if(integers[j]>=0 && integers[j+1]<0) { //��ȯ
					int k = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = k;
				}
			}
		} 
		System.out.println(Arrays.toString(integers));
	}
	
	 
 }

class Example_ex{
	public static void sort2(Integer[] integers) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<integers.length; i++) {
			if(integers[i]<=0) {
				list.add(integers[i]);
		}
		}
			
		for(int j =0; j<integers.length; j++) {
				if(integers[j]>0) {
					list.add(integers[j]);
			}
		}
				
		System.out.println(list.toString());

		}
	}

