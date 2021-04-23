package StringClass.src;
public class MainString {
	public static void main(String[] args) {

		String myName = "My Name is Pankaj";
		System.out.println("My String Name is equal to " + myName);
		myName = myName + ", and this is More";
		System.out.println("My String Name is equal to " + myName);
		myName = myName + " \u00A9 2020";
		System.out.println("My String Name is equal to " + myName);
		String numer = "280.30";
		numer = numer + " 56.75";
		System.out.println(numer);
		String lastStr = "560";
		int myInt = 900;
		lastStr = lastStr + myInt;
		System.out.println(lastStr);

		double doubleNum = 123.67d;
		lastStr = lastStr + doubleNum;
		System.out.println(lastStr);
	}
}
