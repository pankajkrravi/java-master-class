package floatAnddoublePrimitivetype;

public class FloatAndDouble {

	public static void main(String[] args) {

		float minValue = Float.MIN_VALUE;

		float maxValue = Float.MAX_VALUE;
		System.out.println("Float min value = " + minValue);
		System.out.println("Float max value = " + maxValue);

		double duobleminValue = Double.MIN_VALUE;

		double doublemaxValue = Double.MAX_VALUE;
		System.out.println("Double min value = " + duobleminValue);
		System.out.println("Double max value = " + doublemaxValue);
		
		// Exercise 
		//float floatNum = 453.90;// compile time error will be thrown
		// Q. how do you fox this error for variable floatNum
		// Solution
		float floatNumSol1 = 453.90f;
		float floatNumsol2 = (float) 453.90;
		double doubleNumber = 7865.67567;
	}
}
