
import java.util.*;
class Test_Transaction{ 
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
	
		ATMTransaction sc=new ATMTransaction();
		System.out.println("insert pin <int>");
		sc.pin=s1.nextInt();//sc.pin();
		System.out.println("amount  <double>");
		sc.amount=s1.nextDouble();
		System.out.println("total amt string ");
		sc.total_Amount=s1.nextDouble();
		
		System.out.println("transaction class calling deposit method");
		Transaction sc1=new Transaction();
		System.out.println("insert deposit method pass amount ---amount  <double>");
		sc1.deposit(s1.nextDouble());
		 sc1.authenticate(12);
		 
		 System.out.println("insret the withdraw balance	:");
		 sc1.withdraw(s1.nextDouble());
	}		
		
}
