package jump2java;

class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
}

public class semoysyz0502_1 {
	public static void main(String[]args) {
		Animal cat = new Animal();
		cat.setName("boby");
		
		Animal dog = new Animal();
		dog.setName("happy");
		
		System.out.println(cat.name);
		System.out.println(dog.name);
	}
}
