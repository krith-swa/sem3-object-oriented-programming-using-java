import java.util.Scanner;

class Student {
	int id;
	String name;
	String dept;
	int mark1, mark2, mark3;
	String grade;
		
	//function to input data members
	void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.print("ID: ");
		id = sc.nextInt();
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Department: ");
		dept = sc.next();
		System.out.println("Marks in three subjects: ");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
		}
		
	//function to print data members
	void printData() {
		System.out.println("Student ID: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Department: "+dept);
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Grade: "+grade+"\n");
		}
		
	//function to calculate student grade
	void calcGrade() {
		float avg=(mark1+mark2+mark3)/3;
		if (avg>90 && avg<=100) grade="O - Outstanding";
		else if (avg>80 && avg<=90) grade="A+ - Excellent";
		else if (avg>70 && avg<=80) grade="A - Very good";
		else if (avg>60 && avg<=70) grade="B+ - Good";
		else if (avg>50 && avg<=60) grade="B - Average";
		else grade="RA";
		}
	}
	
class StudentGrades {
	//function to search for student details
		//search using id
	public static void search (int no, Student[] arr) {
		int flag=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i].id==no) {
				arr[i].printData();
				flag=1;
				}
			}
		if (flag==0)
			System.out.println("Entry not found\n");
		}
		
		//search by dept
	public static void search (String d, Student[] arr) {
		int flag=0;
		for (int i=0; i<arr.length; i++) {
			if (d.equalsIgnoreCase(arr[i].dept)) {
				arr[i].printData();
				flag=1;
				}
			}
		if (flag==0)
			System.out.println("Entry not found\n");
		}
		
	//function to display details of all students
	public static void display (Student[] arr) {
		System.out.println("\nCollective Student Report:\n");
		for (int i=0; i<arr.length; i++) {
			arr[i].printData();
			}
		}
	
	//main function
	public static void main (String a[]) {
		Scanner scan = new Scanner(System.in);
		//getting user input for the number of students
		System.out.print("Enter no. of students: ");
		int n = scan.nextInt();
		//declaring an object array
		Student[] s = new Student[n];
		//to get the student details and calculate their grades
		for (int i=0; i<n; i++) {
			s[i] = new Student();
			s[i].inputData();
			s[i].calcGrade();
			}
		
		/* to impelment method overloading - but datatype already known while taking input
		//to call search using id
		System.out.print("Enter required student ID: ");
		int reqd_id = scan.nextInt();
		search(reqd_id,s);
		//to call search using dept
		System.out.print("Enter required departmetn: ");
		String reqd_dept = scan.next();
		search(reqd_dept,s);
		*/
			
		//to repeat search as long as user wants to
		System.out.print("\nDo you wish to search for students' details? (y/n): ");
		String ch = scan.next();
		while (ch.equalsIgnoreCase("y")) {
			System.out.print("Do you wish to display all student's details (enter 1) or search with particulars (enter 2)?: ");
			int choice = scan.nextInt();
			switch (choice) {
				case 1: display(s); break;
				case 2: {
					//to implement method overloading properly - obsolete when datatype is known
					System.out.print("Enter the required student ID or dept: ");
					String reqd = scan.next();
					try {
						int r = Integer.parseInt(reqd);
						search(r,s);
						}
					catch (Exception e) {
						search(reqd,s);
						}
					break;
					}
				default: System.out.println("Invalid choice!");
				}
			System.out.print("Do you wish to search for students' details again? (y/n): ");
			ch = scan.next();
			}
		System.out.println("Exiting program...");
		}
	}

