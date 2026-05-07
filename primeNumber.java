package jump2java;
import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		
	while(true) {
		System.out.println("2이상 정수 입력해!");
		num = sc.nextInt();
		
		if(num>=2) break;
		
	}
	
	boolean isPrime = false;
	
	for(int i=2; i<num; i++) {
		if(num % i == 0) {
			isPrime = false;
			break;
		}
	}
	
 }
}