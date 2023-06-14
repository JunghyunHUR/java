package sec13.ch01;

public class Product <K, M>{
	//Use Generic Type Field
	private K kind;
	private M model;
	
	
	//Use Generic Type Method
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
