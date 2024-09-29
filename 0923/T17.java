package hello;


import java.util.Scanner;

public class T17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] coffee = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int[] price = {3000, 2500, 4000, 5000};

        while (true) {
            System.out.print("주문할 커피를 입력하세요 (종료하려면 '그만'을 입력하세요): ");
            String order = scanner.nextLine();

            if (order.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            boolean found = false;
            for (int i = 0; i < coffee.length; i++) {
                if (coffee[i].equals(order)) {
                    System.out.print("몇 잔을 주문하시겠습니까? ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // 버퍼 비우기

                    int totalPrice = price[i] * quantity;
                    System.out.println(order + " " + quantity + "잔의 가격은 " + totalPrice + "원입니다.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("해당 커피를 찾을 수 없습니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}

