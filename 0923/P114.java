package hello;
import java.util.Scanner;
public class P114 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 상태 입력 받기
        System.out.print("자동차 상태를 정수형으로 입력하세요 (예: 159): ");
        int status = scanner.nextInt();

        // 입력받은 정수를 2진수 문자열로 변환
        String binaryString = Integer.toBinaryString(status);
        System.out.println("입력된 상태의 2진수 표현: " + binaryString);

        // 비트 0-5: 온도 값 (0~31)
        int temperature = status & 0b00111111;
        System.out.println("현재 온도: " + temperature + "도");

        // 비트 6: 에어컨 상태
        if ((status & 0b01000000) != 0) {
            System.out.println("에어컨 상태: 켜짐");
        } else {
            System.out.println("에어컨 상태: 꺼짐");
        }

        // 비트 7: 자동차 상태
        if ((status & 0b10000000) != 0) {
            System.out.println("자동차 상태: 달리는 중");
        } else {
            System.out.println("자동차 상태: 정지 상태");
        }

        scanner.close();
    }
}
