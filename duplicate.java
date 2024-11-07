package demo;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums = {3, 1, 3, 4, 2}; // Example array
        Integer duplicate = findDuplicate(nums);
        
        if (duplicate != null) {
            System.out.println("Duplicate number: " + duplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public static Integer findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return num; // Duplicate found
            }
            seen.add(num);
        }
        
        return null; // No duplicates
    }

		// TODO Auto-generated method stub

	}
