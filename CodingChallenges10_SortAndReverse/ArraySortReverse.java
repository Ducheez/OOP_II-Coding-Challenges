package OOP2_Coding_Challenges.CodingChallenge_10_SortReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets = {"B094","C983","D656","E510","A575"};
        System.out.println("Sorted Array");
        Arrays.sort(pallets);

        for(String pallet : pallets){
            System.out.println("--> " + pallet);
        }

        System.out.println("\nReversed Array");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);

        for(String pallet : palletList){
            System.out.println("--> " + pallet);
        }
    }
}
