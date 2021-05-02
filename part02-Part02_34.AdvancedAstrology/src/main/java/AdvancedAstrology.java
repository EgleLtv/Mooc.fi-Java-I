
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int n = 0;
        while (n<number) {
            System.out.print("*");
            n++;
        }
        System.out.println("");
        
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int n = 0;
        while (n<number) {
            System.out.print(" ");
            n++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int n=0;
        int i=1;
        while (n<size) {
            printSpaces(size-i);
            printStars(i);
            ;
            n++;
            i++;
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int n=0;
        int i=1;
        int e=1;
        int u = 1;
        while (n<height) {
            printSpaces(height-u);
            printStars(i);
            
            ;
            n++;
            i= i+2;
            u++;
        }
        while (e<=2) {
            printSpaces(height-2);
            printStars(3);
            
            ;
            e++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
