import java.util.Scanner;

class Person {
	//data members
	private String name;
	private String address;
	//constructor
	Person (String n, String a) {
		name = n;
		address = a;
		}
	//member functions
	String getName() {
		return name;
		}
	String getAddress() {
		return address;
		}
	void setAddress(String a) {
		address = a;
		}
	}
	
class Employee extends Person {
	//data members
	private String empid;
	private String dept;
	private int basic;
	//constructor
	Employee (String n, String a, String e, String d, int b) {
		super(n,a);
		empid = e;
		dept = d;
		basic = b;
		}
	//member functions
	int getEmpid() {
		return Integer.parseInt(empid);
		}
	String getDept() {
		return dept;
		}
	int getBasic() {
		return basic;
		}
	void setDept (String d) {
		dept = d;
		}
	void setBasic (String b) {
		basic = b;
		}
	float calSalary() {
		//fill here using formula
		}
	}
	
class Faculty extends Employee {
	//data members
	private String designation;
	private String course;
	//constructor
	Faculty (String n, String a, String e, String d, int b, String de, String c) {
		super(n,a,e,d,b);
		designation = de;
		course = c;		
		}
	//member functions
	String getDesig() {
		return designation;
		}
	float getCourse() {
		return Float.parseFloat(course);
		}
	void setDesig (String d) {
		designation = d;
		}
	void setCourse (String c) {
		course = c;
		}
	float calSalary() {
		//fill here
		}
	}
	
interface Student {
	float [] getMarks();
	float calcGPA();
	}
	
class TeachingAssistant extends Employee implements Student {
	//data members
	private String project;
	private String course;
	private float[] marks;
	//constructor
	TeachingAssistant (String n, String a, String e, String d, int b, String p, String c, float m) {
		super(n,a,e,d,b);
		project = p;
		course = c;
		marks[] = m; //check input type
		}
	//memeber functions
	String getProject() {
		return project;
		}
	String getCourse() {
		return course;
		}
	float[] getMarks() { //check input-ouput type for func
		return marks[];
		}
	void setCourse (String c) {
		course = c;
		}
	float calGPA() {
		//write implementation here
		}
	float calSalary() {
		//fill here
		}
	}
	
class TestDriver {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
				
		}
	}
