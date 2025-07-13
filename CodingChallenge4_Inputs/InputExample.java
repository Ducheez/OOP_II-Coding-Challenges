package OOP2_Coding_Challenges.CodingChallenge_4_Inputs;

import java.util.Scanner;

public class InputExample {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge(){
        String name;
        int age;

        System.out.println("Enter Your Name: ");
        name = scanner.next();
        System.out.println("Enter Your Age: ");
        age = scanner.nextInt();

        System.out.println("Hello: " + name + ", you are " + age + " years old");

    }

    public static void main(String[] args){
        (new InputExample()).readNameAndAge();
    }
}
