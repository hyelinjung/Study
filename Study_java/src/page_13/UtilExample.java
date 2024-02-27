package page_13;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>("±æµ¿Â¯",30);
		Integer a = Util.getValue(pair,"±æµ¿Â¯");
		System.out.println(a);
		
		
		ChildPair<String, Integer> ch = new ChildPair<String, Integer>("±æµ¿Â¯",30);
		Integer b = Util.getValue(ch,"»ï¼øÂ¯");
		System.out.println(b);
		
		
		/*
		 * try { OnePair<String, Integer> on = new OnePair<String, Integer>("±æµ¿Â¯",30);
		 * Integer c = Util.getValue(on,"±æµ¿Â¯"); System.out.println(b); }catch (Exception
		 * e) { // TODO: handle exception }
		 */
		
	}

}
