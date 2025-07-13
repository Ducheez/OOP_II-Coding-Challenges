package OOP2_Coding_Challenges.CodingChallenge_5_Loops;

import java.util.Scanner;

public class HelloTillStop {
    Scanner scanner = new Scanner(System.in);

    void showHello(){
        String entry;

        System.out.println("For Hello type h, anything else to stop");
        entry = scanner.next();
        while ("h".equals(entry)){
            System.out.println("Hello");
            entry = scanner.next();
        }
    }
}
