package JavaSub;

import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("생일을 8자리 정수로 입력하세요 : ");
        int birthday = scanner.nextInt();

        int year = birthday / 10000;
        int month = (birthday % 10000) / 100;
        int day = birthday % 100;

        System.out.println("생일: " + year + "/" + month + "/" + day);
    }
}