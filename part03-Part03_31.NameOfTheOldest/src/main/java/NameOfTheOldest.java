
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "0";

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] words = text.split(",");

            int oldest = Integer.valueOf(words[1]);
            if (oldest > age) {
                age = oldest;
                name = words[0];
            }
        }

        System.out.println(
                "Name of the oldest: " + name);
    }
}
