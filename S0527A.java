package jump2java;
import java.util.Scanner;
//동물 인형 클래스
class Animal{
	String name;  double weight;  String color;
	
	//생성자
	Animal(String name){
		this.name = name;
	}
	
	//색 지정 메서드(void 형)
	void setColor(String color) {
		this.color = color;
	}
	
	// 울음소리를 출력하는 메서드(울음소리라고 출력함)
	void sound() {
		System.out.println(this.name + "가 운다.");
	}
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	// 메서드 오버로딩
	void sound() {
		System.out.println("멍멍");
	}
	
}


public class S0527A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		
		Animal dog1 = new Animal(name);
		Dog dog2 = new Dog("퍼피");
		
		dog1.setColor("red");
		System.out.println(dog1.name+" "+dog1.color);
		dog1.sound();
		
		dog2.setColor("white");
		System.out.println(dog2.name+" "+dog2.color);
		dog2.sound();	
	}
}
