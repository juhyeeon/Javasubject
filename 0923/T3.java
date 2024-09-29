package hello;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // 양의 정수가 입력될 때까지 반복
        do {
            System.out.print("양의 정수를 입력하세요: ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("양의 정수를 입력해야 합니다. 다시 시도하세요.");
            }
        } while (number <= 0);

        // 입력된 정수부터 1까지 * 출력
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
	}

}
