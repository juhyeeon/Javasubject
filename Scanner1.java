//110page 1번
package JavaSub;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exchangeRate = 1200; // $1 = 1200원

        System.out.print("달러 금액을 입력하세요: ");
        int dollars = scanner.nextInt();

        System.out.println(dollars + "달러는 " + (dollars * exchangeRate) + "원입니다.");
    }
}