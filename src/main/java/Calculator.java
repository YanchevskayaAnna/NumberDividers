import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Calculator {

    public static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
    public static int MAX_PRIME = 113;

    public static Set<Integer> findUniqueDividers(int number) {

        Set<Integer> uniqueDividers = new HashSet<Integer>();

        for (Integer div : findDividers(number)) {
            uniqueDividers.add(div);
        }

        return uniqueDividers;

    }

    public static List<Integer> findDividers(int number) {

        List<Integer> dividers = new ArrayList<Integer>();
        dividers.add(1);
        int counter = 0;
        int divider = PRIMES[counter++];

        while (divider <= (int) Math.ceil(Math.sqrt(number)))  {
            if (number % divider == 0) {
                dividers.add(divider);
                number = number / divider;
            } else {
                if (divider == MAX_PRIME) {
                    divider++; //array of primes has ended, then by simple search
                } else {
                    divider = PRIMES[counter++];
                }
            }
        }

        return dividers;
    }
}
