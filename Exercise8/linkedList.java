import java.util.*;

public class linkedList {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> llist = new LinkedList<Integer>();
		int ch;
		
		System.out.println(" 1: insertBoth\n 2: deleteBoth\n 3: insertAt\n 4: deleteElement\n 5: search\n 6: displayForwardAndBackward\n 7: sort\n 8: replaceWithList\n 9: removeDuplicates\n");
		System.out.print("Enter choice: ");
		ch = sc.nextInt();
		
		while (ch!=0) {
			switch (ch) {
				case 1: {
					System.out.print("Enter element to insert on both sides: ");
					int el = sc.nextInt();
					llist.addFirst(el);
					llist.addLast(el);
					break;
					}
				case 2: {
					System.out.print("Deleting first element on both sides: ");
					llist.removeFirst();
					llist.removeLast();
					break;
					}
				case 3: {
					System.out.print("Enter element to insert: ");
					int el = sc.nextInt();
					System.out.print("Enter index to insert at: ");
					int pos = sc.nextInt();
					llist.add(pos,el);
					break;
					}
				case 4: {
					System.out.print("Enter element to remove: ");
					int el = sc.nextInt();
					llist.remove(llist.indexOf(el));
					break;
					}
				case 5: {
					System.out.print("Enter element to search for: ");
					int el = sc.nextInt();
					int found = llist.indexOf(el);
					if (found == -1)
						System.out.println("Element not found");
					else
						System.out.println("Found at index: "+found);
					break;
					}
				case 6: {
					ListIterator<Integer> litr = llist.listIterator();
					System.out.println("List in forward direction:");
					while (litr.hasNext()) {
						int el = litr.next();
						System.out.print(el+" ");
						}
					System.out.println();
					System.out.println("List in backward direction:");
					while (litr.hasPrevious()) {
						int el = litr.previous();
						System.out.print(el+" ");
						}
					System.out.println();
					break;
					}
				case 7: {
					Collections.sort(llist);
					break;
					}
				case 8: {
					LinkedList<Integer> llist2 = new LinkedList<Integer>();
					System.out.print("Enter element to replace: ");
					int el1 = sc.nextInt();
					System.out.println("Enter list to replace with: ");
					int n, num;
					System.out.print("Enter no. of elements in sub list: ");
					n = sc.nextInt();
					for (int i=0; i<n; i++) {
						System.out.print("Enter number to insert: ");
						num = sc.nextInt();
						llist2.add(num);
						}
					System.out.println("sublist: "+llist2);
					int index = llist.indexOf(el1);
					llist.remove(index);
					llist.addAll(index,llist2);
					break;
					}
				case 9: {
					llist = removeDuplicates(llist);
					break;
					}
				default: System.out.println("Invalid choice");
				}
			System.out.println();
			
			System.out.print("Enter choice: ");
			ch = sc.nextInt();
			}
		}
		
	public static <T> LinkedList<T> removeDuplicates (LinkedList<T> list) {
		LinkedList<T> newList = new LinkedList<T>();
		for (T element : list) {
			if (!newList.contains(element)) {
				newList.addLast(element);
				}
			}
		return newList;
		}
	}
