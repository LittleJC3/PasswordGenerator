/*Name: John Ciulla
 * Email: ciullajn@mail.uc.edu
 * Assignment: Assignment #7a in class on 10/29/2020
 * Due Date: 11/05 11:00 AM
 * Course/Term: IT1090C Fall 2020
 * Description: Calculates how many boxes are needed
 * Citations: Professor Nicholson
 * Anything else:  
 */
package passwordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// Declare a String called password
		String password;
		// Declare a String called characters
		String characters;
		// Declare a String called randomCharacter
		String randomCharacter;
		// Declare an integer called randomIndex
		int randomIndex;
		// Init characters to "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
		characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		// Prompt the user to enter the length of their random password
		System.out.println("Enter the length of your desired password: ");
		// Declare an integer called passwordLength
		int passwordLength;
		// Read an integer from the keyboard into passwordLength
		Scanner scanner = new Scanner(System.in); // Declare and instantiate
		passwordLength = scanner.nextInt();
		// Create a random number generator called random, use the seed 42
		Random random = new Random(42);
		// Init the password to ""
		password = "";
		// Loop from 1 to passwordLength A 'for' loop is good here because we know the start, end, and increment
		for (int i= 1; i <= passwordLength; i++) { // Always use the braces!!
			// Generate a random integer between 0 and the length of characters-1 (inclusive), store in randomIndex
			randomIndex = random.nextInt(characters.length());
			// extract the character in characters at the location randomIndex, store in randomCharacter
			randomCharacter = characters.substring(randomIndex, randomIndex+1);
			// Append randomCharacter to the end of password
			password = password + randomCharacter;
		}
		//Print the contents of password in a friendly message
		System.out.println("Your random password is " + password);
	}

}
