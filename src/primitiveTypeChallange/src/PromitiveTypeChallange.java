package primitiveTypeChallange.src;

public class PromitiveTypeChallange {

	public static void main(String[] args) {

		byte byteNumber = 123;
		short shortNumber = 32767;
		int intNumber = 867656;

		long longNumber = 50000L * 10L*(byteNumber + shortNumber+intNumber);
		
		System.out.println(longNumber);
		
		short  shortTotal=(short)(100+10*byteNumber+shortNumber+intNumber);
		System.out.println(shortTotal);

	}
}
