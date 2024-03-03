package Lv1;

public class Example_02 {

	public static void main(String[] args) {
		
		String n= replace("\ttab\t\ttabtab");
		
	}
	public static String replace(String s) {
		System.out.println(s);
		s.replaceAll("\t","");
		return s;
	}

}
