import java.util.Scanner;
import java.lang.Math; 

public class App {
    public static void main(String[] args) {
        inputMatch(input());
    }

    public static int input() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int num = 0;

        for (int i = 0; i < 5; i++) {
            int r = (int) (Math.random() * range) + min;
            num = r;
        }

        return num;
    }

    public static void inputMatch(int res) {
        Scanner scan = new Scanner(System.in);
        int tries = 5;

        while (tries > 0) {
            System.out.println("Guess a number. You have " + tries + " tries. ");
            int response = Integer.valueOf(scan.nextLine());         
           
                        
            if (response < res ) {
                tries--;
                System.out.println("Guess higher. ");                
            } else if (response > res) {
                tries--;
                System.out.println("Guess lower. ");                
            } else if (response == res) {
                System.out.println("Congrats.");
                break;
            }                        
        }

        if ( tries == 0 ) { 
            System.out.println("You lose. "); 
        }
    }
}
