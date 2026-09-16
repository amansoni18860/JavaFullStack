package ImmutableStrings;

public class StringImmutable {

	public static void main(String[] args) {

		String str = "Rohan";
		String str2 = "Singh";

		str=str.concat(str2);

		System.out.println(str);

		String s1 = "sachin"; // string pool
		String s2 = "Sohan"; // string pool

		String s3 = new String("sachin"); // heap
		String s4 = new String("Sohan");

		String s5 = "Saching";
		String s6 = new String("Rohit");

		String s7 = "Sachin";

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s1.charAt(0));

		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s7));
		System.out.println(s1.equals(s3));

		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s7));
		System.out.println(s1.compareTo(s6));

		System.out.println(s1 == s3);
		System.out.println(s1 == s7);
	}

}
