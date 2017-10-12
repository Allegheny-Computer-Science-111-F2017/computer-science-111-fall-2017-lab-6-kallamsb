package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
*This is lab 6 source code. For this lab the programmer is to explore
*bioinformatics. More specifically the programmer must manipulate
*DNA.
*/
public class ManipulateDna {

  /**
  *This source code is used to create a complement string of dna from a string
  *that is read in from a file. The code must use a replace command in order to
  *change the input letters to their complments.
  */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Brandon Kallams " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    dna = dna.toLowerCase();
    System.out.println("The Chosen DNA strand is " + dna);
    // Step Two: Compute the complement of the DNA String
    String dnaComp =  dna.replace('a','T');
    dnaComp = dnaComp.replace('t','A');
    dnaComp = dnaComp.replace('c','G');
    dnaComp = dnaComp.replace('g','C');
    dna = dna.toUpperCase();
    System.out.println("The Complement of " + dna + " is " + dnaComp);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random ranD = new Random();
    char newchar;
    int num = ranD.nextInt(4);
    if (num == 0) {
      newchar = 'A';
    } else if (num == 1) {
      newchar = 'T';
    } else if (num == 2) {
      newchar = 'C';
    } else {
      newchar = 'G';
    }
    System.out.println("This is an example of an insertion at position 0:");
    System.out.println(newchar + dna);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int deleTion = ranD.nextInt(dna.length());
    String substring = dna.substring(0, deleTion);
    String substring1 = dna.substring(deleTion + 1);
    System.out.println("This is a deletion at position " + deleTion + ":");
    System.out.println(substring + substring1);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    char swapChar;
    int num1 = ranD.nextInt(4);
    if (num1 == 0) {
      swapChar = 'A';
    } else if (num1 == 1) {
      swapChar = 'T';
    } else if (num1 == 2) {
      swapChar = 'C';
    } else {
      swapChar = 'G';
    }
    int charSwap = ranD.nextInt(dna.length());
    String substring2 = dna.substring(0, charSwap);
    String substring3 = dna.substring(charSwap + 1);
    System.out.println("This is a letter swap at position " + charSwap + ":");
    System.out.println(substring2 + swapChar + substring3);

    // Step Six: Display a final thankyou message
    System.out.println("Thank you for exploring Bioinformatics! " + "\n" + "Have a nice day.");
  }

}
