package calculator;




import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		float n1,n2,cal;
		
		System.out.println("Enter two Numbers");
		Scanner r=new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		System.out.println("Select Operation");
		//ch=r.nextInt();
		char a = input.next().charAt(0);

	
		
		if(a=='+') {
			cal=n1+n2;
			System.out.println("ADDITON\n" + cal);
		}
		else if(a=='-') {
			cal=n1-n2;
			System.out.println("SUBTRACTION\n" +cal);
		}
		else if(a=='*') {
			cal=n1*n2;
			System.out.println("MULTIPLICATION\n" + cal);
		}
		else if(a=='/') {
			cal=n1/n2;
			System.out.println("DIVISION\n" +cal);
		}
		else if(a=='%') {
			cal=n1%n2;
			System.out.println("RIMAINDER\n" +cal);
		}
		
		

	}

}
