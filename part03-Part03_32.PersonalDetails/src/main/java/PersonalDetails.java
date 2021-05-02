
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> years = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] words = text.split(",");
            names.add(words[0]);
            years.add(Integer.valueOf(words[1]));
        }
        
        String longest = names.get(0);
        for (String name:names){
            if (name.length()>longest.length()) {
                longest = name;
            }
        }
        int sum = 0;
        for (int year:years){
            sum=sum+year;
        }
        
        System.out.println("Longest name:" + longest);
        System.out.println("Average of the birth years: " + (1.0 * sum / years.size()));
    }
}
