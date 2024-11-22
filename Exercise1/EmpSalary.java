class Employee {
	int id;
	String name;
	String desgn;
	int years_of_exp;
	double basicPay, DA, HRA, LIC, PF;
	String lic_opt;
	int hours_worked;
	double grossPay, deductions, netPay;
	
	//function to get employee's data
	void getData(int no, String n, String dn, int yoe, String opt, int hw) {
		id=no;
		name=n;
		desgn=dn;
		years_of_exp=yoe;
		lic_opt=opt;
		hours_worked=hw;
		}
	
	//function to display the employee's details
	void display() {
		System.out.println("Employee ID: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Designation: "+desgn);
		System.out.println("Years of experience: "+years_of_exp);
		System.out.println("Basic pay: "+basicPay);
		System.out.println("No. of hours worked: "+hours_worked);
		System.out.println("Gross salary: "+grossPay);
		System.out.println("Net salary: "+netPay+"\n");
		}

	//function to calculate gross pay of employee
	void calc_grossPay() {
		if (desgn=="Intern") {
			basicPay=200;
			DA=2000;
			HRA=1000;
			PF=500;
			grossPay = (hours_worked*basicPay)+DA+HRA;
			}
		else if (desgn=="Manager") {
			basicPay=30000;
			DA=0.4*basicPay;
			HRA=0.1*basicPay;
			PF=0.08*basicPay;
			if (lic_opt=="y")
				LIC=2000;
			else
				LIC=0;
			grossPay = basicPay+DA+HRA;
			}
		else if (desgn=="Trainee" || desgn=="Analyst" || desgn=="Software engineer" || desgn=="TeamLead") {
			basicPay=28000;
			DA=0.3*basicPay;
			HRA=0.1*basicPay;
			PF=0.08*basicPay;
			if (lic_opt=="y")
				LIC=1600;
			else
				LIC=0;
			grossPay = basicPay+DA+HRA;
			}
		}
	
	//function to calculate net pay of employee
	void calc_netPay() {
		calc_grossPay();
		deductions = LIC+PF;
		netPay = grossPay-deductions;
		}
		
	//function to promote an employee based on years of experience
	void promote() {
		System.out.println("Current employee details:");
		display();
		int flag=0;
		if (desgn=="Intern" && years_of_exp>=2) {
			desgn="Trainee";
			flag=1;
			}
		else if ((desgn=="Trainee" || desgn=="Analyst" || desgn=="Software engineer" || desgn=="TeamLead") && years_of_exp>=7) {
			desgn="Manager";
			flag=1;
			}
		else if (desgn=="Manager" && years_of_exp>=12) {
			System.out.println("Targeted for promotion. New designation to be assigned soon.");
			}
		else {
			System.out.println("Employee does not have required years of experience. Promotion denied.");
			}
		
		if (flag==1) {
			System.out.println("Promoted! New payslip of employee:");
			calc_netPay();
			display();
			}
		}
	}
	
class EmpSalary {
	public static void main (String a[]) {
		int n=3, eID;
		//declaring array of employees
		Employee[] arr;
		arr = new Employee[n];
		
		//Employee 1
		arr[0] = new Employee();
		arr[0].getData(101,"Mukund","Manager",13,"y",160);
		arr[0].calc_netPay();
		
		//Employee 2
		arr[1] = new Employee();
		arr[1].getData(102,"Deepa","Intern",2,"n",60);
		arr[1].calc_netPay();
		
		//Employee 3
		arr[2] = new Employee();
		arr[2].getData(103,"Connor","Analyst",9,"y",160);
		arr[2].calc_netPay();
		
		/*for (int i=0; i<arr.length; i++) {
			arr[i] = new Employee();
			arr[i].getData(101,"Mukund","Manager",13,30000,2000,160); //note: get user input later
			arr[i].calc_netPay();
			arr[i].display();
			}
		}*/ //to use late for user input employee data
		
		//to display payroll of all employees
		System.out.println("Payroll of employees:\n");
		for (int i=0; i<arr.length; i++) {
			arr[i].display();
			}
		
		//to display the payslip of a particular employee
		System.out.println("Displaying payslip of particular employee with ID=103...");
		eID = 103; //get as user input later
		for (int i=0; i<arr.length; i++) {
			if (arr[i].id == eID)
				arr[i].display();
			}
			
		//to promote a particular employee
		System.out.println("Granting promotion to a particular employee after checking for reqd no. of years of experience...");
		eID = 102; //get as user input later
		for (int i=0; i<arr.length; i++) {
			if (arr[i].id == eID)
				arr[i].promote();
			}
		
		}
	}
