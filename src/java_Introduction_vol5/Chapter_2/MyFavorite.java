package java_Introduction_vol5.Chapter_2;

public class MyFavorite {
	public static void myFavoriteThings() {
		String food;
		String place;
		String hobby;
		String color;

		food = "Ramen";
		place = "Art museum and the sea";
		hobby = "Coding";
		color = "Black";

		System.out.println("""
				=====
				My Favorite List
				=====

				Food  : %s
				Place : %s
				Hobby : %s
				Color : %s
				""".formatted(food, place, hobby, color));
	}
}