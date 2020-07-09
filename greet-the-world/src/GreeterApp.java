import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello World");
        
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=scnr.nextInt();
        System.out.println("I can sqaure that for you");
        System.out.println(number*number);
        
	}
	

}
   