package DP;

import java.util.Arrays;

public class self_all {

	public static void main(String[] args) {

		// int n = 2;

		// System.out.println(FibTD(n, new int[n + 1]));
//		System.out.println(FibBU(n));
//		System.out.println(FibBUSE(n));

//		System.out.println(BPRecursion(0,n));
//		System.out.println(BPTD(0, n, new int[n]));
//		System.out.println(BPBU(n));

		// System.out.println(MPRecursion(0, 0, n, n));
		// System.out.println(MPTD(0, 0, n, n, new int[n + 1][n + 1]));
//		System.out.println(MPBU(n, n));
//		System.out.println(MPBUSE(n, n));

		// System.out.println(MPDRecursion(0, 0, n, n));
		// System.out.println(MPDTD(0, 0, n, n, new int[n+1][n+1]));
//		System.out.println(MPDBU(n, n));
//		System.out.println(MPDBUSE(n, n));

//		String s1 = "abcd";
//		String s2 = "agcfd";
//		 System.out.println(LCSRecursion(s1, s2));
//		 System.out.println(LCSRecursionVidx(s1, s2, 0, 0));
//		int[][] strg = new int[s1.length()][s2.length()];
//
//		for (int i = 0; i < strg.length; i++) {
//			for (int j = 0; j < strg[0].length; j++) {
//				strg[i][j] = -1;
//			}
//		}
//		System.out.println(LCSRecursionVidxTD(s1, s2, 0, 0, strg));
		// System.out.println(LCSBU(s1, s2));
//
//		String s1 = "jvfvfdgfygcvueregvyugevbhvhjgd";
//		String s2 = "njvbdhvbvhbhvjhvdvhdfbvbvhjvvd";
//		System.out.println(EDRecursion(s1, s2));
//		System.out.println(EDRecursionVidx(s1, s2, 0, 0));
//
//		int[][] strg = new int[s1.length()][s2.length()];
//
//		for (int i = 0; i < strg.length; i++) {
//			Arrays.fill(strg[i], -1);
//		}
//
//		System.out.println(EDTD(s1, s2, 0, 0, strg));
//		System.out.println(EDBU(s1, s2));

		// int[] arr = { 2, 3, 5, 1, 4 };

//		int[] arr = new int[1000];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i;
//		}
//		// System.out.println(WPRecursion(arr, 0, arr.length - 1, 1));
//		System.out.println(WPTD(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
//		System.out.println(WPBU(arr));

		// int[] arr = { 4, 2, 3, 5, 1 };
//		int[] arr = new int[1000];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
		// System.out.println(MCMRecursion(arr, 0, arr.length - 1));
//		System.out.println(MCMTD(arr, 0, arr.length - 1, new int[arr.length][arr.length]));
//		System.out.println(MCMBU(arr));

//		int[] wt = { 1, 3, 4, 5 };
//		int[] price = { 1, 4, 5, 7 };
//		 int[] wt = new int[1000];
//				 int[] price = new int[1000];
//				
//				 for (int i = 0; i < price.length; i++) {
//				 wt[i] = i + 1;
//				 price[i] = i + 1;
//				 }
		// int cap = 7;

//		System.out.println(KnapsackRecursion(wt, price, 0, cap));
		// System.out.println(KnapsackTD(wt, price, 0, cap, new int[wt.length][cap +
		// 1]));
		// System.out.println(KnapsackBU(wt, price, cap));

//		int[] arr = { 40, 60, 20, 50 };
//		//System.out.println(MixturesRecursion(arr, 0, arr.length - 1));
//
//		int[][] strg = new int[arr.length][arr.length];
//		for (int i = 0; i < strg.length; i++)
//			Arrays.fill(strg[i], -1);
//		//System.out.println(MixturesTD(arr, 0, arr.length - 1, strg));
//		System.out.println(MixturesBU(arr));
//
//		int[] price = { 0, 3, 5, 8, 9, 10, 17, 17, 20 };
//
//		System.out.println(RodCutRecursion(price, price.length - 1));
//		System.out.println(RodCutTD(price, price.length - 1, new int[price.length]));
//		System.out.println(RodCutBU(price));

//		String src = "abcd";
//		String pat = "?*?c**";
//		System.out.println(WildcardMatchingRecursion(src, pat));
//		System.out.println(WildcardMatchingRecursionVidx(src, pat, 0, 0));
//		System.out.println(WildcardMatchingBU(src, pat));

//		int k=70;
//		//System.out.println(NoOfBSTsRecursion(5));
//		System.out.println(NoOfBSTTD(k, new int[k+1]));
//		System.out.println(NoOfBSTBU(k));

//		String s = "abfhjsvvsvchsffdcer";
//		System.out.println(PalindromePartitioningRec(s, 0, s.length() - 1));
//		System.out.println(PalindromePartitioningBU(s));

//		String str = "abbc";
//		System.out.println(LongestPalindromicSSRec(str, 0, str.length() - 1));
//		System.out.println(LongestPalindromicSSTD(str, 0, str.length() - 1, new int[str.length()][str.length()]));
//		System.out.println(LongestPalindromicSSBU(str));

//		String s1 = "abcd";
//		String s2 = "agcfd";
//		int k = 2;
//		// System.out.println(kOrderedLCSRec(s1, s2, k, 0, 0));
//		int[][][] strg = new int[k + 1][s1.length() + 1][s2.length() + 1];
//
//		for (int i = 0; i < strg.length; i++) {
//			for (int j = 0; j < strg[0].length; j++) {
//				Arrays.fill(strg[i][j], -1);
//			}
//		}
//		System.out.println(kOrderedLTD(s1, s2, k, 0, 0, strg));
//		System.out.println(kOrderedLCSBU(s1, s2, k));

//		String s1 = "abcd";
//		String s2 = "agcfd ";
//		String s3 = "ad";
//		System.out.println(LCS3StringsRec(s1, s2, s3, 0, 0, 0));
//
//		int[][] arr = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
//		System.out.println(DungeonGameRec(arr, 0, 0, arr.length - 1, arr[0].length - 1));
//		System.out.println(
//				DungeonGameTD(arr, 0, 0, arr.length - 1, arr[0].length - 1, new int[arr.length][arr[0].length]));
//		System.out.println(DungeonGameBU(arr));

		// int[] arr= { 3,4,-1,0,6,2,3};
//		int[] arr = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
//		System.out.println(LISBU(arr));

		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(LISBU(arr));

	}

	// TD : topd down
	public static int FibTD(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0)
			return strg[n];

		int fnm1 = FibTD(n - 1, strg);
		int fnm2 = FibTD(n - 2, strg);

		int fn = fnm1 + fnm2;
		strg[n] = fn;

		return fn;

	}

	public static int FibBU(int n) {

		int[] fibb = new int[n + 1];

		fibb[0] = 0;
		fibb[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibb[i] = fibb[i - 1] + fibb[i - 2];
		}

		return fibb[n];

	}

	public static int FibBUSE(int n) {

		int[] strg = new int[2];

		strg[0] = 0;
		strg[1] = 1;

		for (int i = 1; i <= n - 1; i++) {

			int sum = strg[0] + strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}

		return strg[1];
	}

	public static int BPRecursion(int curr, int end) {

		if (curr == end)
			return 1;

		if (curr > end)
			return 0;

		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += BPRecursion(dice + curr, end);
		}

		return count;

	}

	public static int BPTD(int curr, int end, int[] strg) {

		if (curr == end)
			return 1;

		if (curr > end)
			return 0;

		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;

		for (int dice = 1; dice <= 6; dice++) {
			count += BPTD(dice + curr, end, strg);
		}

		strg[curr] = count;
		return count;

	}

	public static int BPBU(int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {

			strg[i] = strg[i + 1] + strg[i + 2] + strg[i + 3] + strg[i + 4] + strg[i + 5] + strg[i + 6];
		}

		return strg[0];
	}

	public static int MPRecursion(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = MPRecursion(cr, cc + 1, er, ec);
		int cv = MPRecursion(cr + 1, cc, er, ec);

		return ch + cv;

	}

	public static int MPTD(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0)
			return strg[cr][cc];

		int ch = MPTD(cr, cc + 1, er, ec, strg);
		int cv = MPTD(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = ch + cv;

		return ch + cv;

	}

	public static int MPBU(int er, int ec) {

		int strg[][] = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec)
					strg[row][col] = 1;
				else {
					strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
				}

			}
		}

		return strg[0][0];
	}

	public static int MPBUSE(int er, int ec) {

		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);

		for (int slide = er - 1; slide >= 0; slide--) {
			for (int col = ec; col >= 0; col--) {
				if (col == ec)
					strg[col] = 1;
				else {
					strg[col] = strg[col] + strg[col + 1];
				}
			}
		}

		return strg[0];

	}

	public static int MPDRecursion(int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = MPDRecursion(cr, cc + 1, er, ec);
		int cv = MPDRecursion(cr + 1, cc, er, ec);
		int cd = MPDRecursion(cr + 1, cc + 1, er, ec);

		return ch + cv + cd;
	}

	public static int MPDTD(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int ch = MPDTD(cr, cc + 1, er, ec, strg);
		int cv = MPDTD(cr + 1, cc, er, ec, strg);
		int cd = MPDTD(cr + 1, cc + 1, er, ec, strg);

		strg[cr][cc] = ch + cv + cd;

		return ch + cv + cd;
	}

	public static int MPDBU(int er, int ec) {

		int[][] strg = new int[er + 2][ec + 2];

		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {

				if (row == er && col == ec) {
					strg[row][col] = 1;
				} else {
					strg[row][col] = strg[row][col + 1] + strg[row + 1][col] + strg[row + 1][col + 1];
				}
			}
		}

		return strg[0][0];

	}

	public static int MPDBUSE(int er, int ec) {

		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);
		int diag = 0;
		for (int slide = er - 1; slide >= 0; slide--) {
			for (int col = ec; col >= 0; col--) {

				if (col == ec)
					strg[col] = 1;
				else {

					if (col == ec - 1)
						diag = 1;

					int val = strg[col + 1] + strg[col] + diag;
					diag = strg[col];
					strg[col] = val;
				}
			}

		}
		return strg[0];
	}

	public static int LCSRecursion(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCSRecursion(ros1, ros2) + 1;
		} else {
			int o1 = LCSRecursion(s1, ros2);
			int o2 = LCSRecursion(ros1, s2);

			ans = Math.max(o1, o2);

		}
		return ans;

	}

	public static int LCSRecursionVidx(String s1, String s2, int vidx1, int vidx2) {

		if (s1.length() == vidx1 || s2.length() == vidx2) {
			return 0;
		}

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCSRecursionVidx(s1, s2, vidx1 + 1, vidx2 + 1) + 1;
		} else {
			int o1 = LCSRecursionVidx(s1, s2, vidx1, vidx2 + 1);
			int o2 = LCSRecursionVidx(s1, s2, vidx1 + 1, vidx2);

			ans = Math.max(o1, o2);

		}
		return ans;

	}

	public static int LCSRecursionVidxTD(String s1, String s2, int vidx1, int vidx2, int[][] strg) {

		if (s1.length() == vidx1 || s2.length() == vidx2) {
			return 0;
		}

		if (strg[vidx1][vidx2] != -1) {
			return strg[vidx1][vidx2];
		}
		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;
		if (ch1 == ch2) {
			ans = LCSRecursionVidxTD(s1, s2, vidx1 + 1, vidx2 + 1, strg) + 1;
		} else {
			int o1 = LCSRecursionVidxTD(s1, s2, vidx1, vidx2 + 1, strg);
			int o2 = LCSRecursionVidxTD(s1, s2, vidx1 + 1, vidx2, strg);

			ans = Math.max(o1, o2);

		}

		strg[vidx1][vidx2] = ans;
		return ans;

	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {

			for (int col = s2.length() - 1; col >= 0; col--) {

				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {
					int o1 = strg[row][col + 1];
					int o2 = strg[row + 1][col];

					strg[row][col] = Math.max(o1, o2);
				}

			}
		}

		display(strg);

		return strg[0][0];

	}

	private static void display(int[][] strg) {

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int EDRecursion(String s1, String s2) {

		if (s1.length() == 0 && s2.length() == 0)
			return 0;

		if (s1.length() == 0)
			return s2.length();
		if (s2.length() == 0)
			return s1.length();

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans = 0;
		if (ch1 == ch2)
			ans = EDRecursion(ros1, ros2);
		else {

			int i = EDRecursion(ros1, s2);
			int d = EDRecursion(s1, ros2);
			int r = EDRecursion(ros1, ros2);

			ans = Math.min(i, Math.min(d, r)) + 1;
		}

		return ans;

	}

	public static int EDRecursionVidx(String s1, String s2, int vidx1, int vidx2) {

		if (vidx1 == s1.length() && vidx2 == s2.length())
			return 0;

		if (vidx1 == s1.length())
			return vidx1;
		if (vidx2 == s2.length())
			return vidx2;

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;
		if (ch1 == ch2)
			ans = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2 + 1);
		else {

			int i = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2);
			int d = EDRecursionVidx(s1, s2, vidx1, vidx2 + 1);
			int r = EDRecursionVidx(s1, s2, vidx1 + 1, vidx2 + 1);

			ans = Math.min(i, Math.min(d, r)) + 1;
		}

		return ans;

	}

	public static int EDTD(String s1, String s2, int vidx1, int vidx2, int[][] strg) {

		if (s1.length() == vidx1 || s2.length() == vidx2) {
			return Math.max(s1.length() - vidx1, s2.length() - vidx2);
		}

		if (strg[vidx1][vidx2] != -1) {
			return strg[vidx1][vidx2];
		}

		char ch1 = s1.charAt(vidx1);
		char ch2 = s2.charAt(vidx2);

		int ans = 0;

		if (ch1 == ch2) {
			ans = EDTD(s1, s2, vidx1 + 1, vidx2 + 1, strg);
		} else {

			int i = EDTD(s1, s2, vidx1 + 1, vidx2, strg);
			int d = EDTD(s1, s2, vidx1, vidx2 + 1, strg);
			int r = EDTD(s1, s2, vidx1 + 1, vidx2 + 1, strg);

			ans = Math.min(i, Math.min(d, r)) + 1;

		}

		strg[vidx1][vidx2] = ans;

		return ans;

	}

	public static int EDBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (row == s1.length())
					strg[row][col] = s2.length() - col;
				else if (col == s2.length())
					strg[row][col] = s1.length() - row;
				else {
					if (s1.charAt(row) == s2.charAt(col))
						strg[row][col] = strg[row + 1][col + 1];
					else {
						int i = strg[row + 1][col];
						int d = strg[row][col + 1];
						int r = strg[row + 1][col + 1];

						strg[row][col] = Math.min(i, Math.min(d, r)) + 1;
					}

				}
			}
		}
		return strg[0][0];
	}

	public static int WPRecursion(int[] arr, int si, int ei, int yr) {

		if (si == ei)
			return arr[si] * yr;

		int left = WPRecursion(arr, si + 1, ei, yr + 1) + arr[si] * yr;
		int right = WPRecursion(arr, si, ei - 1, yr + 1) + arr[ei] * yr;

		return Math.max(left, right);

	}

	public static int WPTD(int[] arr, int si, int ei, int[][] strg) {

		int yr = arr.length - ei + si;
		if (si == ei)
			return arr[si] * yr;

		if (strg[si][ei] != 0)
			return strg[si][ei];

		int left = WPTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int right = WPTD(arr, si, ei - 1, strg) + arr[ei] * yr;

		int ans = Math.max(left, right);

		strg[si][ei] = ans;
		return ans;

	}

	public static int WPBU(int[] arr) {

		int n = arr.length;

		int[][] strg = new int[n][n];

		for (int slide = 0; slide < n; slide++) {
			for (int si = 0; si <= n - slide - 1; si++) {
				int ei = si + slide;

				int yr = n - ei + si;

				if (si == ei)
					strg[si][ei] = arr[si] * yr;
				else {

					int left = strg[si][ei - 1] + arr[ei] * yr;
					int bottom = strg[si + 1][ei] + arr[si] * yr;

					int ans = Math.max(left, bottom);
					strg[si][ei] = ans;

				}

			}

		}

		return strg[0][n - 1];
	}

	public static int MCMRecursion(int[] arr, int si, int ei) {

		if (si + 1 == ei)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = si + 1; k <= ei - 1; k++) {
			int fp = MCMRecursion(arr, si, k);
			int sp = MCMRecursion(arr, k, ei);

			int sw = arr[si] * arr[k] * arr[ei];

			int total = fp + sp + sw;

			if (total < min)
				min = total;

		}
		return min;
	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {

		if (si + 1 == ei) {
			return 0;
		}

		if (strg[si][ei] != 0) { // re-use
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		// k : splits
		for (int k = si + 1; k <= ei - 1; k++) {

			int fp = MCMTD(arr, si, k, strg); // arr[si] * arr[k]
			int sp = MCMTD(arr, k, ei, strg); // arr[k] * arr[ei]

			int sw = arr[si] * arr[k] * arr[ei];

			int total = fp + sp + sw;

			if (total < min) {
				min = total;
			}

		}

		strg[si][ei] = min; // storage

		return min;

	}

	public static int MCMBU(int[] arr) {

		int[][] strg = new int[arr.length][arr.length];

		for (int slide = 0; slide < arr.length; slide++) {
			for (int si = 0; si <= arr.length - slide - 1; si++) {
				int ei = si + slide;

				if (si + 1 == ei) {
					strg[si][ei] = 0;
				} else {
					int min = Integer.MAX_VALUE;

					// k : splits
					for (int k = si + 1; k <= ei - 1; k++) {

						int fp = strg[si][k];
						int sp = strg[k][ei];

						int sw = arr[si] * arr[k] * arr[ei];

						int total = fp + sp + sw;

						if (total < min) {
							min = total;
						}

					}
					strg[si][ei] = min;
				}

			}
		}

		return strg[0][arr.length - 1];
	}

	public static int KnapsackRecursion(int[] wt, int[] price, int vidx, int cap) {

		if (vidx == wt.length || cap == 0)
			return 0;
		// exclude
		int e = KnapsackRecursion(wt, price, vidx + 1, cap);

		// include

		int i = 0;
		if (cap >= wt[vidx])
			i = KnapsackRecursion(wt, price, vidx + 1, cap - wt[vidx]) + price[vidx];

		int ans = Math.max(e, i);

		return ans;

	}

	public static int KnapsackTD(int[] wt, int[] price, int vidx, int cap, int[][] strg) {

		if (vidx == wt.length || cap == 0)
			return 0;
		// exclude
		int e = KnapsackTD(wt, price, vidx + 1, cap, strg);

		// include

		int i = 0;
		if (cap >= wt[vidx])
			i = KnapsackTD(wt, price, vidx + 1, cap - wt[vidx], strg) + price[vidx];

		int ans = Math.max(e, i);
		strg[vidx][cap] = ans;

		return ans;

	}

	public static int KnapsackBU(int[] wt, int[] price, int cap) {

		int n = wt.length;
		int[][] strg = new int[wt.length + 1][cap + 1];

		for (int row = n - 1; row >= 0; row--) {
			for (int col = 1; col <= cap; col++) {

				int e = strg[row + 1][col];
				int i = 0;
				if (col >= wt[row])
					i = strg[row + 1][col - wt[row]] + price[row];

				int ans = Math.max(e, i);
				strg[row][col] = ans;

			}
		}

		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}
		return strg[0][cap];
	}

	public static int MixturesRecursion(int[] arr, int si, int ei) {

		if (si == ei)
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {

			int fp = MixturesRecursion(arr, si, k);
			int sp = MixturesRecursion(arr, k + 1, ei);

			int sw = colour(arr, si, k) * colour(arr, k + 1, ei);

			int total = fp + sp + sw;

			if (total < min)
				min = total;
		}

		return min;

	}

	public static int colour(int[] arr, int i, int j) {

		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += arr[k];
		}
		return sum % 100;
	}

	public static int MixturesTD(int[] arr, int si, int ei, int[][] strg) {

		if (si == ei) {
			return 0;
		}

		if (strg[si][ei] != -1) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si; k <= ei - 1; k++) {

			int fp = MixturesTD(arr, si, k, strg);
			int sp = MixturesTD(arr, k + 1, ei, strg);

			int sw = colour(arr, si, k) * colour(arr, k + 1, ei);

			int total = fp + sp + sw;

			if (total < min) {
				min = total;
			}

		}

		strg[si][ei] = min;

		return min;

	}

	public static int MixturesBU(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 0; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				if (si == ei) {
					strg[si][ei] = 0;
				} else {
					int min = Integer.MAX_VALUE;

					for (int k = si; k <= ei - 1; k++) {

						int fp = strg[si][k];
						int sp = strg[k + 1][ei];

						int sw = colour(arr, si, k) * colour(arr, k + 1, ei);

						int total = fp + sp + sw;

						if (total < min) {
							min = total;
						}

					}

					strg[si][ei] = min;

				}
			}

		}
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}
		return strg[0][n - 1];

	}

	public static int RodCutRecursion(int[] price, int n) {

		int max = price[n];
		int h = 1;
		while (h <= n / 2) {

			int fp = RodCutRecursion(price, h);
			int sp = RodCutRecursion(price, n - h);

			int total = fp + sp;
			if (total > max)
				max = total;
			h += 1;
		}
		return max;
	}

	public static int RodCutTD(int[] price, int n, int[] strg) {

		if (strg[n] != 0)
			return strg[n];
		int max = price[n];
		int h = 1;
		while (h <= n / 2) {

			int fp = RodCutTD(price, h, strg);
			int sp = RodCutTD(price, n - h, strg);

			int total = fp + sp;
			if (total > max)
				max = total;
			h += 1;
		}
		strg[n] = max;
		return max;
	}

	public static int RodCutBU(int[] price) {

		int n = price.length - 1;
		int[] strg = new int[price.length];

		strg[0] = 0;
		strg[1] = price[1];

		for (int i = 2; i <= n; i++) {
			int max = price[i];
			int h = 1;
			while (h <= i / 2) {

				int fp = strg[h];
				int sp = strg[i - h];

				int total = fp + sp;
				if (total > max)
					max = total;
				h += 1;
			}
			strg[i] = max;
		}
		return strg[n];
	}

	public static boolean WildcardMatchingRecursion(String src, String pat) {

		if (src.length() == 0 && pat.length() == 0)
			return true;

		if (src.length() != 0 && pat.length() == 0) {
			return false;
		}

		if (src.length() == 0 && pat.length() != 0) {

			for (int i = 0; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}

			return true;
		}

		char chs = src.charAt(0);
		char chp = pat.charAt(0);

		String ros = src.substring(1);
		String rop = pat.substring(1);

		boolean ans;
		if (chs == chp || chp == '?') {

			ans = WildcardMatchingRecursion(ros, rop);
		} else if (chp == '*') {

			boolean fp = WildcardMatchingRecursion(src, rop);
			boolean sp = WildcardMatchingRecursion(ros, pat);

			ans = fp || sp;
		} else {
			return false;
		}

		return ans;
	}

	public static boolean WildcardMatchingRecursionVidx(String src, String pat, int vidxs, int vidxp) {

		if (src.length() == vidxs && pat.length() == vidxp)
			return true;

		if (src.length() != vidxs && pat.length() == vidxp) {
			return false;
		}

		if (src.length() == vidxs && pat.length() != vidxp) {

			for (int i = vidxp; i < pat.length(); i++) {
				if (pat.charAt(i) != '*') {
					return false;
				}
			}

			return true;
		}

		char chs = src.charAt(vidxs);
		char chp = pat.charAt(vidxp);

		boolean ans;
		if (chs == chp || chp == '?') {

			ans = WildcardMatchingRecursionVidx(src, pat, vidxs + 1, vidxp + 1);
		} else if (chp == '*') {

			boolean fp = WildcardMatchingRecursionVidx(src, pat, vidxs, vidxp + 1);
			boolean sp = WildcardMatchingRecursionVidx(src, pat, vidxs + 1, vidxp);

			ans = fp || sp;
		} else {
			return false;
		}

		return ans;
	}

	public static boolean WildcardMatchingBU(String src, String pat) {

		boolean strg[][] = new boolean[src.length() + 1][pat.length() + 1];

		strg[src.length()][pat.length()] = true;

		for (int row = src.length(); row >= 0; row--) {

			for (int col = pat.length() - 1; col >= 0; col--) {

				if (row == src.length()) {

					if (pat.charAt(col) == '*')
						strg[row][col] = strg[row][col + 1];
					else
						strg[row][col] = false;
				} else {
					char chs = src.charAt(row);
					char chp = pat.charAt(col);

					boolean ans;
					if (chs == chp || chp == '?') {

						strg[row][col] = strg[row + 1][col + 1];
					} else if (chp == '*') {

						boolean fp = strg[row + 1][col];
						boolean sp = strg[row][col + 1];

						strg[row][col] = fp || sp;
					} else {
						strg[row][col] = false;
					}

				}

			}
		}
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + " ");
			}
			System.out.println();
		}
		return strg[0][0];

	}

	public static int NoOfBSTsRecursion(int n) {

		if (n <= 1)
			return 1;

		int total = 0;
		for (int i = 1; i <= n; i++) {

			int l = NoOfBSTsRecursion(i - 1);
			int r = NoOfBSTsRecursion(n - i);

			int ans = l * r;

			total += ans;

		}
		return total;
	}

	public static int NoOfBSTTD(int n, int[] strg) {

		if (n <= 1)
			return 1;

		if (strg[n] != 0)
			return strg[n];

		int total = 0;
		for (int i = 1; i <= n; i++) {

			int l = NoOfBSTTD(i - 1, strg);
			int r = NoOfBSTTD(n - i, strg);

			int ans = l * r;

			total += ans;

		}
		strg[n] = total;
		return total;
	}

	public static int NoOfBSTBU(int n) {

		int strg[] = new int[n + 1];
		strg[0] = 1;
		strg[1] = 1;

		for (int k = 2; k <= n; k++) {

			int total = 0;
			for (int i = 1; i <= k; i++) {

				int l = strg[i - 1];
				int r = strg[k - i];

				int ans = l * r;

				total += ans;

			}
			strg[k] = total;
		}

//		for(int i=0 ; i< strg.length ; i++)
//			System.out.print(strg[i] + " ");
		return strg[n];
	}

	public static int PalindromePartitioningRec(String s, int si, int ei) {

		if (isPalindrome(s, si, ei))
			return 0;

		int min = Integer.MAX_VALUE;
		for (int k = si; k <= ei - 1; k++) {

			int fp = PalindromePartitioningRec(s, si, k);
			int sp = PalindromePartitioningRec(s, k + 1, ei);

			int total = fp + sp + 1;
			if (total < min)
				min = total;
		}

		return min;
	}

	public static boolean isPalindrome(String s, int si, int ei) {

		int l = si;
		int r = ei;
		while (l < r) {

			if (s.charAt(l) != s.charAt(r))
				return false;
			l++;
			r--;

		}

		return true;
	}

	public static int PalindromePartitioningBU(String s) {

		boolean[][] palinarray = palindromeInfo(s);
		int[][] strg = new int[s.length()][s.length()];

		int n = s.length();

		for (int slide = 0; slide < n; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;

				if (palinarray[si][ei]) {
					strg[si][ei] = 0;
				} else {

					int min = Integer.MAX_VALUE;

					for (int k = si; k <= ei - 1; k++) {
						int fp = strg[si][k];
						int sp = strg[k + 1][ei];

						int total = fp + sp + 1;

						if (total < min)
							min = total;

					}

					strg[si][ei] = min;

				}
			}
		}

		return strg[0][n - 1];

	}

	public static boolean[][] palindromeInfo(String s) {

		boolean[][] palinarray = new boolean[s.length()][s.length()];

		for (int i = 0; i < palinarray.length; i++) {
			for (int col = 0; col < palinarray[0].length; col++)
				palinarray[i][col] = true;
		}

		for (int row = s.length() - 2; row >= 0; row--) {

			for (int col = row + 1; col < s.length(); col++) {

				if (s.charAt(row) == s.charAt(col)) {
					palinarray[row][col] = palinarray[row + 1][col - 1];
				} else {
					palinarray[row][col] = false;
				}
			}
		}
		return palinarray;
	}

	public static int LongestPalindromicSSRec(String str, int si, int ei) {

		if (si == ei)
			return 1;
		if (si > ei)
			return 0;

		int ans = 0;
		if (str.charAt(si) == str.charAt(ei)) {
			ans = LongestPalindromicSSRec(str, si + 1, ei - 1) + 2;
		} else {

			int fp = LongestPalindromicSSRec(str, si + 1, ei);
			int sp = LongestPalindromicSSRec(str, si, ei - 1);

			ans = Math.max(fp, sp);

		}
		return ans;
	}

	public static int LongestPalindromicSSTD(String str, int si, int ei, int[][] strg) {

		if (si > ei)
			return 0;

		if (si == ei)
			return 1;

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int ans = 0;

		if (str.charAt(si) == str.charAt(ei)) {
			ans = LongestPalindromicSSTD(str, si + 1, ei - 1, strg) + 2;
		} else {

			int o1 = LongestPalindromicSSTD(str, si + 1, ei, strg);
			int o2 = LongestPalindromicSSTD(str, si, ei - 1, strg);

			ans = Math.max(o1, o2);
		}

		strg[si][ei] = ans;

		return ans;

	}

	public static int LongestPalindromicSSBU(String str) {

		int n = str.length();
		int[][] strg = new int[n][n];
		for (int slide = 0; slide <= n - 1; slide++) {

			for (int si = 0; si <= n - slide - 1; si++) {

				int ei = si + slide;
				if (si == ei) {
					strg[si][ei] = 1;
				} else {
					int ans = 0;

					if (str.charAt(si) == str.charAt(ei)) {
						strg[si][ei] = strg[si + 1][ei - 1] + 2;
					} else {

						int o1 = strg[si][ei - 1];
						int o2 = strg[si + 1][ei];

						ans = Math.max(o1, o2);
						strg[si][ei] = ans;
					}

				}
			}

		}
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[0].length; j++) {
				System.out.print(strg[i][j] + "\t");
			}
			System.out.println();
		}
		return strg[0][n - 1];
	}

	public static int kOrderedLCSRec(String s1, String s2, int k, int vidx1, int vidx2) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return 0;

		int ans = 0;
		if (s1.charAt(vidx1) == s2.charAt(vidx2)) {
			ans = kOrderedLCSRec(s1, s2, k, vidx1 + 1, vidx2 + 1) + 1;
		} else {

			int o1 = kOrderedLCSRec(s1, s2, k, vidx1 + 1, vidx2);
			int o2 = kOrderedLCSRec(s1, s2, k, vidx1, vidx2 + 1);
			int o3 = 0;
			if (k >= 1)
				o3 = kOrderedLCSRec(s1, s2, k - 1, vidx1 + 1, vidx2 + 1) + 1;

			ans = Math.max(o1, Math.max(o2, o3));

		}
		return ans;

	}

	public static int kOrderedLTD(String s1, String s2, int k, int vidx1, int vidx2, int[][][] strg) {

		if (s1.length() == vidx1 || s2.length() == vidx2)
			return 0;

		if (strg[k][vidx1][vidx2] != -1)
			return strg[k][vidx1][vidx2];

		int ans = 0;
		if (s1.charAt(vidx1) == s2.charAt(vidx2)) {
			ans = kOrderedLTD(s1, s2, k, vidx1 + 1, vidx2 + 1, strg) + 1;
		} else {

			int o1 = kOrderedLTD(s1, s2, k, vidx1 + 1, vidx2, strg);
			int o2 = kOrderedLTD(s1, s2, k, vidx1, vidx2 + 1, strg);
			int o3 = 0;
			if (k >= 1)
				o3 = kOrderedLTD(s1, s2, k - 1, vidx1 + 1, vidx2 + 1, strg) + 1;

			ans = Math.max(o1, Math.max(o2, o3));

		}
		strg[k][vidx1][vidx2] = ans;
		return ans;

	}

	public static int kOrderedLCSBU(String s1, String s2, int tk) {

		int[][][] strg = new int[tk + 1][s1.length() + 1][s2.length() + 1];

		for (int k = 0; k <= tk; k++) {

			for (int row = s1.length() - 1; row >= 0; row--) {

				for (int col = s2.length() - 1; col >= 0; col--) {

					int ans = 0;
					if (s1.charAt(row) == s2.charAt(col)) {
						ans = strg[k][row + 1][col + 1] + 1;
					} else {

						int o1 = strg[k][row + 1][col];
						int o2 = strg[k][row][col + 1];
						int o3 = 0;
						if (k >= 1)
							o3 = strg[k - 1][row + 1][col + 1] + 1;

						ans = Math.max(o1, Math.max(o2, o3));

					}
					strg[k][row][col] = ans;

				}
			}
		}

		return strg[tk][0][0];
	}

	public static int LCS3StringsRec(String s1, String s2, String s3, int vidx1, int vidx2, int vidx3) {

		if (s1.length() == vidx1 || s2.length() == vidx2 || s3.length() == vidx3)
			return 0;

		int ans = 0;
		if (s1.charAt(vidx1) == s2.charAt(vidx2) && s2.charAt(vidx2) == s3.charAt(vidx3)) {
			ans = LCS3StringsRec(s1, s2, s3, vidx1 + 1, vidx2 + 1, vidx3 + 1) + 1;
		} else {

			int o1 = LCS3StringsRec(s1, s2, s3, vidx1 + 1, vidx2, vidx3);
			int o2 = LCS3StringsRec(s1, s2, s3, vidx1, vidx2 + 1, vidx3);
			int o3 = LCS3StringsRec(s1, s2, s3, vidx1, vidx2, vidx3 + 1);

			ans = Math.max(o1, Math.max(o2, o3));
		}
		return ans;

	}

	public static int DungeonGameRec(int[][] arr, int cr, int cc, int er, int ec) {

		if (cr == er && cc == ec) {
			return arr[cr][cc] <= 0 ? -arr[cr][cc] + 1 : 1;
		}

		if (cr > er || cc > ec)
			return Integer.MAX_VALUE;

		int r = DungeonGameRec(arr, cr, cc + 1, er, ec);
		int d = DungeonGameRec(arr, cr + 1, cc, er, ec);

		int path = Math.min(r, d);

		int minamount = path - arr[cc][cr];
		int ans;

		if (minamount >= 1) {
			ans = minamount;
		} else {
			ans = 1;
		}
		return ans;
	}

	public static int DungeonGameTD(int[][] arr, int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && cc == ec) {
			return arr[cr][cc] <= 0 ? -arr[cr][cc] + 1 : 1;
		}

		if (cr > er || cc > ec)
			return Integer.MAX_VALUE;

		if (strg[cr][cc] != 0)
			return strg[cr][cc];

		int r = DungeonGameTD(arr, cr, cc + 1, er, ec, strg);
		int d = DungeonGameTD(arr, cr + 1, cc, er, ec, strg);

		int path = Math.min(r, d);

		int minamount = path - arr[cc][cr];
		int ans;

		if (minamount >= 1) {
			ans = minamount;
		} else {
			ans = 1;
		}

		strg[cr][cc] = ans;
		return ans;
	}

	public static int DungeonGameBU(int[][] arr) {

		int n = arr.length;
		int m = arr[0].length;
		int[][] strg = new int[n + 1][m + 1];

		for (int row = n; row >= 0; row--) {

			for (int col = m; col >= 0; col--) {

				if (row == n || col == m) {
					strg[row][col] = Integer.MAX_VALUE;
				} else if (row == n - 1 && col == m - 1) {
					if (arr[n - 1][m - 1] <= 0)
						strg[n - 1][m - 1] = -arr[n - 1][m - 1] + 1;
					else
						strg[n - 1][m - 1] = 1;

				} else {

					int r = strg[row][col + 1];
					int d = strg[row + 1][col];

					int path = Math.min(r, d);

					int minamount = path - arr[row][col];
					if (minamount >= 1) {
						strg[row][col] = minamount;
					} else {
						strg[row][col] = 1;
					}

				}
			}
		}
		return strg[0][0];
	}

	public static int LISn2BU(int[] arr) {

		int strg[] = new int[arr.length];

		Arrays.fill(strg, 1);

		for (int si = 1; si < arr.length; si++) {
			int max = 0;
			for (int ei = 0; ei < si; ei++) {

				if (arr[si] > arr[ei]) {

					int ans = strg[ei] + 1;
					if (ans >= max) {
						max = ans;
					}
					strg[si] = max;
				}

			}
		}

		int max2 = 0;
		for (int val : strg) {
			System.out.print(val + " ");
			if (val > max2)
				max2 = val;
		}
		System.out.println();
		return max2;
	}

	public static int LISBU(int[] arr) {

		int[] le = new int[arr.length];

		le[0] = arr[0];
		int len = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > le[len - 1]) {

				le[len] = arr[i];
				len++;

			} else {

				int idx = binarySearch(le, 0, len - 1, arr[i]);
				le[idx] = arr[i];

			}

		}
		return len;
	}

	public static int binarySearch(int[] le, int si, int ei, int item) {

		int low = si;
		int high = ei;

		while (low <= high) {

			int mid = (low + high) / 2;
			if (item > le[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return low;

	}
}
