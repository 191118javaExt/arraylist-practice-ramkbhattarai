package com.revature;

import java.util.ArrayList;
import java.util.Random;

import com.revature.list.MyArrayList;

public class Driver {
	
	private static final int AMOUNT = 1000;

	public static void main(String[] args) {
		ArrayList<Integer> reglist = new ArrayList<>();
		MyArrayList mylist = new MyArrayList();

		Random r = new Random(System.currentTimeMillis());
		for(int i = 0; i < AMOUNT; i++) {
			int val = r.nextInt(AMOUNT);
			reglist.add(val);
			mylist.add(val);
		}
		// for testing only 
//		System.out.println("------------first case = adding elements to both arrays--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
		
		long t1 = System.nanoTime();
		
		for(int i = 0; i < AMOUNT; i++) {
			reglist.set(i, AMOUNT % (2 * (i % 10) + 3));
		}
//		System.out.println("------------2nd case setting element to original array--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
		
		
		for(int i = 0; i < AMOUNT; i++) {
			reglist.remove(0);
		}
//		System.out.println("------------3rd case removing elements from original array--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
		
		
		long t2 = System.nanoTime();
		
		long regTime = t2 - t1;
		
		
		t1 = System.nanoTime();
		
		for(int i = 0; i < AMOUNT; i++) {
			mylist.set(i, AMOUNT % (2 * (i % 10) + 3));
		}
//		System.out.println("------------4th case setting elements to my array--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
		
		for(int i = 0; i < AMOUNT; i++) {
			mylist.remove(0);
		}
//		System.out.println("------------5th case removing elements from my array--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
		
		
		t2 = System.nanoTime();
		
		long myTime = t2 - t1;
		
		System.out.println("It took ArrayList " + regTime + " ns to complete.");
		System.out.println("It took MyArrayList " + myTime + " ns to complete.");
		
		double ratio = (double) (myTime - regTime) / (double) regTime;
		
		System.out.printf("The original ArrayList is %.2f%% faster.%n", ratio * 100);
		
		// for my purpose only
//		System.out.println("------------last case--------------------");
//		System.out.println("originalArray = " + reglist);
//		System.out.println("myArray = " + mylist);
//		System.out.println();
	}
}
