package sec06.ch04;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("1번문제");
		double circle = 7.5;
		double pi = 3.14;
		
		double area = pi*pi*circle*circle;
		double round = 2*pi*circle;
		
		System.out.println("원의 넓이는 : " + area);
		System.out.println("원의 둘래는 : " + round);
		System.out.println("");
		
		System.out.println("2번문제");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		double result = (double)(num1+num2+num3)/3;
		System.out.println("세 수의 평균 : " + result);
		System.out.println(" ");
		
		System.out.println("3번문제");
		
		double height = 8.5;
		double width = 5.5;
		double s_round = (height + width)*2;
		double s_area = height*width;
		
		System.out.println("사각형의 넓이는 : " + s_area);
		System.out.println("사각형의 둘레는 : " + s_round);
		System.out.println("");
		
		System.out.println("4번문제");
		int q4_x = 10;
		int q4_y = 20;

		System.out.println("q4_x = " + q4_x);
		System.out.println("q4_y = " + q4_y);
		int tem = q4_x;
		q4_x = q4_y;
		q4_y = tem;
		System.out.println("교환된 q4_x = " + q4_x);
		System.out.println("교환된 q4_y = " + q4_y);
		
		System.out.println("");
		
		System.out.println("5번문제");
		int q5_x = scan.nextInt();
		int q5_y = scan.nextInt();
		int plus = q5_x + q5_y;
		String q5_result = Integer.toBinaryString(plus);
		System.out.println("이진수를 더한 값 : " + q5_result);
		System.out.println("");
		
		System.out.println("6번문제");
		int q6_x = scan.nextInt();
		int q6_y = scan.nextInt();
		int multiple = q6_x * q6_y;
		String q7_result = Integer.toBinaryString(multiple);
		
		System.out.println("이진수를 곱한 값 : " + q7_result);
		System.out.println("");
		
		System.out.println("7번문제");
		
		System.out.println("");
		int q7_num = scan.nextInt();
		String q7_bin = Integer.toBinaryString(q7_num);
		System.out.println("10진수를 2진수로 바꾼 수 : " + q7_bin);
		System.out.println("");
		
		System.out.println("8번문제");
		int q8_num = scan.nextInt();
		String octal = Integer.toOctalString(q8_num);
		System.out.println("8진수로 바꾼 수 : " + octal);
		System.out.println("");
		
		System.out.println("9번문제");
		String q9 = "100";
		int q9_bin = Integer.parseInt(q9, 2);
		System.out.println("이진수 100을 10진수로 바꾼 수 : " + q9_bin);
		System.out.println("");
		
		System.out.println("10번문제");
		String q10 = "1101";
		int q10_bin = Integer.parseInt(q10, 2);
		String hex = Integer.toHexString(q10_bin);
		System.out.println("이진수 1101을 16진수로 바꾼 수 : " + hex);
		System.out.println("");
		
		System.out.println("11번문제");
		String q11 = "111";
		int q11_bin = Integer.parseInt(q11, 2);
		String oct = Integer.toOctalString(q11_bin);
		System.out.println("이진수 111을 8진수로 바꾼 수 : " + oct);
		System.out.println("");
		
		System.out.println("12번문제");
		String version = System.getProperty("java.version");
		String runtime = System.getProperty("java.runtime.version");
		String home = System.getProperty("java.home");
		String vendor = System.getProperty("java.vendor");
		String vendorURL = System.getProperty("java.vendor.url");
		String path = System.getProperty("java.class.path");
		System.out.println("자바 버전 : " + version);
		System.out.println("자바 런타임 버전 : " + runtime);
		System.out.println("자바 홈 : " + home);
		System.out.println("자바 공급업체 : " + vendor);
		System.out.println("자바 벤더주소 : " + vendorURL);
		System.out.println("자바 클래스 경로 : " + path);
		System.out.println("");
		
		System.out.println("13번문제");
		
		int q13_num1 = scan.nextInt();
		int q13_num2 = scan.nextInt();
		
		if(q13_num1 > q13_num2) {
			System.out.println(q13_num1 + ">" + q13_num2);
		}else if(q13_num1 < q13_num2) {
			System.out.println(q13_num1 + "<" + q13_num2);
		}else {
			System.out.println(q13_num1 + "=" + q13_num2);
		}
		System.out.println("");
		
		System.out.println("14번문제");
		String q14_str = "The quick brown fox";
		String q14_result = "";
		for(int i = q14_str.length()-1; i >=0; i--) {
			q14_result += q14_str.charAt(i);
		}
		System.out.println(q14_result);
		System.out.println("");
		
		System.out.println("15번문제");
		Scanner scan2 = new Scanner(System.in);
		String q15_str = scan2.nextLine();
		char[] q15_arr = q15_str.toCharArray();
		int letter = 0;
		int digit = 0;
		int space = 0;
		for(int i = 0; i < q15_arr.length; i++) {
			if(Character.isLetter(q15_arr[i]) == true) {
				letter += 1;
			}
			if(Character.isDigit(q15_arr[i]) == true) {
				digit += 1;
			}
			if(Character.isSpaceChar(q15_arr[i]) == true) {
				space += 1;
			}
		}
		System.out.println("문자 갯수 : " + letter);
		System.out.println("숫자 갯수 : " + digit);
		System.out.println("공백 갯수 : " + space);
		System.out.println("");
		
		System.out.println("16번문제");
		int[] q_16num = {1,2,3,4};
		int q_16num1 = q_16num[(int)(Math.random()*4)];
		int q_16num2 = q_16num[(int)(Math.random()*4)]*10;
		int q_16num3 = q_16num[(int)(Math.random()*4)]*100;
		
		int q16_result = q_16num1+q_16num2+q_16num3;
		
		System.out.println(q16_result);
		
	}

}
