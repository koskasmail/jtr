package javaCore.a_basic.b_javaBasicVariableMath;

public class JavaArithmetic_OperatorsShorthand2 {

	public JavaArithmetic_OperatorsShorthand2(int number) {
		
		System.out.printf("\n---[Java Arithmetic Operators Short hand]---\n");
		System.out.printf("number = " + number);

		// +=
		System.out.printf("\n (%3d) number += 2 == %3d ", number, (number += 2));

		// -=
		System.out.printf("\n (%3d) number -= 3 == %3d ", number, (number -= 3));

		// *=
		System.out.printf("\n (%3d) number *= 2 == %3d ", number, (number *= 2));

		// /=
		System.out.printf("\n (%3d) number /= 5 == %3d ", number, (number /= 5));

		// %=
		System.out.printf("\n (%3d) number %%= 2 == %3d ", number, number % 2); // "%%" = $"

		System.out.printf("\n");

		// number++
		System.out.printf("\n (%3d)  number++ == %3d ", number, number++);

		// ++number
		System.out.printf("\n (%3d)  ++number == %3d ", number, ++number);

		// number--
		System.out.printf("\n (%3d)  number-- == %3d ", number, number--);

		// --number
		System.out.printf("\n (%3d)  --number == %3d ", number, --number);

		System.out.printf("\n");
	}

}
