package java2;

import java.util.ArrayList;

class Average {
    private ArrayList<Integer> numbers;

    // 생성자
    public Average() {
        numbers = new ArrayList<>();
    }

    // 정수를 저장하는 메서드
    public void put(int number) {
        if (numbers.size() < 10) {
            numbers.add(number);
        } else {
            System.out.println("최대 10개의 정수만 저장할 수 있습니다.");
        }
    }

    // 저장된 모든 정수를 출력하는 메서드
    public void showAll() {
        System.out.println("저장된 정수: " + numbers);
    }

    // 평균을 계산하는 메서드
    public double getAvg() {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.println("평균은 " + avg.getAvg());
    }
}
