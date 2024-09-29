package hello;

import java.util.Random;
import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("게임을 시작하려면 엔터키를 누르세요 (종료하려면 '그만'을 입력하세요): ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num1 = random.nextInt(3); // 0, 1, 2 중 랜덤한 수 생성
            int num2 = random.nextInt(3);
            int num3 = random.nextInt(3);

            System.out.printf("결과: %d %d %d\n", num1, num2, num3);

            if (num1 == num2 && num2 == num3) {
                System.out.println("성공, 대박났어요!");
                System.out.print("계속하시겠습니까? (yes/no): ");
                String continueInput = scanner.nextLine();
                if (continueInput.equalsIgnoreCase("no")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } else {
                System.out.println("아쉽네요, 다시 시도해보세요.");
            }
        }

        scanner.close();
    }
}

