import java.util.*;
import java.util.Scanner;
public class Main {
//    Write a Java program to create a new array list to hold colors.
//    Add at least 3 colors (string) to the array list and print out all its values.
//    Using the array list created above, print out the value at index 1.
//    Using the array list above, prompt the user for one new color, and add that color to the array list.
//    Using the array list, continue prompting the user for colors until they
//    type in "Q" or "q" to quit. Each time the user enters a color, add that to the array list. Print out the list at the end.end
    public static void main(String[] args) {
        //ArrayList al = new ArrayList();
        ArrayList<String> a2 = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String colorChoice = "";
        a2.add("Red");
        a2.add("Blue");
        a2.add("Green");

        System.out.println("Initial ArrayList: " + a2);
        System.out.println("The ArrayList value at index 1: " + a2.get(1));

        while (true) {
            System.out.println("Enter another color");
            colorChoice = sc.nextLine();
            a2.add(colorChoice);

            System.out.println("Press (q) to quit or any other key to continue");
            String cont = sc.nextLine();
            if (cont.equalsIgnoreCase("q")) {
                break;
            }
        }
        System.out.println("Final ArrayList: " + a2);
    }
}
