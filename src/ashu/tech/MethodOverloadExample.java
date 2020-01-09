package ashu.tech;

public class MethodOverloadExample {
	
	public void testOverload(Integer val1) {
		System.out.println("overload with one argument");
	}
	
	public void testOverload(Integer val1, Integer val2) {
		System.out.println("overload with two argument");
	}
	
	public void testOverload() {
		System.out.println("overload with no argument");
		Integer val1 = 10;
		//call method with one argument.
		testOverload(val1);
		Integer val2 = 20;
		//call method with two arguments
		testOverload(val1, val2);
	}

}
