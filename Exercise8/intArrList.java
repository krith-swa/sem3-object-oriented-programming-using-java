import java.util.*;

public class intArrList {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		ArrayList<Integer> alist2 = new ArrayList<Integer>();
		int ch, n, num;
		
		System.out.print("Enter no. of elements in first list: ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.print("Enter number to insert: ");
			num = sc.nextInt();
			alist1.add(num);
			}
		System.out.println(alist1);
		System.out.println();
		
		System.out.print("Enter no. of elements in second list: ");
		n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.print("Enter number to insert: ");
			num = sc.nextInt();
			alist2.add(num);
			}
		System.out.println(alist2);
		System.out.println();
		
		System.out.println("Menu:\n 1: merge\n 2: union\n 3: intersection\n 4: compare\n");
		System.out.print("Enter choice: ");
		ch = sc.nextInt();
		
		while (ch!=0) {
			switch (ch) {
				case 1: {
					ArrayList<Integer> alist = new ArrayList<Integer>();
					alist.addAll(alist1);
					alist.addAll(alist2);
					System.out.println("Merged list: "+alist);
					break;
					}
				case 2: {
					ArrayList<Integer> alist = new ArrayList<Integer>();
					alist.addAll(alist1);
					alist.addAll(alist2);
					alist = removeDuplicates(alist);
					System.out.println("Union of the lists: "+alist);
					break;
					}
				case 3: {
					ArrayList<Integer> alist = new ArrayList<Integer>();
					for (Integer element : alist1) {
						if (alist2.contains(element)) {
							alist.add(element);
							}
						}
					System.out.println("Intersection of the lists: "+alist);
					break;
					}
				case 4: {
					if (alist1.equals(alist2))
						System.out.println("The lists are equal.");
					else
						System.out.println("The lists are not equal.");
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
