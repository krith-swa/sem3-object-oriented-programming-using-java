import java.util.Scanner;

class Matrix {
	public static void display (int m[][]) {
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+" ");
				}
			System.out.println();
			}
		System.out.println();
		}
		
	public static void add (int a[][], int b[][]) {
		System.out.println("Addition of second matrix to first matrix: ");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
				}
			System.out.println();
			}
		System.out.println();
		}
	
	public static void subtract (int a[][], int b[][]) {
		System.out.println("Subtraction of second matrix from first matrix: ");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]-b[i][j]+" ");
				}
			System.out.println();
			}
		System.out.println();
		}
		
	public static void multiply (int a[][], int b[][]) {
		System.out.println("Multiplication of the two matrices: ");
		int [][] c = new int[a.length][a[0].length];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				for (int k=0; k<a.length; k++) {
					c[i][j]+=a[i][k]*b[k][j];
					}
				System.out.print(c[i][j]+" ");
				}
			System.out.println();
			}
		System.out.println();
		}
	
	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		//to get no. of rows and columns as input from the user
		System.out.print("Enter no. of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter no. of columns: ");
		int c = sc.nextInt();
		
		//to get the matrix input
			//matrix A
		int [][] A = new int[r][c];
		System.out.println("Enter matrix A elements: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				A[i][j] = sc.nextInt();
				}
			}
			
			//matrix B
		int [][] B = new int[r][c];
		System.out.println("Enter matrix B elements: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				B[i][j] = sc.nextInt();
				}
			}
			
		//displaying matrices A and B
		System.out.println("\nDisplaying A: ");
		display(A);
		System.out.println("Displaying B: ");
		display(B);
		
		//addition, subtraction, multiplication - menu		
		do {
			System.out.print("1: addition, 2: subtraction, 3: multiplication, 4: quit\nEnter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: add(A,B); break;
				case 2: subtract(A,B); break;
				case 3: multiply(A,B); break;
				case 4: System.exit(0);
				default: System.out.println("Invalid choice!");
				}
			} while (true);
		}
	}
