//package Array.practiceProblem;
import java.util.Scanner;

public class summingElements {
    static public void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 4 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
