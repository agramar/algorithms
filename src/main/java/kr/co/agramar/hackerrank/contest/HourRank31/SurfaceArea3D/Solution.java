package kr.co.agramar.hackerrank.contest.HourRank31.SurfaceArea3D;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the surfaceArea function below.
	static int surfaceArea(int[][] A) {
		int colSize = A.length;
	    int rowSize = A[0].length;
	    int topBottomArea = colSize * rowSize * 2;
	    int sideArea = 0;
	    for (int i = 0; i < colSize; i++) {
	    	for (int j = 0; j < rowSize; j++) {
	    		for (int k = 1; k <= A[i][j]; k++) {
	    			int blockSideArea = 0;
	    			try {
	    	 			if (k > A[i+1][j]) {
		    				blockSideArea++;
		    			}
	    			} catch (ArrayIndexOutOfBoundsException e) {
	    				blockSideArea++;
					}
	    			try {
	    				if (k > A[i-1][j]) {
		    				blockSideArea++;
		    			}
	    			} catch (ArrayIndexOutOfBoundsException e) {
	    				blockSideArea++;
	    			}
	    			try {
	    				if (k > A[i][j+1]) {
		    				blockSideArea++;
		    			}
	    			} catch (ArrayIndexOutOfBoundsException e) {
	    				blockSideArea++;
	    			}
	    			try {
		    			if (k > A[i][j-1]) {
		    				blockSideArea++;
		    			}
	    			} catch (ArrayIndexOutOfBoundsException e) {
	    				blockSideArea++;
	    			}
	    			
//	    			System.out.println("블럭 [" + i + "][" + j + "][" +k + "]의 옆넓이 : " + blockSideArea);
	    			sideArea += blockSideArea;
	    		}
	    	}
	    }
	    
//	    System.out.println(topBottomArea + sideArea);
		return topBottomArea + sideArea;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] HW = scanner.nextLine().split(" ");

		int H = Integer.parseInt(HW[0]);

		int W = Integer.parseInt(HW[1]);

		int[][] A = new int[H][W];

		for (int i = 0; i < H; i++) {
			String[] ARowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < W; j++) {
				int AItem = Integer.parseInt(ARowItems[j]);
				A[i][j] = AItem;
			}
		}

		int result = surfaceArea(A);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}