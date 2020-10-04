package DP;

import java.util.ArrayList;
import java.util.Scanner;

public class count_Binary_Strings {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int i=1 ; i<=t ; i++ ) {
		int n =scn.nextInt();
		if(n==0)
			System.out.println("0");
		else {
		pair ans = countBSrec(n);
		System.out.println(ans.end0 + ans.end1);
		}
		}
	}

	public static ArrayList<String> countBS(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		if (n == 1) {

			ArrayList<String> br = new ArrayList<>();
			br.add("0");
			br.add("1");
			// count+=2;
			return br;

		}

		ArrayList<String> rr = countBS(n - 1);

		ArrayList<String> mr = new ArrayList<String>();

		for (String val : rr) {

			if (val.charAt(0) == '1')
				mr.add("0");
			else {
				mr.add("0" + val);
				mr.add("1" + val);
			}
		}

		return mr;
	}

	public static class pair{
		
		long end0 ;
		long end1 ;
	}
	
	public static pair countBSrec(int n ) {
 
		if(n==1) {
			pair br = new pair();
			br.end0 =1;
			br.end1 =1 ;
			return br;
		}
		pair rs = countBSrec(n-1);
		
		pair ss = new pair();
		ss.end0 = rs.end0 + rs.end1;
		ss.end1=rs.end0;
		
		return ss;

	}
}
