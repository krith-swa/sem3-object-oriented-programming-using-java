import java.util.Scanner;

class VerifyPalindrome {
	public static void palCheck (String s) {
		int l=s.length(), flag=0;
		for (int i=0; i<l; i++) {
			if (!s.substring(i,i+1).equalsIgnoreCase(s.substring(l-1-i,l-i))) {
				System.out.println("Not a palindrome");
				flag=1;
				break;
				}
			}
		if (flag==0)
			System.out.println("Palindrome!");
		}

	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		//to get a word as input from the user
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		//to call the function to check if word is a palindrome
		palCheck(word);
		}
	}
