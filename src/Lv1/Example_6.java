package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//n개의 정수를 가진 배열이 있다. 이배열은 양의 정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
//정렬이 되고 난 후, 음의 정수는 앞쪽에 양의 정수는 뒷쪽에 있어야 한다.또한 양의정수와 음의정수의 순서에는 변함이 없다.
//예)-1,1,3,-2,2 >-1,-2,1,3,2
public class Example_6 {

	public static void main(String[] args) {
		Integer[] integers = {-1,1,3,0,-2,2};
			//sort(integers);
		Example_ex.sort2(integers);
	    }
	public static void sort(Integer[] integers) { //버블정렬
		int len = integers.length-1;
		for(int i =1; i<=len; i++) { //길이보다 -1 횟수만큼 돈다
			for(int j =0; j<=len-i; j++) { // 정렬된 숫자 제외 
				if(integers[j]>=0 && integers[j+1]<0) { //교환
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

