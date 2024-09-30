package screen;

import java.time.LocalDate;

public class retirement 
{
	  public static void main(String[] args) {
	        // Input date of joining (yyyy-MM-dd)
	        String joiningDate = "1950-01-01";

	        // Convert joining date to LocalDate object
	        LocalDate localJoiningDate = LocalDate.parse(joiningDate);

	        // Calculate retirement date by adding 58 years
	        LocalDate retirementDate = localJoiningDate.plusYears(58);

	        // Print the calculated retirement date
	        System.out.println("Retirement Date: " + retirementDate);
	    }
}
