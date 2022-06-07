package com.basics.java;

import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;

public class fabonacci_series {

	public static void main(String[] args) {

//		int[] arr1 = new int[20];
//		
//		arr1[0] = 0;
//		arr1[1] = 1;
//		
//		for(int i = 0; i<= 10; i++) {			
//			arr1[i+2] = arr1[i] + arr1[i+1];
//			System.out.println(arr1[i]);
//		}
		
		
		
		
	/*	========  Counting Spaces ======== */
		
		

//		String sentence = "h ey ho      w a re y ou do ing tod ay ?";
//		
//		int count = 0;
//		
//		for(int i = 0; i < sentence.length(); i++) {
//			if (Character.isWhitespace(sentence.charAt(i))) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		
		/* ==========SWAPPER========== */
		
		
		/*
		

		int[] arr = { 1, 2, 3, 4, 5 };

		int i = ArrayUtils.indexOf(arr, 3);
		int y = ArrayUtils.indexOf(arr, 5);
		
		int z = arr[i];
		arr[i] = arr[y];
		arr[y] = z;
		
		fabonacci_series fs = new fabonacci_series();
		
		//fs.swapper(i,y,arr);
		
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
	}
	
	public void swapper(int a, int b, int[] arr) {
		int x = arr[a];
		arr[a] = arr[b];
		arr[b] = x;
		
		*/
		
		
		
		String str1 = "aaabbccccdd";
		
		char ch[] = str1.toCharArray();
		
		int len = str1.length();
		
		for (int i = 0; i < len; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
				
			}
			System.out.println("occurence " + ch[i] + " " + count);
		}
		
		
		
	}
}
