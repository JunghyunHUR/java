package class07;

public class Class2 {
	
	void Class2(int x, int y, int z) {
		int i = 0;
		if(x > y) {
			i = x;
		}else {
			i = y;
		}
		if(z > i) {
			i = z;
		}
		System.out.println(i);
	}
}
