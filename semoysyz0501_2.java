package jump2java;

class Calculator1 {
	static int result = 0;
		
	static int add(int num) {
		result += num;
		return result;
	}
}

class Calculator2 {
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}


	public class semoysyz0501_2 {
		public static void main(String[]args) {
			System.out.println(Calculator.add(3));
			System.out.println(Calculator.add(4));
			
			
			System.out.println(Calculator.add(3));
			System.out.println(Calculator.add(7));
			
		}
	}