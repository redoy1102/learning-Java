import java.util.Scanner;

public class enhancedForLoopPracticeProblem {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int squares = input.nextInt();

        int[] numbers = new int[squares];
        for (int i = 0; i < squares; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i : numbers) {
            System.out.println(i*i);
        }
    }
}
