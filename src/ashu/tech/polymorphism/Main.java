package ashu.tech.polymorphism;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Animal tiger = new Tiger();
		tiger.eat();
		
		AnimalInterface tiger1 = new Tiger();
		tiger1.eat();
		
		Animal elephant = new Elephant();
		elephant.eat();

	}
	
	public void whoEats(Animal animal) {
		animal.eat();
	}

}
