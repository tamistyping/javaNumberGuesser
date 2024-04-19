

//public class Main {
//    public static void main(String[] args) {
//
//        int userNumber;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hey! Enter a number between 1-100");
//
//        int randomNumber = (int) (Math.random() * 100) + 1; // Generating random number outside the loop
//
//        while (true) {
//            userNumber = scanner.nextInt();
//            if (userNumber < 1 || userNumber > 100) {
//                System.out.println("** Please try again **");
//            } else if (userNumber > randomNumber) {
//                System.out.println("Too big... guess again...");
//            } else if (userNumber < randomNumber) {
//                System.out.println("Too small... guess again...");
//            } else {
//                System.out.println("Great Guess! Well done!");
//                break;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        System.out.println(A);

    }
}