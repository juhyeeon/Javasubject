package java2;
import java.util.Scanner;

class Player {
    String name;

    // 참가자로부터 단어를 입력받는 메서드
    String getWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ">> ");
        return scanner.next();
    }

    // 끝말잇기의 성공 여부를 확인하는 메서드
    boolean checkSuccess(String lastWord, String newWord) {
        return lastWord.charAt(lastWord.length() - 1) == newWord.charAt(0);
    }
}

public class OpenChallenge {
    private Player[] players;
    private String startWord = "아버지";

    public OpenChallenge(int numPlayers) {
        players = new Player[numPlayers];
        Scanner scanner = new Scanner(System.in);

        // 참가자 이름 입력
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("참가자의 이름을 입력하세요>> ");
            players[i] = new Player();
            players[i].name = scanner.next();
        }
    }

    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.println("시작하는 단어는 " + startWord + "입니다.");

        String lastWord = startWord;
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (true) {
            String newWord = players[i].getWordFromUser();
            if (!players[i].checkSuccess(lastWord, newWord)) {
                System.out.println(players[i].name + "이(가) 졌습니다.");
                break;
            }
            lastWord = newWord;
            i = (i + 1) % players.length; // 다음 참가자로 순환
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        int numPlayers = scanner.nextInt();

        OpenChallenge game = new OpenChallenge(numPlayers);
        game.run();
    }
}
