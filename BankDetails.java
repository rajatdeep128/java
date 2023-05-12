package bankmanagementsystem;

import java.util.Scanner;

public class BankDetails {
 
	private String accno;
	private String name;
	private String acc_no;
	private long balance;
	
	Scanner sc = new Scanner(System.in);
	
	// Opening new account
	int ch;
	public void openAccount() {
	
		
		System.out.println("Enter Account No");
			accno = sc.next();
		
		System.out.println("Enter Account type");
		System.out.println("1.Savings Account \n2.Current Account \n3.Demat Account \n4.Salary Account \n5.Fixed Deposite Account");
	     
		 acc_no = sc.next();
		
		
			
		System.out.println("Enter Account Name");
			name = sc.next();
			
		System.out.println("Enter Balance");
			balance = sc.nextLong();
						
				
	}
	
	//display account details
	int found;
	int i;
	
	public void showAccount() {
		

		
		String accountType = "";
	    switch (acc_no) {
	        case "1":
	            accountType = "Savings Account";
	            break;
	        case "2":
	            accountType = "Current Account";
	            break;
	        case "3":
	            accountType = "Demat Account";
	            break;
	        case "4":
	            accountType = "Salary Account";
	            break;
	        case "5":
	            accountType = "Fixed Deposite Account";
	            break;
	        default:
	            accountType = "Unknown Account Type";
	            break;
	    }

	    System.out.println("Name Of Account Holder: " + name);
	    System.out.println("Account No.: " + accno);
	    System.out.println("Account Type: " + accountType);
	    System.out.println("Balance: " + balance);
	    System.out.println("\n");
	}
		
		

		
	
	
	//method for deposit money
	
	public void deposit(){
		
		long amount;
		
		System.out.println("Enter The Ammount You Want To deposit:");
		amount = sc.nextLong();
		
		balance = balance+amount;
		
	}
	
	
	//method for withdraw money
	
	public void withdrawal(){
		
		long amount;
		
		System.out.println("Enter The Amount You Want To Withdrawal");
		
		amount = sc.nextLong();
		
		if(amount<=balance) {
			
			balance = balance-amount;
			
			System.out.println("Balance After Withdrawal:" + balance);
			
		} else {
			
			System.out.println("Balance is Less Than " + amount + "\nTransaction Failed...!Due to Low Balance");
		}

	}
	
	//method to search an account number
	
	public boolean search(String ac_no) {
		
		if(accno.equals(ac_no)) {
			
			showAccount();
			
			return(true);
		}
		
		    return(false);
	}

	
}
