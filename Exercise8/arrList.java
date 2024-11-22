import java.util.*;

public class arrList {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> alist = new ArrayList<String>();
		int ch;
		
		System.out.println(" 1: append\n 2: insert\n 3: search\n 4: display\n 5: startswithLetter\n 6: containsSubstring\n 7: sort\n 8: remove\n 9: replace\n10: removeDuplicates\n");
		System.out.print("Enter choice: ");
		ch = sc.nextInt();
		
		while (ch!=0) {
			switch (ch) {
				case 1: {
					System.out.print("Enter element to insert: ");
					String el = sc.next();
					alist.add(el);
					break;
					}
				case 2: {
					System.out.print("Enter element to insert: ");
					String el = sc.next();
					System.out.print("Enter index to insert at: ");
					int pos = sc.nextInt();
					alist.add(pos,el);
					break;
					}
				case 3: {
					System.out.print("Enter element to search for: ");
					String el = sc.next();
					int found = alist.indexOf(el);
					System.out.println("Found at index: "+found);
					break;
					}
				case 4: {
					System.out.println(alist);
					break;
					}
				case 5: {
					System.out.print("Enter letter to start with: ");
					String letter = sc.next();
					for (String element : alist) {
						if (element.startsWith(letter)) {
							System.out.print(element+" ");
							}
						}
					System.out.println();
					break;
					}
				case 6: {
					System.out.print("Enter substring to search for: ");
					String substring = sc.next();
					for (String element : alist) {
						if (element.contains(substring)) {
							System.out.print(element+" ");
							}
						}
					System.out.println();
					break;
					}
				case 7: {
					Collections.sort(alist);
					break;
					}
				case 8: {
					System.out.print("Enter element to remove: ");
					String el = sc.next();
					alist.remove(el);
					break;
					}
				case 9: {
					System.out.print("Enter element to replace: ");
					String el1 = sc.next();
					System.out.print("Enter element to replace with: ");
					String el2 = sc.next();
					alist.set(alist.indexOf(el1),el2);
					break;
					}
				case 10: {
					alist = removeDuplicates(alist);
					break;
					}
				default: System.out.println("Invalid choice");
				}
			System.out.println();
			
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			}
		}
		
	public static <T> ArrayList<T> removeDuplicates (ArrayList<T> list) {
		ArrayList<T> newList = new ArrayList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.add(element);
				}
			}
		return newList;
		}
	}
