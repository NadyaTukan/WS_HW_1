import java.util.Scanner;
import java.util.Random;


public class GuessingRound {
    private int randomNumber;
    int inputNumber;
    int differenceOfNumbers;
    private int chooseRandomNumber() {
        return new Random().nextInt(0, 10) + 1;
    }
    private int enterNumber(){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Попробуй еще раз");
            }
        }
    }

    private void guessingNumber(int number) {
        differenceOfNumbers = Math.abs(number - randomNumber);
        if (number < 1 || number > 10) {
            System.out.println("Читать не умеешь?");
        } else if (differenceOfNumbers > 5) {
            System.out.println("Холодно");
        } else if (differenceOfNumbers > 2) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жгётся!");
        }
    }
    public void gameRound() {
        randomNumber = chooseRandomNumber();
        System.out.println("угадай число от 1 до 10");
        while (true) {
            inputNumber = enterNumber();
            if (inputNumber == randomNumber) {
                System.out.println("╰(▔∀▔)╯");
                break;
            } else {
                guessingNumber(inputNumber);
            }
        }
    }
}

