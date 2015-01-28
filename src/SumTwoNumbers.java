import java.util.Scanner;

public class SumTwoNumbers {
private static Scanner input;

public static void main(String [] args){
	
	input = new Scanner(System.in);
	int a;
	int b;
	int sum;
	
	a=input.nextInt();
	b=input.nextInt();
	sum=a+b;
	System.out.println(sum);
	
}
}
