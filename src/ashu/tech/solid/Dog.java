package ashu.tech.solid;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void run() {
		System.out.println("Dog is running");
	}

	@Override
	public void swim() {
		System.out.println("Dog is swimming");
	}
}
