package ashu.tech.polymorphism;

public class Tiger extends Animal implements AnimalInterface{
	
	@Override
	public void eat() {
		System.out.println("Tiger eats");
	}
}
