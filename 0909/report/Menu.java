//110page 3번
package JavaSub;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 각 메뉴의 가격
        int tteokbokkiPrice = 2000;
        int gimbapPrice = 1000;
        int jjolmyeonPrice = 3000;

        // 사용자 입력 받기
        System.out.print("떡볶이 주문 수량: ");
        int tteokbokkiQty = scanner.nextInt();

        System.out.print("김말이 주문 수량: ");
        int gimbapQty = scanner.nextInt();

        System.out.print("쫄면 주문 수량: ");
        int jjolmyeonQty = scanner.nextInt();

        // 총 금액 계산
        int totalPrice = (tteokbokkiQty * tteokbokkiPrice) + (gimbapQty * gimbapPrice) + (jjolmyeonQty * jjolmyeonPrice);

        // 결과 출력
        System.out.println("총 금액: " + totalPrice + "원");
    }
}