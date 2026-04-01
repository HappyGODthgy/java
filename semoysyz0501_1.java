package jump2java;

class Calculator {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}


public class semoysyz0501_1 {
	public static void main(String[]args) {
		System.out.println(Calculator.add(3));
		System.out.println(Calculator.add(4));
	}
}
