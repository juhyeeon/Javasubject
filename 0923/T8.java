package hello;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        System.out.print("몇 개의 정수를 저장할지 입력하세요: ");
        int n = scanner.nextInt();

        while (uniqueNumbers.size() < n) {
            int randomNumber = random.nextInt(100) + 1;
            uniqueNumbers.add(randomNumber);
        }

        int[] numbers = new int[n];
        int index = 0;
        for (int number : uniqueNumbers) {
            numbers[index++] = number;
        }

        int sum = 0;
        System.out.print("생성된 정수들: ");
        for (int number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }

        double average = (double) sum / n;
        System.out.println("\n평균: " + average);

        scanner.close(); // Scanner를 닫아줍니다.
    }
}
