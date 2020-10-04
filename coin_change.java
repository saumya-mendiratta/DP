package DP;

import java.util.Arrays;
import java.util.Scanner;

public class coin_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { 1, 2, 3 };
		//System.out.println(coin(arr, 0, arr.length, 4));
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[m];
		for(int i =0 ; i <m ; i++)
			arr[i]=scn.nextInt();
		
		int[][] strg= new int[m+1][n+1];
		
		for(int i=0 ; i<strg.length ; i++)
			Arrays.fill(strg[i], -1);
		
		System.out.println(coinTD(arr, 0, m, n, strg));
		
	}

	public static int coin(int[] arr, int si, int n, int denom) {

		if (si >= n)
			return 0;

		if (denom < 0)
			return 0;

		if (denom == 0)
			return 1;

		int fp = coin(arr, si, n, denom - arr[si]);
		int sp = coin(arr, si + 1, n, denom);

		return fp + sp;

	}

	public static int coinTD(int[] arr, int si, int n, int denom, int[][] strg) {

		if (si >= n)
			return 0;

		if (denom < 0)
			return 0;

		if (denom == 0)
			return 1;

		if (strg[si][denom] != -1)
			return strg[si][denom];

		int fp = coinTD(arr, si, n, denom - arr[si], strg);
		int sp = coinTD(arr, si + 1, n, denom, strg);

		int ans = fp + sp;
		strg[si][denom] = ans;

		return ans;

	}
}
