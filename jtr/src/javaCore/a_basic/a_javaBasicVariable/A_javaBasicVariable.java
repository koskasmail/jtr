package javaCore.a_basic.a_javaBasicVariable;

public class A_javaBasicVariable {

	/*
	 * primitive variable
	 */
	public static int intCount = 0;

	private boolean flage = false; // boolean
	private int busCounter = 32321; // integer

	private char grade = 'A'; // char
	private char gardeNumber = 67; // char number
	private String Describe; // String sequence of characters.

	private float CurrentAge = 3.2F; //
	private double PeopleCount = 332343234D;

	private static final double PI = 3.1415929; // final is a constant,(we cannot change the value)

	public A_javaBasicVariable() {
		System.out.println("---[A_javaBasicVariable]------------");

		/*
		 * variable declare
		 */
		int intAge = 55; // integer
		boolean blFlage = false; // boolean
		char grade = 'A'; // char
		char gardeNumber = 67; // char
		String StSayHello = "Hello"; // String sequence of characters.
		int hh = 16, mm = 34, ss = 34, ms = 55;

		/*
		 * print
		 */
		System.out.println("integer " + intAge);
		System.out.println("boolean " + blFlage);
		System.out.println("char " + grade);
		System.out.println("My Age is " + intAge);
		System.out.println("the time is:  " + hh + ":" + mm + ":" + ss + ":" + ms);

		System.out.println("\nVariable / Atributes:");

		System.out.println("Byte (8 bit / 1 byte) == " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE);
		System.out.println("Short (16 bit / 2 byte) == " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE);
		System.out.println("int / Integer (32 bit / 4 byte) == " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE);
		System.out.println("Long (64 bit / 8 byte)  == " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE);
		System.out.println("char / Character (16 bit / 2 byte)  == " + Character.MIN_VALUE + " <--> " + Character.MAX_VALUE);

		System.out.println("Float (32 bit / 4 byte) == " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
		System.out.println("Double (64 bit / 8 byte) == " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);

		// static variable (no need for instance of the class.
		intCount++;
		intCount++;
		System.out.println("Calling static variable: intCount++ : " + intCount);

		System.out.println("PI == " + PI);
	}
}
