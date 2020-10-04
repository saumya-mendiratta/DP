package DP;

import java.util.Scanner;

public class MIn_money_need {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] wt = new int[1000];
//		int[] price = new int[1000];
//
//		for (int i = 1; i <= 1000; i++)
//			wt[i - 1] = i;
//
//		for (int i = 1; i < 1000; i++)
//			price[i] = i;

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int w= scn.nextInt();
		if(w==0)
			System.out.println("-1");
		else {
		int[] wt = new int[w];
		for(int i =1 ; i<= w ; i++) {
			wt[i-1]=i;
		}
		int[] price = new int[w];
		for(int i =0 ; i< w ; i++) {
			price[i]=scn.nextInt();
		}
		
		// System.out.println(minmoney(wt, price, 0, w));
		System.out.println(minmoneyTD(wt, price, 0, w, new int[w + 1][w + 1]));

		 }
	}

	public static int minmoney(int wt[], int price[], int vidx, int W) {

//		if (vidx > wt.length - 1 )
//			return Integer.MAX_VALUE;

		if (W == 0)
			return 0;

		int ans = 99999999;
		if (vidx < wt.length) {
			int fp = 9999999;
			int sp = 99999999;
			if (price[vidx] != -1 && W - wt[vidx] >= 0)
				fp = minmoney(wt, price, vidx, W - wt[vidx]) + price[vidx];

			if (vidx + 1 < wt.length)
				sp = minmoney(wt, price, vidx + 1, W);

			ans = Math.min(fp, sp);

		}
		return ans;

	}

	public static int minmoneyTD(int wt[], int price[], int vidx, int W, int[][] strg) {

		if (W == 0)
			return 0;

		if (strg[vidx][W] != 0)
			return strg[vidx][W];

		int ans = Integer.MAX_VALUE;
		if (vidx < wt.length) {
			int fp = Integer.MAX_VALUE;
			int sp = Integer.MAX_VALUE;
			
			if (price[vidx] != -1 && W - wt[vidx] >= 0) {
				fp = minmoneyTD(wt, price, vidx, W - wt[vidx] , strg) ;
				if(fp!=Integer.MAX_VALUE)
					fp+=price[vidx];
				else
					fp=Integer.MAX_VALUE;
			}

			if (vidx + 1 < wt.length)
				sp = minmoneyTD(wt, price, vidx + 1, W , strg);

			ans = Math.min(fp, sp);

		}
		strg[vidx][W] = ans;
		return ans;

	}
}
