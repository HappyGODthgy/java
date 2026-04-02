package jump2java;

class Animal2 {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog2 extends Animal2 {
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

public class yun0505_02 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();
	}
}