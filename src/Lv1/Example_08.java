package Lv1;
//������ �ð迡 �Ϸ絿��(00:00~23:59) 3�� ǥ�õǴ� �ð��� �ʷ� ȯ���ϸ� �� �� ��(second)�ϱ��?
//������ �ð�� �Ϸ絿�� ������ ���� ��:��(00:00~23:59)���� ǥ�õ˴ϴ�.
public class Example_08 {

	public static void main(String[] args) {
		int second =0;
		int hour =3600;
		for(int i=0; i<24; i++) { //�ð���
			if(i == 3|| i==13||i ==23) {
				second +=i*hour;
			}else {
				for(int j =0; j<6; j++) { //�ð��� 3�� ������� ������ 
					second += 1+(3*j)+j;
				}
			}
			
		}
		System.out.println("�� �� ��:"+second);
	}

}
