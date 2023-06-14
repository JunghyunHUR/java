package class06;

public class ShopService {
	private static ShopService a = new ShopService();
	
	private ShopService(){}
	
	static ShopService getInstance() {
		return a;
	}
	
}
