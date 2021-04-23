
public class Operatoe_Operand {
	public static void main(String[] args) {

		int numer1 = 90;
		int number2 = 88;

		int sum = numer1 + number2;

		System.out.println("Sum of first and 2nd number =" + sum);

		int sub = numer1 - number2;
		System.out.println("Substraction =" + sub);

		int mul = numer1 * number2;
		System.out.println("Multiplication = " + mul);
		int result = numer1 / number2;
		System.out.println("Division =" + result);
		
		// Abbreviation Operator
		result++;//1+1=2
		System.out.println("1 + 1 = "+result);
		
		result--;// 2 - 1 = 1
		
		// result=result+2;
		result+=2; //1+ 2 = 3
		
		System.out.println("1 + 2 = "+result);
		
		// result=result*10;
		
		result*=10;
		System.out.println("3 * 10 = "+result);
		
		// result=result/3;
		result/=3;
		System.out.println("30 / 3 = "+result);
		
		// result=result-2;
		result-=2;
		System.out.println("10 - 2 = "+result);
	}
}
