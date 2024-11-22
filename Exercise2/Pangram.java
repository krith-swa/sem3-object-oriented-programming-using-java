import java.util.Scanner;

class Pangram {
	public static boolean checkPangram (String s) {
		//creating an array where each index represents a letter of the alphabet
		int count[] = new int[26]; //default count is 0 for each letter
		//for traversing the array and string to check if each letter is present
		int index=0;
		for (int i=0; i<s.length(); i++) {
			//if letter is in uppercase, subtract 65
			if ('A'<=s.charAt(i) && s.charAt(i)<='Z') {
				index = s.charAt(i)-'A';
				}
			//if letter is in lowercase, subtract 96
			else if ('a'<=s.charAt(i) && s.charAt(i)<='z') {
				index = s.charAt(i)-'a';
				}
			//if character is not a letter, go to next character
			else
				continue;
			//increment the letter's counter if the letter is encountered
			count[index]++;
			}
			
		//to print the number of occurrences of each letter
		for (index=0; index<26; index++) {
			System.out.print((char)('a'+index)+": "+count[index]+'\t');
			//for formatting the output
			if ((index+1)%9==0)
				System.out.println();
			}
		
		//check if occurrence is at least 1 for all letters
		//returns false if any letter isn't present, else true
		for (index=0; index<26; index++) {
			if (count[index]==0)
				return false;
			}	
		return true;
		}

	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		//to get a sentence as input from the user
		System.out.print("Enter a sentence: ");
		String sent = sc.nextLine();
		
		//to call the function to check for pangram
		if (checkPangram(sent)==true)
			System.out.println("\nThe sentence is a pangram.");
		else
			System.out.println("\nThe sentence is not a pangram.");
		}
	}
