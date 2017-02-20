package Salesforce;

import java.util.PriorityQueue;

public class MatrixMinSum {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1},{1,2},{4,3,2},{4,3,1,2}};
		int minSum =0;
		
		PriorityQueue<Integer> pd = new PriorityQueue<>();
		for(int i =0;i<matrix.length;i++){			
			for(int j=0;j<=i;j++){
				pd.add(matrix[i][j]);				
			}
			System.out.print(pd.peek() + " ");
			minSum= minSum + pd.poll();			
			pd.clear();			
		}
		System.out.println("\n" + minSum);

	}

}
