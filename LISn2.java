package DP;

import java.util.Arrays;
import java.util.Scanner;

public class LISn2 {

	public static void main(String[] args) {

		//int[] arr = { 3, 4, -1, 0, 6, 2, 3 };
		//int[] arr = {1,3,6,7,9,4,10,5,6};
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}		
		System.out.println(LISBU(arr));
	}

	public static int LISBU(int[] arr) {

		int max = Integer.MIN_VALUE;

		int[] strg = new int[arr.length];

		Arrays.fill(strg, 1);

		for (int i = 0; i < strg.length; i++) {

			for (int j = 0; j < i; j++) {

				if (arr[j] < arr[i]) {
					strg[i] = Math.max(strg[i], strg[j] + 1);

					max = Math.max(max, strg[i]);
				}
			}
		}

//		for(int val : strg) {
//			System.out.print(val + " ");
//		//	if(val > max2)
//				//max2=val;
//		}
//		System.out.println();
		return max;

	}
}