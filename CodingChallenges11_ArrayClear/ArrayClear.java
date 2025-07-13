package OOP2_Coding_Challenges.CodingChallenge_11_ArrayClear;

import java.util.Arrays;

public class ArrayClear {
    public static void main(String[] args) {
        String[] pallets = {"B094","C983","D656","E510","A575"};
        System.out.println();

        System.out.println("Before Clearing: " + pallets[0].toLowerCase());

        Arrays.fill(pallets, 0, 2, null);

        if (pallets[0] != null) {
            System.out.println("After Clearing: " + pallets[0].toLowerCase());
        } else {
            System.out.println("After Clearing: null");
        }

        System.out.println("Second Clearing \nArray Size: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("--> " + pallet);
        }
    }
}