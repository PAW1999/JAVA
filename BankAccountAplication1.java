class  BankAccountAplication1{
	public static void main(String[] args) {
		
	// BankAccountAplication bnk=new  BankAccountAplication("SBI","SBI BRANCH","123OK90",608300170073029l,"pawan",7852);
	BankAccountAplication bnk = new BankAccountAplication("SBI", "SBI BRANCH", "123OK90", 608300170073029L, "pawan", 7852.0, 1000.0);

	bnk.deposit();           // use correct method name and case
	bnk.setbalance(78552);   // if such a method exists

	
	/*String bankName;
	String bankBranch;
	String ifsc;
	long accNum;
	String accHName;
	double balance;*/
	
	
	  //Displaying student obj initial values 
		//bnk.Deposit();
		//s1.setcourse("Full Stack java devloper");
		//bnk.withdraw();
		//bnk.balance(78552);
		// displaying modified values
		bnk.display();
	}
}
