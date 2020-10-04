package DP;

import java.util.Scanner;

public class min_money_FINAL {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		int N = scn.nextInt();
//		int W = scn.nextInt();
//		int[] prices = new int[W + 1];
//		for (int i = 1; i <= W; ++i)
//			prices[i] = scn.nextInt();
//		int rv = minPrice(prices, 1, W, new int[prices.length][W + 1]);
//		if (rv == Integer.MAX_VALUE)
//			System.out.println(-1);
//		else
//			System.out.println(rv);

		int[] wt = new int[1000];
		int[] price = new int[1000];
		
		for(int i = 1; i<=1000 ; i++)
			wt[i-1]=i;
		
		for(int i = 1; i<1000 ; i++)
			price[i]=i;
		System.out.println(minPrice(price, 1, 1000,  new int[1000+1][1000+1]));
	}

	public static int minPrice(int[] prices, int pidx, int weight, int[][] strg) {
		if (weight == 0)
			return 0;

		if (strg[pidx][weight] != 0)
			return strg[pidx][weight];

		int ans = Integer.MAX_VALUE;

		for (int i = pidx; i < prices.length && i <= weight; i++) {
			if (prices[i] != -1) {

				int p = minPrice(prices, i, weight - i, strg);

				if (p != Integer.MAX_VALUE)
					ans = Math.min(ans, p + prices[i]);

			}
		}

		strg[pidx][weight] = ans;

		return ans;

	}
}