/* 1. abstract 클래스명: Machine
 * => start()메소드를 이름만 정의(abstract)
 * 2. Computer 클래스를 만듦, Machine 클래스를 상속받음
 * => start() 메소드 구현: "시작"을 화면에 출력
 * 3. Main 에서 Computer 객체를 생성
 * 이 객체에서 start() 메소그 실행 */
package jump2java;

abstract class Machine {
	abstract void start();
}
	
class Computer extends Machine{
	void start() {
		System.out.println("시작");
	}
}

public class T0528A {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.start();	
	}
}
