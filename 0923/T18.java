package hello;

import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 10명의 학생 학번과 점수를 저장할 배열
        int[] studentIds = new int[10];
        int[] scores = new int[10];
        
        // 학생 학번과 점수 입력 받기
        for (int i = 0; i < 10; i++) {
            System.out.print("학생 " + (i + 1) + "의 학번과 점수를 입력하세요 (예: 12345 90): ");
            studentIds[i] = scanner.nextInt();
            scores[i] = scanner.nextInt();
        }
        
        while (true) {
            System.out.print("학번 또는 점수를 입력하세요 (종료하려면 '그만'을 입력하세요): ");
            String input = scanner.next();
            
            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            try {
                int inputNumber = Integer.parseInt(input);
                boolean found = false;
                
                // 학번으로 검색
                for (int i = 0; i < 10; i++) {
                    if (studentIds[i] == inputNumber) {
                        System.out.println("학번 " + inputNumber + "의 점수는 " + scores[i] + "점입니다.");
                        found = true;
                        break;
                    }
                }
                
                // 점수로 검색
                if (!found) {
                    for (int i = 0; i < 10; i++) {
                        if (scores[i] == inputNumber) {
                            System.out.println("점수 " + inputNumber + "의 학번은 " + studentIds[i] + "입니다.");
                            found = true;
                            break;
                        }
                    }
                }
                
                if (!found) {
                    System.out.println("입력한 학번 또는 점수를 찾을 수 없습니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
            }
        }
        
        scanner.close();
    }
}


