import java.util.Scanner;

public class Game {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there!!");
        System.out.print("what is you opinion on Tyler?");
        String opinion = scan.nextLine(); 
        System.out.println("I agree Tyler is  " + opinion + "!!");
        scan.close();
        }
    }
