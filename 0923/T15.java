package hello;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("곱하고자 하는 정수 2개 입력>> ");
                n = scanner.nextInt();
                m = scanner.nextInt();
                validInput = true; // 정수가 입력되면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력을 버립니다.
            }
        }

        System.out.println(n + " X " + m + " = " + (n * m));
        scanner.close();
    }
}
