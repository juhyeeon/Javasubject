package hello;

import java.util.Random;
import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] maleNames = {"민", "준", "서", "도", "예", "시", "우"};
        String[] femaleNames = {"서", "연", "지", "우", "현", "하", "은", "민"};
        String[] middleNames = {"은", "원", "경", "수", "현", "서", "채", "하"};

        while (true) {
            System.out.print("성별을 입력하세요 (남/여) 또는 '그만'을 입력하세요: ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input.equals("남")) {
                int firstIndex = random.nextInt(maleNames.length);
                int middleIndex = random.nextInt(middleNames.length);
                int lastIndex = random.nextInt(maleNames.length);
                System.out.println("추천 남자 이름: " + maleNames[firstIndex] + middleNames[middleIndex] + maleNames[lastIndex]);
            } else if (input.equals("여")) {
                int firstIndex = random.nextInt(femaleNames.length);
                int middleIndex = random.nextInt(middleNames.length);
                int lastIndex = random.nextInt(femaleNames.length);
                System.out.println("추천 여자 이름: " + femaleNames[firstIndex] + middleNames[middleIndex] + femaleNames[lastIndex]);
            } else {
                System.out.println("잘못된 입력입니다. '남' 또는 '여'를 입력하세요.");
            }
        }

        scanner.close();
    }
}

