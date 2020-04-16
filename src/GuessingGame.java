import javax.swing.*;
import java.util.Scanner;

public class GuessingGame {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int myNum = 5;
         System.out.println("I am thinking about a number between 1 and 10.");
         System.out.print("Can you guess it: ");
         num = in.nextInt();
         while (num != myNum) {
             if (num < myNum) {
                 System.out.print("It is too low, try again: ");
                 num = in.nextInt();
             }
             else {
                 System.out.print("It is too high, try again: ");
                 num = in.nextInt();
             }
         } System.out.println("That is right! You are a good guesser.");
    }
}
