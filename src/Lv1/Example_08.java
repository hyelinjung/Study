package Lv1;
//디지털 시계에 하루동안(00:00~23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second)일까요?
//디지털 시계는 하루동안 다음과 갗이 시:분(00:00~23:59)으로 표시됩니다.
public class Example_08 {

	public static void main(String[] args) {
		int second =0;
		int hour =3600;
		for(int i=0; i<24; i++) { //시간만
			if(i == 3|| i==13||i ==23) {
				second +=i*hour;
			}else {
				for(int j =0; j<6; j++) { //시간에 3이 없을경우 분으로 
					second += 1+(3*j)+j;
				}
			}
			
		}
		System.out.println("총 몇 초:"+second);
	}

}
