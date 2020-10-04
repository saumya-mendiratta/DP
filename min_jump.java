package DP;

import java.util.Scanner;

public class min_jump {

	public static void main(String[] args) {

		// int[] arr = { 1 ,3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
			while (t > 0) {

				int n = scn.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < n; i++) {
					arr[i] = scn.nextInt();
				}
				System.out.println(minjump2(arr));
				t--;
			
		}
	}

	public static int minjump(int arr[]) {

		int len = arr.length;
		int[] strg = new int[len];

		strg[len - 1] = 0;

		for (int i = len - 2; i >= 0; i--) {

			if (arr[i] == 0)
				strg[i] = Integer.MAX_VALUE;
			else if (arr[i] + i >= len - 1)
				strg[i] = 1;
			else {
				int min = Integer.MAX_VALUE;
				for (int j = i + 1; j < len && j <= arr[i] + i; j++) {

					if (strg[j] < min)
						min = strg[j];
				}
				if (min != Integer.MAX_VALUE)
					strg[i] = min + 1;
				else
					strg[i] = min;
			}

		}

		return strg[0];
	}
	
	public static int minjump2(int arr[]) {

		int len = arr.length;
		int[] strg = new int[len];

		strg[len - 1] = 0;

		for (int i = len - 2; i >= 0; i--) {

			if (arr[i] == 0)
				strg[i] = Integer.MAX_VALUE;
			else if (arr[i] + i >= len - 1)
				strg[i] = 1;
			else {
				int min = Integer.MAX_VALUE;
				for (int j = 1; j < len && j <= arr[i] ; j++) {

					if (strg[j + i ] < min)
						min = strg[j + i ];
				}
				if (min != Integer.MAX_VALUE)
					strg[i] = min + 1;
				else
					strg[i] = min;
			}

		}

		return strg[0];
	}
}
