import java.lang.*;
import java.util.*;

public class switchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        String x = sc.next();
        switch (x) {
            case "l":
            case "L":
                System.out.println("x is a letter");
                break;
            case "d":
            case "D":
                System.out.println("x is a digit");
                break;
            case "w":
            case "W":
                System.out.println("x is a white space");
                break;
            case "s":
            case "S":
                System.out.println("x is a special symbol");
                break;
            default:
                System.out.println("x is other than lrtter,digit,whitw space,special symbol");
                break;
        }
    }
}