package jump2java1;

class Employee{
	// 변수: 이름(String)
	String name;
	// 생성자
	Employee(String n){
		name = n;
	}
	// 메소드 - info() 이름을 출력
	void info() {
		System.out.println("이름 " + name);
	}
	// 메소드 - work() : "업무를 수행한다." 출력
	void work() {
		System.out.println("업무를 수행한다.");
	}
}

class Manager extends Employee{
	String department;
	// 생성자 : 부모 생성자 호출 + department 입력 받음.
	Manager(String n, String d){
		super(n);
		department = d;
	}
	//work()메소드 오버로드 : "팀을 관리한다." 출력
	void work() {
		System.out.println("팀을 관리한다.");
	}
	//info()메소드 오버로드: 부모메서드를 호출 + 부서를 출력
	void info() {
		super.info();
		System.out.println("부서: " + department);
	}
}

public class EmployeePrigram {
	public static void main(String[] args) {
		Employee emp1 = new Employee("스마트");
		Manager emp2 = new Manager("축구", "개발부");
		
		emp1.info();	// 이름: 스마트
		System.out.println("===================");
		emp2.info();	// 이름: 축구
						// 이름: 개발부
		System.out.println("===================");
		emp1.info();	// 업무를 수행한다.
		System.out.println("===================");
		emp2.info();	// 팀을 관리한다.
		System.out.println("===================");
		
		
		
		
		
		
		
		
	}

}
