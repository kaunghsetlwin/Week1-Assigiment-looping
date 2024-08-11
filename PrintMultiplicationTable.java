import java.util.Scanner;

public class PrintMultiplicationTable{
	public static void main (String args[]){
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter a number :");
		int y = sr.nextInt();
		
		System.out.println("Multiplication Table for "+y); 
		for(int i = 1;i<=10;i++){
			System.out.println(y+"*"+i+"="+y*i);
		}
	
	}
}