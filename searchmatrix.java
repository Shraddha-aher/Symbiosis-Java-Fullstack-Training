package demo;

public class SearchMatrix {

	public static void main(String[] args) {
		        int[][] matrix = {
		            {1,  2,  8,  9},
		            {2,  4,  9,  12},
		            {4,  7,  10, 13},
		            {6,  8,  11, 15}
		        };

		        int target = 10; // Number to search for
		        boolean found = searchNumber(matrix, target);
		        
		        if (found) {
		            System.out.println(target + " is found in the matrix.");
		        } else {
		            System.out.println(target + " is not found in the matrix.");
		        }
		    }

		    public static boolean searchNumber(int[][] matrix, int target) {
		        if (matrix.length == 0 || matrix[0].length == 0) {
		            return false;
		        }
		        
		        int rows = matrix.length;
		        int cols = matrix[0].length;
		        
		        // Start from the top-right corner
		        int row = 0;
		        int col = cols - 1;

		        while (row < rows && col >= 0) {
		            if (matrix[row][col] == target) {
		                return true; // Target found
		            } else if (matrix[row][col] > target) {
		                col--; // Move left
		            } else {
		                row++; // Move down
		            }
		        }
		        
		        return false; // Target not found
		    
		
		// TODO Auto-generated method stub

	}

}
