package jump2java;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 입력: ");
        int a = sc.nextInt();

        System.out.print("두 번째 수 입력: ");
        int b = sc.nextInt();

        System.out.print("세 번째 수 입력: ");
        int c = sc.nextInt();

        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("최소값: " + min);

        sc.close();
    }
}