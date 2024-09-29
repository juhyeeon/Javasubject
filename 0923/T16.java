package hello;


import java.util.ArrayList;
import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        System.out.print("양수들을 한 줄에 입력하세요: ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                if (number > 0) {
                    numbers.add(number);
                    sum += number;
                } else {
                    System.out.println(token + "제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(token + "제외");
            }
        }

        if (numbers.size() > 0) {
            double average = (double) sum / numbers.size();
            System.out.println("양수들의 평균: " + average);
        } else {
            System.out.println("입력된 양수가 없습니다.");
        }

        scanner.close();
    }
}
