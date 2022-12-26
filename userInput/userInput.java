import java.util.Scanner;

public class userInput {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int number = input.nextInt();
        
        System.out.println(name + number);
    }
}
