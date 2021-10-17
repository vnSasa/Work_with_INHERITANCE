package ua.yaremechko.inheritance.animal;

public class Application {

	public static void main(String[] args) {
		
		Animal animal = new Animal("Leopard", 20, 7);
		System.out.println(animal);
		
		animal.setName("Bull");
		animal.setSpeed(2);
		animal.setAge(14);
		System.out.println(animal);
	}

}
