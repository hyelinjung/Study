package Lv1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//a���� �� ���� ������ ���ϴ� ���α׷��� �ۼ��ؾ� �Ѵ�.
//������ ����ó��"."���� ���е� ���ڿ��̴�.
//���� ��) 1.0.0 ,1.0.23  // 0.0.2>0.0.1 // 1.1 >1.0.1 // 1.1<1.1.1
public class Example_12 {
	//��ȹ
	//1. �ܺο��� ���ڿ� 2���� �Է¹޴´�.
	//2. ���ڿ��� "."�������� �ɰ���
	//3. �������� ���ؾ��ϱ� ������ �����迭�� �ٲ۴�.
	//4. �ݺ����� ���ƾ��ϴµ� 2�ڸ� ���� 3�ڸ��� �� ���� ũ�⶧���� 2�ڸ����� ����� ������������ 3�ڸ��� ��ū������ ���� ������ �ؾ��Ѵ�.

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
