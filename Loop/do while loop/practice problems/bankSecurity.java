import java.util.Scanner;

public class bankSecurity {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int password;
        do{
            password = input.nextInt();
            System.out.println("Write password");
        } while (password != 8819);
    }
}
