package java_Introduction_vol5.Chapter_1;

public class BasicExpression {
	public static void myIntroduction() {
		String name;
		char bloodType;
		int bornYear;
		int age;
		double detailAge;

		name = "Hashio";
		bloodType = 'A';
		bornYear = 2001;
		age = 25;
		detailAge = age + (double) 365 / (30 * 7 + 4);

		System.out.println("name is " + name + ".");
		System.out.println("blood type is " + bloodType + ".");
		System.out.println("I was born in " + bornYear + ".");
		System.out.println("age is " + age + " years old.");
		System.out.println("More precisely, my age is " + detailAge + " years old.");
	}

}
