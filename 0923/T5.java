package hello;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // 양의 정수 10개 입력받기
        System.out.println("양의 정수 10개를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 3의 배수 출력
        System.out.println("3의 배수는:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}

