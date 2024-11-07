package demo;
import java.util.Arrays;
public class MoveZeros {
			public static void main(String[] args) {
	        int[] nums = {0, 1, 0, 3, 12}; // Example array
	        moveZeros(nums);
	        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
	    }

	    public static void moveZeros(int[] nums) {
	        int lastNonZeroIndex = 0; // Pointer for the position of non-zero elements

	        // Move all non-zero elements to the front
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[lastNonZeroIndex] = nums[i];
	                lastNonZeroIndex++;
	            }
	        }

	        // Fill the remaining positions with zeros
	        for (int i = lastNonZeroIndex; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	    }
	}


