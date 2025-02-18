package cp213;

import java.util.Scanner;

/**
 * Class to demonstrate the use of Scanner with a keyboard and File objects.
 *
 * @author Sushant Sah
 * @version 2024-09-08
 */
public class ScannerTest {

    /**
     * Count lines in the scanned file.
     *
     * @param source Scanner to process
     * @return number of lines in scanned file
     *
     */
    public static int countLines(final Scanner source) {
        int count = 0;

        // Looping through the file using "hasNextLine" which will add one to the counter until
        // it reaches the end of the page, where the loop will stop as the condition becomes false
        while (source.hasNextLine()) {
            source.nextLine();
            count++; 
        }

        return count;
    }

    /**
     * Count tokens in the scanned object.
     *
     * @param source Scanner to process
     * @return number of tokens in scanned object
     * 
     * 
     * 
     *
     *
     */
    public static int countTokens(final Scanner source) {
        int tokens = 0;

        // Loops as long as there is another character ahead, adding +1 to the counter until there
        // are no characters ahead
        while (source.hasNext()) {
            source.next();
            tokens++;
        }
        return tokens;
    }

    /**
     * Ask for and total integers from the keyboard.
     *
     * @param keyboard Scanner to process
     * @return total of positive integers entered from keyboard
     * 
     * 
     * 
     */
    public static int readNumbers(final Scanner keyboard) {
        int total = 0;
        
        // Opening Statement
        System.out.println("Enter integers to add up, (enter 'q' to quit): ");
        
        // Loops infinitely until "equalsIgnoreCase" breaks the loop when "q" is entered
        while (true) {
            System.out.print("Enter a number: ");
            
            // Checks if the entered number is an Integer, adding the number to the counter if so.
            if (keyboard.hasNextInt()) {
                int number = keyboard.nextInt();
                if (number >= 0) {
                    total += number;
                } 
                // If the number isn't an integer, it is checked to see if it is the break case
                // Otherwise telling the user that the string entered isn't an integer and to try
                // again. 
            } else {
                String input = keyboard.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("'" + input + "' is not an integer or 'q'.");
                }
            }
        }
        return total;
    }

} 
