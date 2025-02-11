/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: ESP Game
 * Due: 02/10/2025
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Nadia Hassan
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class ESPGame {
    public static void main(String[] args) throws IOException {
        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Initial introduction to the game
        System.out.println("CMCC200 Assignment1: Test your ESP skills!");
        System.out.println("Welcome to ESP - extrasensory perception!");
        int points = 0; // Variable to keep track of the points scored by the user

        // Main game loop to keep playing until user chooses to exit
        while(true){
            
            // Menu for user to choose from
            System.out.println("Would you please choose one of the 4 options from the menu:");
            System.out.println("1. Read and display the first 16 colors.");
            System.out.println("2. Read and display the first 10 colors.");
            System.out.println("3. Read and display the first 5 colors.");
            System.out.println("4. Exit");
            System.out.print("Enter the option: ");
            
            // Read user input for menu option
            final int option = input.nextInt();
            
            // If the user selects an option other than 4 (Exit)
            if(option < 4){
                System.out.print("Enter the filename: ");
 
                final String fileName = input.next();
                System.out.println("There are sixteen colors from a file:");

                int display = 0;
                // Set the number of colors to display based on user choice
                if(option == 1){
                    display = 16;
                }else if(option == 2){
                    display = 10;
                }else{
                    display = 5;
                }
                
                // Randomly pick three colors to test the user on
                Random random = new Random();
                final int randomNumber1 = random.nextInt(display) + 1;
                final int randomNumber2 = random.nextInt(display) + 1;                
                final int randomNumber3 = random.nextInt(display) + 1;
                String color1 = "";
                String color2 = "";
                String color3 = "";
                
                // Open the file and read colors
                File file = new File(fileName);
                System.out.print(file.getAbsolutePath());
                Scanner fileReader = new Scanner(file);
                int counter = 1;
                
                // Display the colors from the file
                while (display > 0) {
                    final String currentColor = fileReader.nextLine().trim();
                    System.out.println(counter + " " + currentColor);
                    
                    // Save the randomly chosen colors to test the user on later
                    if(counter == randomNumber1){
                        color1 = currentColor;
                    }
                    if(counter == randomNumber2){
                        color2 = currentColor;
                    }
                    if(counter == randomNumber3){
                        color3 = currentColor;
                    }
                    
                    counter++;
                    display--;
                }
                fileReader.close();
                
                // Reset points to 0 for each new round
                points = 0;
                
                // Round 1 - Ask the user to guess one color
                System.out.println("\nRound 1");
                System.out.println("\nI am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.println("Enter your guess: ");
                final String guess1 = input.next().toLowerCase();
                
                // Reveal the color and check if the guess was correct
                System.out.println("I was thinking of " + color1);
                if(guess1.equals(color1)){
                    points++; // Increment points if guess was correct
                }
                
                // Round 2 - Ask the user to guess another color
                System.out.println("Round 2");
                System.out.println("\nI am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.println("Enter your guess: ");
                final String guess2 = input.next().toLowerCase();
                
                // Reveal the color and check if the guess was correct
                System.out.println("I was thinking of " + color2);
                if(guess2.equals(color2)){
                    points++;
                }
                
                // Round 3 - Ask the user to guess a third color
                System.out.println("Round 3");
                System.out.println("\nI am thinking of a color.");
                System.out.println("Is it one of the list of colors above?");
                System.out.println("Enter your guess: ");
                final String guess3 = input.next().toLowerCase();
                
                // Reveal the color and check if the guess was correct
                System.out.println("I was thinking of " + color3);
                if(guess3.equals(color3)){
                    points++;
                }
                
                // End of the game, show results
                System.out.println("Game Over");
                System.out.println("You guessed " + points + " out of 3 colors correctly.");
                System.out.println("Would you like to continue the game? Type Yes/No");
                final String cont = input.next();
                if(cont.equals("No")){
                    break; // Exit the loop if user chooses not to continue
                }
                
            } else if(option == 4){
                break; // Exit the loop if user chooses option 4
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        // After exiting the game, gather additional user details for the report
        System.out.println("\nEnter your name: ");
        input.nextLine(); // Consume newline left by nextInt()
        final String name = input.nextLine();
        System.out.println("Describe yourself:");
        final String description = input.nextLine();
        System.out.println("Due Date:");
        final String dueDate = input.nextLine();

        // Display the gathered information
        System.out.println("Username: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);

        // Prepare the results string to write to a file
        String results = "Game Over\n" +
                         "You guessed " + points + " out of 3 colors correctly.\n" +
                         "Username: " + name + "\n" +
                         "User Description: " + description + "\n" +
                         "Date: " + dueDate + "\n";

        // Write the results to a file
        FileWriter writer = new FileWriter("EspGameResults.txt");
        writer.write(results);
        writer.close();

        // Close the scanner object
        input.close();
    }
}
