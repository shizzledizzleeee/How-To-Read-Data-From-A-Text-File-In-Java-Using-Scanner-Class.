/*
 * How To Read Data From A Text File In Java Using Scanner Class.
 * http://mauricemuteti.info/how-to-read-data-from-a-text-file-in-java/
 */
package readdatafromtextfilejavausingscannerclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Authentic
 */
public class ReadDataFromTextFileJavaUsingScannerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creating a string variable for storing text file name.
        String fileName = "data.txt";
        //Invoking readDataFromTextFile Static Method.
        readDataFromTextFile(fileName);
    }

    /**
     * readDataFromTextFile Static Method.
     *
     * @param fileName
     */
    public static void readDataFromTextFile(String fileName) {

        //Line Counter Variable
        int lineCounter = 0;
        Scanner scanner = null;
        //Declaring File Object And Passing 
        //File Name As An Argument In Its Constructor.
        File source = new File(fileName);
        try {
            System.out.println("Inside Try Catch block.");
            //Inside Try Catch block.
            scanner = new Scanner(source);

            System.out.println("Reading Multiple Lines From A Text File. ");
            //Looping to get all lines fom a text file.
            while (scanner.hasNext()) {
                //Incrementing Counter
                lineCounter++;
                //Printing text file data on the console.
                System.out.println(lineCounter + " " + scanner.nextLine());
            }
            System.out.println(lineCounter + " Lines Read From A Text File.");
            //Catching Exceptions.
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error : " + fileNotFoundException.getMessage());
        } finally {

            if (scanner != null) {
                try {
                    System.out.println("Closing Scanner Object to release resources.");
                    //Closing Scanner Object to release resources.
                    scanner.close();
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
            }
        }
    }
}
