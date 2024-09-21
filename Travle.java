package JavaSub;

import java.util.Scanner;

public class Travle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("여행지: ");
        String destination = scanner.nextLine();

        System.out.print("인원수: ");
        int numberOfPeople = scanner.nextInt();

        System.out.print("숙박일: ");
        int numberOfNights = scanner.nextInt();

        System.out.print("1인당 항공료: ");
        int airfarePerPerson = scanner.nextInt();

        System.out.print("1방당 숙박비: ");
        int roomCostPerNight = scanner.nextInt();

        // 필요한 방의 수 계산
        int numberOfRooms = (numberOfPeople + 1) / 2; // 2명당 1방, 홀수 인원일 경우 1명 추가

        // 총 비용 계산
        int totalAirfare = numberOfPeople * airfarePerPerson;
        int totalRoomCost = numberOfRooms * roomCostPerNight * numberOfNights;
        int totalCost = totalAirfare + totalRoomCost;

        // 결과 출력
        System.out.println(numberOfPeople + "명의 " + destination + " " + numberOfNights + "박" + (numberOfNights + 1) + "일 여행에는 방이 " + numberOfRooms + "개 필요하며 경비는 " + totalCost + "원입니다.");
    }
}