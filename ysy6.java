package jump2java;

public class ysy6 {
	public static void main(String[]args) {
		int money = 10000;
		int coffee = 2;
		
		while (money > 3000) {
			System.out.println("커피 드립니다.");
		coffee--;
		money -= 3000;
		if(coffee == 0) {
			break;
		}
		
		}
	}
}
