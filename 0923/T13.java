package hello;

import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] course = {"C", "C++", "python", "Java", "HTML5"};
        String[] grades = {"A", "B+", "A-", "B", "C+"};

        while (true) {
            System.out.print("과목명을 입력하세요 (또는 '그만'을 입력하세요): ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            boolean found = false;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(input)) {
                    System.out.println(input + " 과목의 학점은 " + grades[i] + "입니다.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(input+"는 없는 과목입니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
