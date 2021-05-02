
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());

        // implement here finding the indices of a number
        int in  = list.size();
        int index = 0;
        
        while (index < in){
            int n = list.get(index);
            if (n != number) {
                index++;
                
            }else {                
                System.out.println(number + " is at index " + index);
                index++;
            }
        }
        
        
    }
}
