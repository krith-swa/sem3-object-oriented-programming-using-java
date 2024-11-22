/*Write a generic program to search for an element in a group of any datatype*/
import java.util.Scanner;

class GenericSearch {
	static <type extends Comparable <type>> int Search (type data[], type element) {
		for (int i=0; i<data.length; i++) {
			if (data[i].compareTo(element)==0) {
				return i;
				}
			}
		return -1;
		}
	
	
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		/*			
		Integer a[] = {1,2,3,4,5};
		System.out.println(Search(a,3));
		
		Character b[] = {'a','b','c','d','e'};
		System.out.println(Search(b,'e'));
		
		Float c[] = {1.2f,2.4f,7.1f};
		System.out.println(Search(c,1.2f));
		
		String d[] = {"apple","bear","cow","dinner"};
		System.out.println(Search(d,"dinner"));
		*/
		
		int n;
		
		//integer
		System.out.println("INTEGER CHECK");
		System.out.print("Enter no. of elements: ");
		n = sc.nextInt();
		Integer intArr[] = new Integer[n];
		System.out.println("Enter elements:");
		for (int i=0; i<n; i++) {
			intArr[i] = sc.nextInt();
			}
		int targetInt;
		do {
			System.out.print("\nEnter element to search for: (-999 to quit search) ");
			targetInt = sc.nextInt();
			
			if (targetInt!=-999) {
				int result = Search(intArr,targetInt);
				if (result==-1)
					System.out.println("Target element not found in the group of data");
				else
					System.out.println("Target element found at index "+result+" in the group of data");	
				}
			} while (targetInt!=-999);
		
		//float
		System.out.println("\nFLOAT CHECK");
		System.out.print("Enter no. of elements: ");
		n = sc.nextInt();
		Float floatArr[] = new Float[n];
		System.out.println("Enter elements:");
		for (int i=0; i<n; i++) {
			floatArr[i] = sc.nextFloat();
			}
		float targetFloat;
		do {
			System.out.print("\nEnter element to search for: (-999 to quit search) ");
			targetFloat = sc.nextFloat();
			
			if (targetFloat!=-999) {
				int result = Search(floatArr,targetFloat);
				if (result==-1)
					System.out.println("Target element not found in the group of data");
				else
					System.out.println("Target element found at index "+result+" in the group of data");	
				}
			} while (targetFloat!=-999);
		
		//String
		System.out.println("\nSTRING CHECK");
		System.out.print("Enter no. of elements: ");
		n = sc.nextInt();
		String strArr[] = new String[n];
		System.out.println("Enter elements:");
		for (int i=0; i<n; i++) {
			strArr[i] = sc.next();
			}
		String targetStr;
		do {
			System.out.print("\nEnter element to search for: ('quit' to quit search) ");
			targetStr = sc.next();
			
			if (!targetStr.equals("quit")) {
				int result = Search(strArr,targetStr);
				if (result==-1)
					System.out.println("Target element not found in the group of data");
				else
					System.out.println("Target element found at index "+result+" in the group of data");	
				}
			} while (!targetStr.equals("quit"));
		}
	}
		
