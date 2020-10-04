package DP;

import java.util.Arrays;
import java.util.Scanner;

public class korderedlcshackerblocks {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int k = scn.nextInt();

		int arr1[]= new int[n1];
		int arr2[]= new int[n2];
		
		for (int i = 0; i < n1; i++) {
			arr1[i]= scn.nextInt();
		}
		for (int i = 0; i < n2; i++) {
			arr2[i]= scn.nextInt();
		}
		
		int[][][] strg = new int[k + 1][arr1.length + 1][arr2.length + 1];

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				Arrays.fill(strg[i][j], -1);
			}
		}
		System.out.println(kOrderedLCSTD(arr1, arr2, k, 0, 0, strg));
	}

	public static int kOrderedLCSTD(int[] arr1, int[] arr2, int k, int vidx1, int vidx2, int[][][] strg) {

		if (arr1.length == vidx1 || arr2.length == vidx2) {
			return 0;
		}

		if (strg[k][vidx1][vidx2] != -1) {
			return strg[k][vidx1][vidx2];
		}

		int ans = 0;

		if (arr1[vidx1] == arr2[vidx2]) {
			ans = kOrderedLCSTD(arr1, arr2, k, vidx1 + 1, vidx2 + 1, strg) + 1;
		} else {
			int o1 = kOrderedLCSTD(arr1, arr2, k, vidx1, vidx2 + 1, strg);
			int o2 = kOrderedLCSTD(arr1, arr2, k, vidx1 + 1, vidx2, strg);
			int o3 = 0;

			if (k >= 1)
				o3 = kOrderedLCSTD(arr1, arr2, k - 1, vidx1 + 1, vidx2 + 1, strg) + 1;

			ans = Math.max(o1, Math.max(o2, o3));

		}

		strg[k][vidx1][vidx2] = ans;

		return ans;

	}


}