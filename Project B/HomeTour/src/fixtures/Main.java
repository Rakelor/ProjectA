package fixtures;

public class Main {
	public static void main(string[] args) {
		Cat cat = new Cat();
		cat.setName("Garfield");
		cat.setNumberOfLives(9);
		
		System.out.println(cat);
		
		Animal myAnimal = cat;
		
		//only have access via myAnimal to Animal's method
		myAnimal.setName("Garf");
	}
	
	/*
	 * public abstract void eat(); will not work
	 * abstract key word can be used on methods and classes
	 * abstraction theory is just have an empty method like in eat()
	 * an abstract class is a class that can't be instantiated.
	 * no Animal newAnimal = new Animal;
	 * the benefit from having a class that you can't make object from is extending that
	 * class. You use abstract animal to determine what a specific object "cat" can do
	 */
	private static void viewAnimal(Animal animal) {
		System.out.println(animal);
	}

}
