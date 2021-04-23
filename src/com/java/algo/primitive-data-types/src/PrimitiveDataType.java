
public class PrimitiveDataType {

	public static void main(String[] args) {

		int myValue = 100;
		int minIntValue = Integer.MIN_VALUE;
		int maxIntValue = Integer.MAX_VALUE;
		System.out.println("Ingeger min value = " + minIntValue);
		System.out.println("Integer max value = " + maxIntValue);
		
		//add +1 to max value  and -1 to min value
		System.out.println("Add 1 to max value = "+maxIntValue+1); //overflow will happen
		//System.out.println("subs 1 to min value = "+minIntValue-1);// unnderflow will happen
		
		//int maxintvalue=2147483648;// will get compile time error  saying that The literal 2147483648 of type int is out of range 
		
		//int maxvalue=2_147_483_647;// will not give any error
	}
}
