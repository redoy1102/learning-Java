//package Conditional Statement.practice problem;
import java.util.Scanner;
public class two {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int purchase = input.nextInt();

        if (purchase > 15000) {
            if (purchase > 30000) {
                System.out.println("Gift card\nGift card");
            }
            else {
                System.out.println("Gift card");
            }
        }
    }
}
