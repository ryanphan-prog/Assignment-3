public class Pet {

	String name;
	int age;

	public Pet(String name, int age) {
	    this.name = name;
	    this.age = age;
	}

	public void speak() {
	    System.out.println(name + " says: Woof! I am " + age + " years old.");
	}	
}
