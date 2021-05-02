
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        int n = 0;
        while (n<number) {
            System.out.print("*");
            n++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int n = 0;
        while (n<size) {
            printStars(size);
            n++;
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int n=0;
        int i=0;
        while (n<height) {
            printStars (width);
            n++;
        }
         
    }
    

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int n=0;
        int i=1;
        while (n<size) {
            printStars(i);
            n++;
            i++;
        }
    }
}
