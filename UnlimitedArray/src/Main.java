import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option;
        int index = 0;
        int[] NumberBank = new int[0];
        do {
            System.out.println("\n1. Input array ");
            System.out.println("2. View Array ");
            System.out.println("3. Exit");
            System.out.print("Enter option : ");
            option = scanner.nextLine();
            String input;
            if(option.equalsIgnoreCase("1")){
                System.out.print("Enter a number to array or 'exit' to leave: ");
                input = scanner.nextLine();
                if (!input.equalsIgnoreCase("exit")) {
                    NumberBank = Arrays.copyOf(NumberBank, NumberBank.length + 1);
                    NumberBank[index] = Integer.parseInt(input);
                    index += 1;
                }
            }
            if (option.equalsIgnoreCase("2")) {
                System.out.print("Array elements: ");
                for (int n : NumberBank) {
                    System.out.print(" [" + n +"] ");
                }
            }
        } while (!option.equalsIgnoreCase("exit"));
    }
}
