package Lv1;
//�־��� ������ �߰����� ���Ͻÿ�
//3���� ���ڸ� �Է¹ް� �߰����� ���ض�
//��)2,5,3 -> 3  4,6,4 -> 4 352

import java.util.List;
import java.util.Scanner;

//��Ǯ ��ȹ
//1.���� �Է¹޴´�
//2.�迭 ���� -> ��������
//3. �߰� �迭 �� ���ϱ�
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
		System.out.println("�����"+arr[1]);

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
