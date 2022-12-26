//package Conditional Statement.practice problem;
import java.util.Scanner;

public class four_switchExpression {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of day: ");

        int num = input.nextInt();
        String day = switch(num){
            case 1, 2, 3, 4, 5 -> "Not weekend day";
            case 6, 7 -> "Weekend day";
            default -> "Invalid day";
        };
        System.out.println(day);
    }
}
