import java.util.Scanner;

class FindLongestWord {
	public static void longest (String s) {
		int max=0, count=0, index=0;
		String word="", long_word="";
		for (int i=0; i<s.length(); i++) {
			String c=s.substring(i,i+1);
			if (!c.equals(" ") && !c.equals('\n') && !c.equals(".") && !c.equals("?")) {
				count++;
				word=word.concat(c);
				if (i==s.length()-1) {
					if (count>max) {
						max=count;
						long_word=word;
						}
					count=0;
					word="";
					}
				}
			else {
				if (count>max) {
					max=count;
					long_word=word;
					index=i-count;
					}
				count=0;
				word="";
				}
			}
		System.out.println("Longest word in sentence: "+long_word);
		System.out.println("Index position: "+index+"\tWord length: "+max);
		}

	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		//to get a sentence as input from the user
		System.out.print("Enter a sentence: ");
		String sent = sc.nextLine();
		
		//call function to find longest word
		longest(sent);
		}
	}
