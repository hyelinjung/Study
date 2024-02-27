package page_13;

public class Util{
	
	
	  public static <K, V> V getValue(Pair<K, V> pair,K k) {
		  if (pair.getK() == k) { 
			  return pair.getV(); 
			  }
		return null; }
	 
	public static <P extends Pair<K, V>, K, V>  V getValue2(P p,K k) {
		if (p.getK() == k) {
			return p.getV();
		}
		return null;
	}
}
