package bankmanagementsystem;

import java.util.Scanner;
public class BankingApp { 
	
	
	  public static void main(String arg[]) { 
		  
	        Scanner sc = new Scanner(System.in);  
	        //create initial accounts  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankDetails C[] = new BankDetails[n];  
	        for (int i = 0; i < C.length; i++) {  
	        C[i] = new BankDetails();  
	           C[i].openAccount(); 
	            
	            if(n>0) {
	            	System.out.println("Your Account Details are Successfully Added");
	            	System.err.println("");
	            
	            	
	            }
	            
	        }  
	  //}
	        // loop runs until number 5 is not pressed to exit  
	        int ch;  
	        do{  
	            System.out.println("\n**Banking System Application**");  
	            System.out.println("1. Display all account details \n2. Search by Account number\n3. Deposit the amount \n4. Withdraw the amount \n5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	            
	            switch(ch) {
	            
	            case 1:
	            	for(int i=0; i<C.length;i++){
	            		C[i].showAccount();
	            	}
	            	break;
	     
	            case 2:
	            	System.out.println("Enter Account no. You Want to Search:");
	             String ac_no = sc.next();
	             boolean found = false;
	             
	             for(int i = 0; i<C.length; i++) {
	            	 found = C[i].search(ac_no);
	            	 
	            	 if(found) {
	            		 break;
	            	 }
	             }
	             
	             if(!found) {
	            	 System.out.println("Search failed! Accound does'nt Exist...!");
	            	 
	             }
	             break;
	             
	            case 3:
	            	System.out.println("Enter Account no.:");
	            	ac_no = sc.next();
	            	found = false;
	            	
	            	for(int i=0; i<C.length; i++) {
	            		found = C[i].search(ac_no);
	            		 
	            	if(found) {
	            		
	            		C[i].deposit();
	            		break;
	            	}
	            		
	            	}
	            	
	            	if(!found) {
		            	 System.out.println("Search failed! Accound does'nt Exist...!");
		            	 
		             }
		             break;
		             
		             
	            case 4:
	            	System.out.println("Enter Account no.:");
	            	ac_no = sc.next();
	            	found = false;
	            	
	            	for(int i=0; i<C.length; i++) {
	            		found = C[i].search(ac_no);
	            		 
	            	if(found) {
	            		
	            		C[i].withdrawal();
	            		break;
	            	}
	            		
	            	}
	            	
	            	if(!found) {
		            	 System.out.println("Search failed! Accound does'nt Exist...!");
		            	 
		             }
		             break;
		             
	            case 5:
	            	System.out.println("See You Soon...");
	            	
	            	break;
	            	
	            }
	        }
	        while(ch!=5);
	        
	  }
}