import java.util.*;
class Transaction{
	
	double balance=5000;
	
	double total_Amount=0.0;
	boolean authenticate(int pin){
		/*Scanner sc=new Scanner(System.in);
		pin=sc.nextInt();
		balance=sc.nextDouble();
		total_Amount=sc.nextDouble(); */  //local variable working inside only that method outside is not working(cannot find variable name)
		if(pin==1234)
		{
			System.out.println("Wellcome int ATM	:"+pin);
			return true;
		}
		else{
			System.out.println("invalide pin try again	:");
			return false;
		}
		
	}

double deposit(double amount){
	if(amount<=balance){
	    total_Amount+=balance;
		System.out.println("Wellcome to dipost balance in this acount	:"+amount);
		return amount;
	}
	else{
		System.out.println("if we are not able to deposit in bank account	:");
		return balance;
	}
}

void withdraw(double amount){
			if(amount>=0 && amount<=balance){
				total_Amount-=balance;
		System.out.println("we are eligibel for withdraw the balance	:"+amount);
	}
	else{
		System.out.println("");
	}
}
void displayBalance(){
	System.out.println("Check the pin for inserting the ATM card	:");
	System.out.println("Deposit the total amount in this account	:");
	System.out.println("Withdraw the balance from this acount		:");
	
	}
	
}
