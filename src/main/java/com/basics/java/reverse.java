package com.basics.java;

public class reverse {

	public static void main(String[] args) {

		String toReverse = "Hello";

		char[] arr = toReverse.toCharArray();
		char[] reversed = new char[arr.length];

		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

		System.out.println("------------------------");

		 ReverseIt(arr, reversed);
		 
		 System.out.println(reversed[1]);

		 
		 for (int i = 0; i < arr.length; i++) {
			 for (int j = i; j < reversed.length; j++) {
				 
				 reversed[i] = 
				
			}
			
		}
		 
		 
//		for (int l = 0; l < reversed.length; l++) {
//			System.out.println(reversed[l]);
//		}

	}



	public static char[] ReverseIt (char[] arr1,char[] arr2) {
		
		int i = arr1.length - 1;  //4
		int j = 0; // 0
		while (i >= 0) {

			arr2[j] = arr2[i];
			i--;
			j++;
		}
		return arr2;
		
		}}
