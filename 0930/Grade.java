package java2;

import java.util.Scanner;

class Grade {
    String name;
    int javaScore;
    int webScore;
    int osScore;

    // 생성자
    public Grade(String name, int javaScore, int webScore, int osScore) {
        this.name = name;
        this.javaScore = javaScore;
        this.webScore = webScore;
        this.osScore = osScore;
    }

    // 이름을 반환하는 메서드
    public String getName() {
        return name;
    }

    // 평균 점수를 계산하는 메서드
    public double getAverage() {
        return (javaScore + webScore + osScore) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>> ");
        String name = scanner.next();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();
        Grade st = new Grade(name, java, web, os);
        System.out.println(st.getName() + "의 평균은 " + st.getAverage());
        scanner.close();
    }
}
