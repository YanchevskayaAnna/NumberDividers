import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        System.out.println("dividers:");
        for (Integer divider:Calculator.findUniqueDividers(number)) {
            System.out.print(divider + "\t");
        }

    }
}
