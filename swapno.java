import java.util.Scanner;
public class swapno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first no:");
		num1=sc.nextInt();

		System.out.println("Enter second no:");
		num2=sc.nextInt();
		System.out.println("N before Swapping:");
		System.out.println("-------------");
		
		int temp1=num1;
		num1=num2;
		num2=temp1;
		System.out.println("No afer swapping");
		System.out.println("first no:"+num1);
		System.out.println("second no:"+num2);
	}

}
