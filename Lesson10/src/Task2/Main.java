package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            try {
                System.out.print("Please enter age: ");
                int age = scanner.nextInt();
                checkAge(age);
                break; 
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException ex) {
                System.out.println("Error: " + "Please enter a valid age value.");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void checkAge(int age) throws InvalidInputException {
        int MIN_AGE = 0;
        int MAX_AGE = 100;

        if (age < MIN_AGE || age > MAX_AGE) {
            throw new InvalidInputException("Age is invalid");
        } else {
            System.out.println("Age is: " + age);
        }
    }
}
