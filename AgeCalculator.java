package screen;
/*accept person date of birth & find out the current age */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator 
{
	
	public static void main(String[] args) 
	{
		// Birthdate
        LocalDate birthdate = LocalDate.of(2005, 07, 22);

        // Current Date
        LocalDate currentDate = LocalDate.now();

        // Calculate Age
        int age = calculateAge(birthdate, currentDate);

        // Print Age
        System.out.println("Age: " + age + " years");
    }

    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) 
    {
        
        Period period = Period.between(birthdate, currentDate);
        
          return period.getYears();
    }
	}



