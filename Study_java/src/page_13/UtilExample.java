package page_13;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("�浿¯",30);
		Integer a = Util.getValue(pair,"�浿¯");
		System.out.println(a);
		
		
		ChildPair<String, Integer> ch = new ChildPair<String, Integer>("�浿¯",30);
		Integer b = Util.getValue(ch,"���¯");
		System.out.println(b);
		
		
		/*
		 * try { OnePair<String, Integer> on = new OnePair<String, Integer>("�浿¯",30);
		 * Integer c = Util.getValue(on,"�浿¯"); System.out.println(b); }catch (Exception
		 * e) { // TODO: handle exception }
		 */
		
	}

}
