package java2;

import java.util.HashMap;
import java.util.Scanner;

public class Diary {
    private HashMap<Integer, String> diaryEntries;
    private Scanner scanner;

    public Diary() {
        diaryEntries = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void addEntry(int date, String text) {
        diaryEntries.put(date, text);
    }

    public void viewEntries() {
        for (int date : diaryEntries.keySet()) {
            System.out.println(date + ": " + diaryEntries.get(date));
        }
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("기록:1, 보기:2, 종료:3>>");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비

            switch (choice) {
                case 1:
                    System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>> ");
                    int date = scanner.nextInt();
                    String text = scanner.next();
                    addEntry(date, text);
                    break;
                case 2:
                    viewEntries();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.run();
    }
}

