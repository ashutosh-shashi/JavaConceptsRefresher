package ashu.tech.solid;

public class Camel implements Animal {

	@Override
	public void eat() {
		System.out.println("Camel is eating");
	}

	@Override
	public void run() {
		System.out.println("Camel is running");
	}

	@Override
	public void swim() {
		System.out.println("Camel can not swim");
	}
}
