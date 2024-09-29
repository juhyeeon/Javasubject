package hello;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // 1부터 100 사이의 랜덤 숫자 생성
            int cardNumber = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("카드 번호 맞추기 게임");
            System.out.println("1부터 100 사이의 숫자를 입력하세요.");

            // 사용자가 숫자를 맞출 때까지 반복
            while (guess != cardNumber) {
                System.out.print("숫자를 입력하세요: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < cardNumber) {
                    System.out.println("더 큰 숫자를 입력");
                } else if (guess > cardNumber) {
                    System.out.println("더 작은 숫자를 입력.");
                } else {
                    System.out.println("축하합니다! " + attempts + "번 만에 숫자를 맞추셨습니다.");
                }
            }

            // 게임을 다시 할지 물어보기
            System.out.print("다시 하겠습니까? (y/n): ");
            char response = scanner.next().charAt(0);
            playAgain = (response == 'y' || response == 'Y');

        } while (playAgain);

        System.out.println("게임을 종료합니다.");
        scanner.close();
    }
}
