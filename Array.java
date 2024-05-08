package com.assignment.mahesh;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {10,20,30};
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==20) {
				continue;
			}else {
				System.out.println(array[i]);
			}
		}

	}

}
