package jump2java1;

class Book{
	// title 변수
	String title;
	
	// 생성자
	Book(String t){
		title = t;
	}
	
	// 메서드 info(): 제목 출력
	void info() {
		System.out.println("제목: "+ title);
	}
	// 메서드 read(): "책을 읽는다." 출력
	void read() {
		System.out.println("책을 읽는다.");
	}
}

class EBook extends Book{
	// title 변수 상속받음. 추가로 format(String) 변수 선언
	String format;
	
	// 생성자
	EBook(String t, String f){
		super(t);		// 부모의 생성자 호출
		format = f;
	}
	
	// read(), info() 메서드
	void read() {
		System.out.println("전자책을 읽는다.");
	}
	
	// info() 오버로드
	void info() {
		super.info();
		System.out.println("형식: " + format);
	}
}

public class BookProgram {
	public static void main(String[] args) {
		Book book1 = new Book("자바 기초");
		EBook book2 = new EBook("자바 입문", "PDF");
		
		book1.info();	// 제목: 자바 기초
		System.out.println("===================");
		book2.info();	// 제목: 자바 입문
						// 형식: PDF
		System.out.println("===================");
		
		book1.read();	// 책을 읽는다.
		System.out.println("===================");
		book2.read();	// 전자책을 읽는다.
		System.out.println("===================");
		
		
		
		
	}
}
