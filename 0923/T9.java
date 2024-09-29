package hello;

import java.util.Random;

public class T9 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

        // 2차원 배열에 랜덤한 정수 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(256); // 0~255 범위의 랜덤한 정수 생성
            }
        }

        // 2차원 배열 출력
        System.out.println("생성된 2차원 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
