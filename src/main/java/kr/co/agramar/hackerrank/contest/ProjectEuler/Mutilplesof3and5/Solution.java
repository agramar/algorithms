package kr.co.agramar.hackerrank.contest.ProjectEuler.Mutilplesof3and5;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if (t < 1 || t > 100000) {
			System.exit(0);
		}
		
		int[] ar = new int[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();

			int s = 0;
			for (int i = 3; i < n; i = i + 3) {
				if (i % 5 == 0) {
					continue;
				}
				s = s + i;
			}
			for (int i = 5; i < n; i = i + 5) {
				s = s + i;
			}
			ar[a0] = s;
		}

		for (int a0 = 0; a0 < t; a0++) {
			System.out.println(ar[a0]);
		}
	}
}