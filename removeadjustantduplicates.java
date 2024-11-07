package demo;
import java.util.Stack;
public class RemovedAdjucentDuplicates {
	

	

	    public static void main(String[] args) {
	        String input = "abbaca"; // Example input string
	        String result = removeAdjacentDuplicates(input);
	        System.out.println("String after removing adjacent duplicates: " + result);
	    }

	    public static String removeAdjacentDuplicates(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            // If the stack is not empty and the top element is the same as current character
	            if (!stack.isEmpty() && stack.peek() == c) {
	                stack.pop(); // Remove the top element
	            } else {
	                stack.push(c); // Add current character to the stack
	            }
	        }

	        // Build the resulting string from the stack
	        StringBuilder result = new StringBuilder();
	        while (!stack.isEmpty()) {
	            result.insert(0, stack.pop());
	        }

	        return result.toString();
	    }
	}


