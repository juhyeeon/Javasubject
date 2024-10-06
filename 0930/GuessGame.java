package java2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Participant {
    String name;
    int score;

    public Participant(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        this.score++;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class GuessGame {
    private ArrayList<Participant> players;
    private Random random;
    private Scanner scanner;

    public GuessGame() {
        players = new ArrayList<>();
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void addPlayer(String name) {
        players.add(new Participant(name));
    }

    public void playGame() {
        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수>> ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 소비

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("선수 이름>> ");
            String name = scanner.nextLine();
            addPlayer(name);
        }

        boolean continueGame = true;
        while (continueGame) {
            int targetNumber = random.nextInt(100) + 1;
            System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

            Participant closestPlayer = null;
            int closestDifference = Integer.MAX_VALUE;

            for (Participant player : players) {
                System.out.print(player.getName() + ">> ");
                int guess = scanner.nextInt();
                int difference = Math.abs(targetNumber - guess);

                if (difference < closestDifference) {
                    closestDifference = difference;
                    closestPlayer = player;
                }
            }

            System.out.println("정답은 " + targetNumber + "입니다. " + closestPlayer.getName() + "가 이겼습니다. 승점 1점 확보!");
            closestPlayer.incrementScore();

            System.out.print("계속하려면 yes 입력>> ");
            String response = scanner.next();
            continueGame = response.equalsIgnoreCase("yes");
        }

        System.out.println("최종 승자는 다음과 같습니다:");
        for (Participant player : players) {
            System.out.println(player.getName() + ": " + player.getScore() + "점");
        }
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.playGame();
    }
}
