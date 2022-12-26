import java.util.Scanner;

public class timeConverter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int seconds = day * 24 * 60 * 60;
        System.out.println(seconds);
    }
}
