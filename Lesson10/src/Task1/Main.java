package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        while(true){
            try {
                int number = sc.nextInt();
                System.out.println("Entered number: " + number);
                break;

            }catch (InputMismatchException e){
                System.out.println("Invalid number");
                sc.next();
                System.out.println("Try enter number: ");
            }
        }
        sc.close();
    }
}