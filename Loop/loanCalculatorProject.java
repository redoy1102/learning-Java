import java.util.Scanner;

public class loanCalculatorProject {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        for (int i = 0; i < 3; i++) {
            int reduce = amount / 10;
            amount -= reduce;
        }
        System.out.println(amount);
    }
}
