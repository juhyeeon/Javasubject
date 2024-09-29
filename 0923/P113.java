package hello;

import java.util.Scanner;

public class P113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 상태 입력 받기
        System.out.print("냉장고 상태를 정수형으로 입력하세요 (예: 15): ");
        int status = scanner.nextInt();

        // 입력받은 정수를 2진수 문자열로 변환
        String binaryString = Integer.toBinaryString(status);
        System.out.println("입력된 상태의 2진수 표현: " + binaryString);

        // 비트 0: 전원 상태
        if ((status & 0b00000001) != 0) {
            System.out.println("전원 상태: 켜짐");
        } else {
            System.out.println("전원 상태: 꺼짐");
        }

        // 비트 1: 문 상태
        if ((status & 0b00000010) != 0) {
            System.out.println("문 상태: 닫힘");
        } else {
            System.out.println("문 상태: 열림");
        }

        // 비트 2: 작동 상태
        if ((status & 0b00000100) != 0) {
            System.out.println("작동 상태: 정상 작동");
        } else {
            System.out.println("작동 상태: 손상됨");
        }

        // 비트 3: 온도 상태
        if ((status & 0b00001000) != 0) {
            System.out.println("온도 상태: 3도 미만");
        } else {
            System.out.println("온도 상태: 3도 이상");
        }

        scanner.close();
    }
}
