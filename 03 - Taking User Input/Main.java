import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); /*The Scanner is a built-in class in Java used to take input from the user  */

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  /*These are methods from the Scanner class used to read specific types of input from the user */

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Have you passed (true/false): ");
        boolean  isPassed = sc.nextBoolean();

        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n----- Your Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Passed: " + isPassed);
        System.out.println("Percentage: " + percentage);

        sc.close(); 
    }
}
