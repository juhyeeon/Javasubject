package java2;

import java.util.Scanner;

class Seat {
    private String[] seats;
    private String type;

    public Seat(String type) {
        this.type = type;
        this.seats = new String[10];
    }

    public void reserve(String name, int seatNumber) {
        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("잘못된 좌석 번호입니다.");
            return;
        }
        if (seats[seatNumber - 1] != null) {
            System.out.println("이미 예약된 좌석입니다.");
        } else {
            seats[seatNumber - 1] = name;
            System.out.println("예약되었습니다.");
        }
    }

    public void cancel(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].equals(name)) {
                seats[i] = null;
                System.out.println("예약이 취소되었습니다.");
                return;
            }
        }
        System.out.println("예약자 이름을 찾을 수 없습니다.");
    }

    public void show() {
        System.out.print(type + "석: ");
        for (String seat : seats) {
            if (seat == null) {
                System.out.print("--- ");
            } else {
                System.out.print(seat + " ");
            }
        }
        System.out.println();
    }
}

public class ConcertReservation {
    private Seat[] seats;
    private Scanner scanner;

    public ConcertReservation() {
        seats = new Seat[3];
        seats[0] = new Seat("S");
        seats[1] = new Seat("A");
        seats[2] = new Seat("B");
        scanner = new Scanner(System.in);
    }

    public void reserve() {
        System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
        int seatType = scanner.nextInt();
        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>> ");
        int seatNumber = scanner.nextInt();
        seats[seatType - 1].reserve(name, seatNumber);
    }

    public void view() {
        for (Seat seat : seats) {
            seat.show();
        }
    }

    public void cancel() {
        System.out.print("좌석 구분 S(1), A(2), B(3)>> ");
        int seatType = scanner.nextInt();
        System.out.print("이름>> ");
        String name = scanner.next();
        seats[seatType - 1].cancel(name);
    }

    public void run() {
        System.out.println("콘서트 예약 시스템입니다.");
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    reserve();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void main(String[] args) {
        ConcertReservation app = new ConcertReservation();
        app.run();
    }
}
