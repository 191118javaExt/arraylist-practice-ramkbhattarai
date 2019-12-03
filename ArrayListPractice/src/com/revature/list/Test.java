package com.revature.list;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyArrayList list = new MyArrayList();
//		int i = list.get(1);
//		System.out.println(i);
//		list.remove(1);
//		list.set(1, 0);
//		System.out.println(list);
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.set(0, 0);
		System.out.println(arr);
	}

}
