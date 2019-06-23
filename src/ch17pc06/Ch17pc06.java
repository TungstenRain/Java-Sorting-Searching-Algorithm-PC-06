package ch17pc06;

import java.io.*;
import java.util.Scanner;
import static ch17pc06.ObjectQuickSorter.*;
import static ch17pc06.ObjectBinarySearcher.*;

/**
 * 
 * @author frank
 */
public class Ch17pc06 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) throws IOException {
        // variables
        String fileName = "names.txt";
        String[] nameArray = null;
        String text = null;
        String name;
        int i = 0;
        
        //open the file
        File file = new File(fileName);
        
        // Instantiate Scanner class
        Scanner inputFile = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to the Top 65 Female Names for 1990.");
        System.out.println("...retreiving names...");
        
        // Read names into array
        while (inputFile.hasNextLine()) {
            text += inputFile.nextLine() + " ";
        }

        //close the file
        inputFile.close();

        nameArray = text.split("\\s+");
        
        // Sort the array
        System.out.println("...sorting names...");
        quickSort(nameArray);
        
        // Request name from user
        System.out.println("Please enter a name: ");
        name = keyboard.next();
        
        // Search for name
        System.out.println("...searching for " + name + "...");
        if (binarySearch(nameArray, name) != -1) {
            System.out.println(name + " found and matches one of the top 65 female names for 1990.");
        } else {
            System.out.println(name + " not found and does not match the top 65 femle names for 1990.");
        }
        
    }

}
