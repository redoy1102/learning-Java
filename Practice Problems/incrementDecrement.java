import java.util.Scanner;

public class incrementDecrement {

   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       //taking initial score
       int initScore = scanner.nextInt();
       int scoreTom = initScore;
       int scoreBob = initScore;
       
       System.out.println("Round 1 results:");
       //fix
    //    System.out.println(initScore);
       System.out.println(++scoreTom);
       System.out.println(--scoreBob);
       System.out.println(initScore);
   }
}