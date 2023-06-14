package class02;

public class Exercise06 {

	public static void main(String[] args) {
		int[] arrA = {0, 0, 0, 0, 0, 0, 0, 0, 1, 0};
				int[] arrB = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1};
				int[] arrS = new int[10];
				int c = 0;
				for(int i = 9; i >=0; i--){
					int h = arrA[i] + arrB[i] + c;
					if( h < 2 ) {
					c = 0;
					arrS[i] = h;
					}else {
					c = 1;
					arrS[i] = h - 2;
					}
				}
				System.out.println(arrS);

	}

}
