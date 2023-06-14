package sec15.linkedlist;

import java.util.*;

public class LinkedListExam {
	
	public static void main(String[] args) {
		
		//Create Object of ArrayList
		List<String> list1 = new ArrayList<>();
		
		//Create Object of LinkedList
		List<String> list2 = new LinkedList<>();
		
		//Variable of StartTime and EndTime
		long startTime;
		long endTime;
		
		//saved time of ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간 : ", (endTime-startTime));
		
		//save Time of LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간 : ", (endTime-startTime));
	}

}
