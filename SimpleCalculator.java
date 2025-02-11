import java.util.Scanner;
public class SimpleCalculator {
	public static double  calculate(Object[] input) {
		double num1=(double)input[0];
		char operator=(char)input[1];
		double num2=(double)input[2];
		if(operator == '+') {
			return num1+num2;
		}
		else if(operator =='-') {
			return num1-num2;
			}
		else if(operator =='*') {
			return num1*num2;
			}
		else if(operator =='/') {
			if(num2!=0) {
			return num1/num2;
			}
		
		else {
			System.out.println("Error: Division by zero is not posible");
			return Double.NaN;
		}
		}
			else {
			System.out.println("Error: Invalid operator");
			return Double.NaN;
		}
	}
		
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1=sc.nextDouble();
		System.out.println("Enter operator(+,-,*,/):");
		char operator=sc.next().charAt(0);
		System.out.println("Enter Second number:");
		double num2=sc.nextDouble();
		
		Object[] input= {num1,operator,num2};
		
		double result=calculate(input);
		System.out.println("Result: " + result );
		
			}
}
