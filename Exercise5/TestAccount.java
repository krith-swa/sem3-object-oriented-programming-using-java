import java.util.Scanner;

class PANRequiredException extends Exception {
	String message;
	PANRequiredException (String m) {
		message = m;
		}
	}
	
class MinBalRequiredException extends Exception {
	String message;
	MinBalRequiredException (String m) {
		message = m;
		}
	}
	
class NotEnoughMoneyInAccountException extends Exception {
	String message;
	NotEnoughMoneyInAccountException (String m) {
		message = m;
		}
	}
	
class AccountNotFoundException extends Exception {
	String message;
	AccountNotFoundException (String m) {
		message = m;
		}
	}
	
class PANFormatMismatchException extends Exception {
	String message;
	PANFormatMismatchException (String m) {
		message = m;
		}
	}

class Account {
	//data members
	String name;
	int acct_num;
	String branch;
	int balance;
	int minimum_bal = 2000;
	String PAN_num;
	//consructor
	Account (String n, int a, String b, int bal) {
		name = n;
		acct_num = a;
		branch = b;
		balance = bal;
		}
	//member functions
	void deposit (int amt) {
		balance += amt;
		} 
	void withdraw (int amt) {
		balance -= amt;
		}
	}

class TestAccount {
	public static void main (String arg[]) {
		Scanner sc = new Scanner(System.in);
		String name, branch, PAN;
		int aNum, balance, amount;
		Account[] acc = new Account[2];
		
		//account object 1
		System.out.println("__ACCOUNT-1__");
			//acc[0] = new Account();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter account number: ");
		aNum = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter branch: ");
		branch = sc.nextLine();
		System.out.print("Enter balance: ");
		balance = sc.nextInt();
		
		acc[0] = new Account(name,aNum,branch,balance);
		
		//to check for exceptions
			//deposit
		System.out.print("Enter amount to deposit: ");
		amount = sc.nextInt();
		try {
			if (amount > 25000)
				throw new PANRequiredException("PAN number required for deposits greater than 25000.");
			acc[0].deposit(amount);
			}
		catch (PANRequiredException e) {
			System.out.println(e.message);
			System.out.print("Enter PAN number: ");
			PAN = sc.next();
			//PAN number mismatch
			if (PAN.length() != 10) {
				try {
					throw new PANFormatMismatchException("PAN number must have 10 characters.");
					}
				catch (PANFormatMismatchException e0) {
					System.out.println(e0.message);
					}
				}
			
			else {
				for (int i=0; i<10; i++) {
					if (i>=5 && i<=8) {
						try {
							int pan = Integer.valueOf(PAN.charAt(i));
							throw new PANFormatMismatchException("Invalid! PAN number format is cccccnnnnc (c-char, n-num");
							}
						catch (PANFormatMismatchException e1) {
							System.out.println("Invalid! PAN number format is cccccnnnnc (c-char, n-num)");
							}
						}
					else {
						try {
							if (!( ('A'<=PAN.charAt(i) && PAN.charAt(i)<='Z') || ('a'<=PAN.charAt(i) && PAN.charAt(i)<='z') ))
								throw new PANFormatMismatchException("Invalid! PAN number format is cccccnnnnc (c-char, n-num");
							}
						catch (PANFormatMismatchException e2) {
							System.out.println(e2.message);
							}
						}
					}
				}
			acc[0].PAN_num = PAN;
			}
			
			//withdrawal
		System.out.print("Enter amount to withdraw: ");
		amount = sc.nextInt();
		balance = acc[0].balance;
		try {
			if (amount > balance)
				throw new NotEnoughMoneyInAccountException("Not enough balance in account.");
			else if (balance-amount < acc[0].minimum_bal)
				throw new MinBalRequiredException("Minimum balance of 2000 is required in account.");
			
			}
		catch (NotEnoughMoneyInAccountException e) {
			System.out.println("Cannot withdraw! "+e.message);
			}
		catch (MinBalRequiredException e) {
			System.out.println("Cannot withdraw! "+e.message);
			}
		
		//account object 2
		acc[1] = new Account("Hannah",230,"Adyar",20000);
		
		//to search for account number
		System.out.print("Enter account number to search for: ");
		int n = sc.nextInt();
		int flag = 0;
		for (int i=0; i<acc.length; i++) {
			if (acc[i].acct_num == n) {
				flag = 1;
				}
			try {
				if (flag==0)
					throw new AccountNotFoundException("Account number not found in records.");
				}
			}
		catch (AccountNotFoundException e) {
				System.out.println(e.message);
				}
		
		}
	}
