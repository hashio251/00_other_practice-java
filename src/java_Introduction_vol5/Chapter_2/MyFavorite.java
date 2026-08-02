package java_Introduction_vol5.Chapter_2;

public class MyFavorite {
	public static void myFavoriteThings() {
		String food;
		String place;
		String hobby;
		String color;
		String animal;

		food = "Ramen";
		place = "Art museum and the sea";
		hobby = "Coding";
		color = "Black";
		animal = "giraffe";

		System.out.println("""
				=====
				My Favorite List
				=====

				Food  : %s
				Place : %s
				Hobby : %s
				Color : %s
				Animal : %s
				""".formatted(food, place, hobby, color, animal));
	}
}