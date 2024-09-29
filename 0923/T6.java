package hello;

import java.util.Scanner;

public class T6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // 양의 정수 10개 입력받기
        System.out.println("양의 정수 10개를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("자리수의 합이 9인 수는:");

        // 각 수의 자리수 합이 9인 수를 가려내어 출력
        for (int number : numbers) {
            if (sumOfDigits(number) == 9) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }

    // 자리수의 합을 계산하는 메소드
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
