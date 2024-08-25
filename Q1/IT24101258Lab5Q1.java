import java.util.Scanner;
public class IT24101258Lab5Q1 {
	public static void main(String[] args) {
	        Scanner input= new Scanner(System.in);
	        int max,min;
        	System.out.print("Enter the first integer:");
		int num1=input.nextInt();
		System.out.print("Enter the second integer:");
		int num2=input.nextInt();
		System.out.print("Enter the third integer:");
		int num3=input.nextInt();
		if(num1>num2){
			max=num1;
			min=num2;
		}
		else{
			max=num2;
			min=num1;
		}
		if(num3>max){
			max=num3;
		}
		if(num3<min){
			min=num3;
		}
		System.out.println("User entered numbers are: "+num1+" "+num2+" "+num3);
		System.out.println("The Smallest number is: "+min);
		System.out.println("The largest number is: "+max);
	}
}