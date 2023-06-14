package class07;

public class Class3 {

	void Class3 (int x, int y, int z) {
		int i = 0;
		if(x < y && x > z || x > y && x < z) {
			i = x;
			System.out.println(i);
		}else if(y < x && y > z || y > x && y < z) {
			i = y;
			System.out.println(i);
		}else if(z < x && z > y || z > x && z < y) {
			i = z;
			System.out.println(i);
		}
	}
	
	
}
