package sec13.ch01;

public class ProductExam {
	
	public static void main(String[] args) {
		
		//K == Tv, M == String
		Product<Tv, String> product = new Product<>();
		// == Product<Tv, String> product = new Product<Tv, String>(); 
		
		//Setter setting(Type == Tv, String 으로 제공)
		product.setKind(new Tv());
		product.setModel("LG나노TV");
		
		//Getter return 값이 일치 되어야 함
		Tv tv = product.getKind();
		String tvModel = product.getModel();
		
		//K == Car, M == String
		Product <Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("기아 스포티지");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
	}

}
