package page_13;

public class Container<T> {

	private T t;
	
	public void set(T t) {
		this.t = t; 
	}
	public T get() {
		return t;
	}
}
class container2<K,V>{
	private K k;
	private V v;
	
	public void set(K k,V v) {
			this.k = k;
			this.v = v;
	}
	public K getKey(){
		return k;
	}
	public V getValue(){
		return v;
	}
}