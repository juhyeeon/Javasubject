package hello;

import java.util.Random;
import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wrongCount = 0;

        while (wrongCount < 3) {
            int num1 = random.nextInt(9) + 1; // 1~9 사이의 랜덤한 수
            int num2 = random.nextInt(9) + 1; // 1~9 사이의 랜덤한 수
            int correctAnswer = num1 * num2;

            System.out.printf("%d * %d = ?\n", num1, num2);
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
                wrongCount++;
            }
        }

        System.out.println("3번 틀렸습니다. 프로그램을 종료합니다.");
        scanner.close();
    }
}
