//***********LAB - 6 *************  PIG LATIN    **************Reference*************************
//http://stackoverflow.com/questions/33470448/piglatin-java-how-to-call-the-method-in-the-main-method
//http://www.cs.cmu.edu/~mrmiller/15-110/Labs/lab3soln.txt
//http://stackoverflow.com/questions/27219609/how-to-change-all-words-in-a-sentence-on-piglatin-java
//http://stackoverflow.com/questions/19439969/how-can-i-move-a-letter-from-the-first-letter-of-a-word-to-the-back-of-the-word
// for consonants

//1.Display prompt / Get user input
//2.convert input to lowercase
//3.put each word into a string array -   need to ask
//4.check each word -
//5. Display output to console
//6.Ask user to continue

// Author: Saritha - Date: 04/14/17 - Lab6: Pig Latin
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        translator("userInput");

    }

    private static String translator(String original) {

        Scanner scan = new Scanner(System.in);  //create a Scanner

        System.out.println("Welcome to the Pig Latin Translator!\n"); //Heading
        String userInput = ""; //Creating variables
        String doAgain; // do y/n

        do {
            System.out.println("Please enter a line to be translated: ");//Ask the user input
            userInput = scan.nextLine();//get the userInput from the Scanner

            System.out.println("You entered: ");
            System.out.println(userInput);

            userInput = userInput.toLowerCase();//convert input toLowerCase()
            System.out.println("Your entry is translated to lowercase: ");

           // String vowels = "aeiou";//variables
            //char firstChar;
            //int vowelIndex;
           // boolean firstVowel = true; //variable
            // boolean consonants = true;


            String vowels = "aeiou";//variables
            char firstChar = userInput.charAt(0);//find the first char of userInput by using charAt & indexOf
            int vowelIndex = vowels.indexOf(firstChar);
            boolean firstVowel = true; //variable
            System.out.println(userInput);


            if (firstVowel == (vowelIndex >= 0)) {
                System.out.println("Pig Latin is: " + userInput + "way");

            } else {
                String firstLetter = userInput.substring(1);
                System.out.println("Pig Latin is: " + firstLetter + "ay");
            }

            System.out.println("Do you want to continue?(y/n): ");// ask user wants to continue
            doAgain = scan.nextLine();

        }
        while (doAgain.equalsIgnoreCase("y"));

        System.out.println("Good Bye!");
        return userInput;
    }

}