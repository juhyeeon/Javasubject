package hello;

import java.util.Random;

public class T7 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // 11~19 범위의 랜덤한 정수 생성하여 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 11 + random.nextInt(9); // 11부터 19까지의 정수 생성
        }

        // 배열에 저장된 정수 출력
        System.out.println("배열에 저장된 정수:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 배열에 저장된 정수의 평균 계산 및 출력
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("평균: " + average);
    }
}
