
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int one = Integer.valueOf(scanner.nextLine());
        int two = Integer.valueOf(scanner.nextLine());
        
        double sqroot = Math.sqrt(one + two);
        int result = (int)Math.round(sqroot);
        
        System.out.println(result);

    }
}
