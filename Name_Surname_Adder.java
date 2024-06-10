/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package name_surname_adder;
import java.util.Scanner;

/**
 *
 * @author cooks
 * 
 * This application is designed to demonstrate and understand how the Scanner class works.
 * 
 * The program prompts the user to enter their name and surname, reads the input using the Scanner class,
 * and then displays the full name entered by the user. This helps in understanding how to use the Scanner
 * class to read input from the console in a Java application.
 * 
 */
public class Name_Surname_Adder {

    /**
     * The main method is the entry point of the application.
     * It demonstrates how to use the Scanner class to read input from the user.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Create a scanner object.
        Scanner scan_input = new Scanner(System.in);
        
        // Ask user for requierd information: name.
        System.out.println("Enter your name:");
        
        // Read user input: name.
        String name = scan_input.nextLine();
        
        // Ask user for required information: surname.
        System.out.println("Enter your surname:");
        
        // Read user input: name.
        String surname = scan_input.nextLine();
        
        // Display/Print out user name and surname.
        System.out.println("Your full name is: " + name + " " + surname);
        
        // Close the scanner object.
        scan_input.close();
    }
    
}
