class	 BankOfficeReudancy{

	public static void main(String []args){
		BankAccount acc1=new BankAccount();
		//initializing acc1 object help of class name 
		System.out.println("Displaying the values of object acc1: ");
	
		acc1.accNum=121;
		acc1.accHName="hk";
		acc1.balance=40000;
		System.out.println(acc1.accNum+" "+acc1.accHName+" "+acc1.balance);
		//creting a second object help of class name
		System.out.println("Displaying the value of acc2:");
		BankAccount acc2=new BankAccount();
		acc2.accNum=121;
		acc2.accHName="hk";
		acc2.balance=40000;
		System.out.println(acc2.accNum+" "+acc2.accHName+" "+acc2.balance);

	// creating a third object help of class name for using referemce data type
		System.out.println("Displaying the value of acc3:");
		BankAccount acc3=new BankAccount();
		acc3.accNum=121;
		acc3.accHName="hk";
		acc3.balance=40000;
		System.out.println(acc3.accNum+" "+acc3.accHName+" "+acc3.balance);
	}
}
