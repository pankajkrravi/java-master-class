package CastingInJava.src;
public class CastingInJava {
	public static void main(String[] args) {
		int actualValue = 100;
		int div = (actualValue / 2); // no casting becoz data type of div is int
		System.out.println(div);

		byte newDivInByte = (byte) (actualValue / 2);// Compile time error saying that Type mismatch: cannot convert
														// from int to byte
		System.out.println(newDivInByte);
		
		short newDivInShort = (short) (actualValue / 2);
		System.out.println("int to short casted value : "+newDivInShort);
	}
}
