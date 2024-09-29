package hello;

import java.util.Random;
import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 2차원 배열에 랜덤한 정수 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(256); // 0~255 범위의 랜덤한 정수 생성
            }
        }

        // 생성된 배열 출력
        System.out.println("생성된 2차원 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // 임계값 입력받기
        System.out.print("임계값을 입력하세요: ");
        int threshold = scanner.nextInt();

        // 배열 수정
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] > threshold) {
                    array[i][j] = 255;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        // 수정된 배열 출력
        System.out.println("수정된 2차원 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close(); // Scanner를 닫아줍니다.
    }
}
