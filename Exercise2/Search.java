import java.util.Scanner;

class Search {
	//function to display the array
	public static void display (int a[]) {
		for (int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		}

	//function to sort an array in ascending order
	public static void sort (int a[]) {
		int small, pos;
		for (int i=0; i<a.length; i++) {
			small=a[i];
			pos=i;
			for (int j=i+1; j<a.length; j++) {
				if (a[j]<small) {
					small=a[j];
					pos=j;
					}
				}
			a[pos]=a[i];
			a[i]=small;
			}
		//to print the sorted array
		System.out.print("Sorted array: ");
		display(a);
		}

	//function to perform linear search on an array
	public static void lsearch (int a[], int num) {
		int flag=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]==num) {
				System.out.println("Number found at position "+(i+1)+" of the sorted array.");
				flag=1;
				}
			}
		if (flag==0) 
			System.out.println("Number not found in array!");
		}
		
	//function to perform binary search on an array
	public static void bsearch (int a[], int num) {
		int flag=0, mid, beg=0, last=a.length-1;
		while (beg<last && flag==0) {
			mid=(beg+last)/2;
			if (a[mid]==num) {
				flag=1;
				System.out.println("Number found at position "+(mid+1)+ " of the sorted array.");
				break;
				}
			else if (a[mid]>num)
				last=mid;
			else
				beg=mid+1;
			}
		if (flag==0)
			System.out.println("Number not found in array!");
		}
		
	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		//to get the size of the array
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		
		//to get the array input
		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			}
			
		//to sort the array
		sort(arr);
			
		//to create a menu for performing linear and binary search
		System.out.print("Do you wish to perform a search? (y/n): ");
		String ch = sc.next();
		while (ch.equalsIgnoreCase("y")) {
			System.out.print("Enter number to search for: ");
			int reqd = sc.nextInt();
			System.out.print("1: linear search, 2: binary search; Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: lsearch(arr,reqd); break;
				case 2: bsearch(arr,reqd); break;
				default: System.out.println("Invalid choice!");
				}
			System.out.print("Do you wish to perform another search? (y/n): ");
			ch = sc.next();
			}
		}	
	}
