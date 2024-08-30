import java.util.Scanner;
public class operation {
	 static int op;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int add, sub, multi, div, num1, num2;
	Scanner sc=new Scanner(System.in);
	System .out. print("1.Addition \n2.substraction\n3.Multiplication\n4.division");
	System.out.print("please choice a operation");
	op=sc.nextInt();
	
	System.out.print("Enter afirst no:");
	num1=sc.nextInt();
	System.out.print("Enter a second no:");
	num2=sc.nextInt();
	
	add=num1+num2;
	sub=num1+num2;
	multi=num1*num2;
	div=num1/num2;
	
	switch (op) {
	case 1:
		System.out.println("addition of two no Is:"+add);
		break;
	case 2:
		System.out.println("substraction of two no Is:"+sub);
		break;
	case 3:
		System.out.println("multiplication of two no Is:"+multi);
		break;
	case 4:
		System.out.println("division of two no Is:"+div);
		break;
		default:
			System.out.println("operation is not valid...");
		
		
		
	}
	
	
	
			
		

	}

}
