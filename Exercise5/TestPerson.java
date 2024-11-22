import java.util.Scanner;

class MinorCitizenException extends Exception {
	String message;
	MinorCitizenException (String m) {
		message = m;
		}
	}

class Person {
	//data members
	String name;
	int age;
	String aadharnumber;
	//member functions
	void getInput (String n, int a, String an) {
		name = n;
		age = a;
		aadharnumber = an;
		}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Aadhar number: "+aadharnumber);
		}
	boolean canVote() {
		if (age>=18)
			return true;
		return false;
		}
	boolean hasAadhar() {
		if (aadharnumber.length() == 12)
			return true;
		return false;
		}
	}
	
class TestPerson {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("__PERSON__");
		Person p = new Person();
		
		String name;
		int age = -1;
		String aadharno;
		//to test exception handling
		
		System.out.print("Enter name: ");
		name = sc.nextLine();
		//to validate user-input age
		try {
			System.out.print("Enter age: ");
			String input = sc.next();
			try {
				age = Integer.valueOf(input);
				}
			catch (NumberFormatException e) {
				System.out.println("Error! Age should be a number");
				System.exit(0);
				}
			if (age<0)
				throw new NumberFormatException("Age should be a number");
			}
		//to catch number input exception
		catch (NumberFormatException e) {
			System.out.println("Error! Age must be a positive integer.");
			System.exit(0);
			}
		System.out.print("Enter aadhar number: ");
		aadharno = sc.next();
		//if datatype of all details correct, build record
		p.getInput(name,age,aadharno);
		
		//to catch minor citizen exception
		try {
			if (!p.canVote())
				throw new MinorCitizenException("Error! Citizen must be above 18 to vote.");
			}
		catch (MinorCitizenException e) {
			System.out.println(e.message);
			}
		
		//to validate aadhar number using built-in exception
		try {
			if (!p.hasAadhar())
				throw new NullPointerException("Aadhar no. must be 12 digits. ");
			}
		catch (NullPointerException e) {
			System.out.println("Error! Valid aadhar number should be entered.");
			System.exit(0);
			}
			
		//if all details correct, enter into record
		System.out.println("Record of person entered into system.");
		}
	}
