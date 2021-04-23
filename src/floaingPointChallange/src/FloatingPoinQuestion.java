package floaingPointChallange.src;

public class FloatingPoinQuestion {
	public static void main(String[] args) {

		int intval = 100 / 2;
		float floatVal = (100f / 2f);
		double doubleVal = (100d / 2d);

		System.out.println("Int value= " + intval);
		System.out.println("Float value =" + floatVal);
		System.out.println("Double value = " + doubleVal);
		System.out.println("=======================================");
		int intval1 = 100 / 3;
		float floatVal1 = (100f / 3f);
		double doubleVal1 = (100d / 3d);

		System.out.println("Int value= " + intval1);
		System.out.println("Float value =" + floatVal1);
		System.out.println("Double value = " + doubleVal1);
		System.out.println("=======================================");
		int intval2 = 100 / 3;
		float floatVal2 = (100f / 3f);
		double doubleVal2 = (100.00 / 3.00);

		System.out.println("Int value= " + intval2);
		System.out.println("Float value =" + floatVal2);
		System.out.println("Double value = " + doubleVal2);
	}
}
