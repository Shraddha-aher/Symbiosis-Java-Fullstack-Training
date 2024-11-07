package demo;
import java.util.HashMap;
public class TwoSum {
			public static void main(String[] args) {
	        int[] nums = {2, 7, 11, 15}; // Example array
	        int target = 9; // Target sum

	        int[] indices = findTwoSum(nums, target);
	        
	        if (indices != null) {
	            System.out.println("Indices of the two numbers: " + indices[0] + " and " + indices[1]);
	        } else {
	            System.out.println("No two numbers add up to the target.");
	        }
	    }

	    public static int[] findTwoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i }; // Return indices
	            }
	            map.put(nums[i], i);
	        }
	        
	        return null; // No solution found
	    }
	}



