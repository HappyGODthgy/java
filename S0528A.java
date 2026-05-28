/* 추상클래스
 * 공통 기능을 미리 만들어 놓고 세부 기능은 자식 클래스에서 구현
 * 기본 틀만 만들어 놓은 클래스
 * new 를 이용해서 객체를 직접 생성 불가
 * 내용없는 메서드 가능 & 완성된 메서드 가능
 */
package jump2java;

abstract class Animal{
	void sleep() {
		System.out.println("잠");
	}
	abstract void sound();
}

class Dog extends Animal{
	void sound() {
		System.out.println("멍멍");
	}
}

public class S0528A {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		dog.sleep();
	}
}
