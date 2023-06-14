package sec14.ch01;

public class Box<T> {
	//field
	private T t;
	
	//method
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
	
}
