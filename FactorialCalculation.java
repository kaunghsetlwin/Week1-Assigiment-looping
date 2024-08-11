
import java.util.Scanner;

public class FactorialCalculation {

	
	public static void main(String[] args) {
		Scanner sr = new Scanner (System.in);
		System.out.print("Enter a number :");
		int y = sr.nextInt();
		int total=1;
		int i=1;
		
		while(i<=y){
			total =total*i;
			i++;
	}
		System.out.println("The Factorial of "+y+" is: "+total);
	}
	
}
