import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Будешь угадывать? (да/нет)");
            String answer = sc.nextLine();
            if (answer.equals("да")){
                System.out.println("(⌒‿⌒)");
                GuessingRound gameGuessingRound = new GuessingRound();
                gameGuessingRound.gameRound();
            } else if (answer.equals("нет")) {
                System.out.println("(×﹏×)");
                break;
            } else {
                System.out.println("(︶︹︺)\n непонятно, давай до свидания");
            }
        }
    }
}