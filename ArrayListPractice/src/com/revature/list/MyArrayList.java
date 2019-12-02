package com.revature.list;

import java.util.Arrays;

public class MyArrayList {
	private int size;
	private int[] list;
	private int currentSize;

	public void add(int val) {
		// TODO Auto-generated method stub
		if(this.currentSize == 0) {
			this.size = 1;
			this.list = new int[this.size];
			this.list[0] = val;
			this.currentSize = 1;
		}else {
			if(this.currentSize < 3 * size / 4) {
				this.list[this.currentSize] = val;
				this.currentSize++;
			}else {
				this.size = 2 * this.currentSize;
				int [] nlist = new int[this.size];
				for(int i = 0; i < this.list.length; i++) {
					nlist[i] = this.list[i];
				}
				nlist[this.currentSize] = val;
				this.list = nlist;
				this.currentSize++;
				
			}
		}
		
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		if(index < currentSize) {
			this.list[index] = val;
		}
		
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if(index < currentSize) {
			this.list[index]  = Integer.MIN_VALUE;
			int j =0;
			for(int i = 0; i < this.currentSize; i++) {
				if(this.list[i] == Integer.MIN_VALUE) {
					i++;
				}
				this.list[j] = this.list[i];
				j++;
			}
			this.currentSize--;
		}
		
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		if(index < this.currentSize) {
			return this.list[index];
		}
		return -1;
		
	}

	@Override
	public String toString() {
		int[] mylist = new int[this.currentSize];
		for(int i = 0; i < this.currentSize; i++) {
			//sSystem.out.println(this.list[i]);
			mylist[i] = this.list[i];
		}
		return "MyArrayList [list=" + Arrays.toString(mylist) + ", currentSize=" + currentSize + "]";
	}
}
