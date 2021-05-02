
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age=0;

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] words = text.split(",");

            for (int i = 1; i < words.length; i = i + 2) {
                int oldest = Integer.valueOf(words[i]);
                if (oldest > age) {
                    age = oldest;
                }
            }

        }
        System.out.println("Age of the oldest: " + age);
    }
}
