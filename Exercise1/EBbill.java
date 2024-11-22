class Consumer {
	int cno;
	String cname;
	int PrevMonthReading;
	int CurMonthReading;
	String connType;
	double amount;
	
	//function to initialise data members
	void getVal(int n, String name, int pmr, int cmr, String type) {
		cno=n;
		cname=name;
		PrevMonthReading=pmr;
		CurMonthReading=cmr;
		connType=type;
		}
		
	//function to print values
	void print() {
		System.out.println("Consumer no.: "+cno);
		System.out.println("Consumer name: "+cname);
		System.out.println("Previous month reading: "+PrevMonthReading);
		System.out.println("Current month reading: "+CurMonthReading);
		System.out.println("Connection type: "+connType);
		System.out.println("Bill amount: "+amount);
		}
		
	//function to calcualte bill amount
	void calcBill() {
		int units = CurMonthReading-PrevMonthReading;
		if (connType=="domestic") {
			if (units<=100 && units>=0) {
				amount = units; }
			else if (units<=200) {
				amount = ((units-100)*2.5)+100.0; }
			else if (units<=500) {
				amount = ((units-200)*4)+(100*2.5)+100; }
			else {
				amount = ((units-500)*6)+(300*4)+(100*2.5)+100; }
			}
		else if (connType=="commercial") {
			if (units<=100 && units>=0) {
				amount = units*2; }
			else if (units<=200) {
				amount = ((units-100)*4.5)+(100*2); }
			else if (units<=500) {
				amount = ((units-200)*6)+(100*4.5)+(100*2); }
			else {
				amount = ((units-500)*7)+(300*6)+(100*4.5)+(100*2); }
			}
		}
	}
	
class EBbill {
	public static void main (String a[]) {
		Consumer c1 = new Consumer();
		c1.getVal(101,"Amrit",4300,4650,"domestic");
		c1.calcBill();
		c1.print();
		}
	}
	
