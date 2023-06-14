package sec15.vector;

import java.util.*;

import sec15.arrlist.Board;

public class VectorExam {
	
	public static void main(String [] args) {
		List<Board> list = new Vector<>();
//		List<Board> list = new ArrayList<>();
	
	
		//Create Object1 for Thread
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// add 1000 Object
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//Create Object2 for Thread
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// add 1000 Object
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//run Thread
		threadA.start();
		threadB.start();
		
		//waiting until when Thread is end
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
			
		}
		
		//count saved
		int size = list.size();
		System.out.println("총 객체의 수는 " + size + "입니다");
		
	}
}
