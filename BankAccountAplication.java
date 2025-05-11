class  BankAccountAplication{
	String bankName;
	String bankBranch;
	String ifsc;
	long accNum;
	String accHName;
	double balance;
	double amount;
	
	BankAccountAplication(String bankName,String bankBranch,String ifsc,long accNum,String accHName,double balance,double amount){
		this.bankName=bankName;
		this.bankBranch=bankBranch;
		this.ifsc=ifsc;
		this.accNum=accNum;
		this.accHName=accHName;
		this.balance=balance;
	}

	void setbankName(String bankName){
		this.bankName=bankName;
	}
	
	String getbankName(){
		return bankName;
	}
	void accHName(String accHName){
		this.bankBranch=bankBranch;
		
	}
	String  getbankBranch(){
		return bankBranch;
	}
	void setifsc(String ifsc){
		this.ifsc=ifsc;
	}
	String getifsc(){
		return ifsc;
	}
	void getaccNum(long accNum){
		this.accNum=accNum;
		
	}
	long getaccNum(){
		return accNum;
	}
	void setaccHName(String accHName){
		this.accHName=accHName;
		
	}
	String getaccHName(){
		return accHName;
	}
	void setbalance(double balance){
		this.balance=balance;
	}
	double getbalance(){
		return balance;
	}
	
	
	
	// busseness operation methods for performing student operation 
	void deposit(){
		if(amount>=0){
			amount+=balance;
			System.out.println("check your balance	:"+balance);
		}
		else{
			System.out.println("balance in not available	:");
		}
	}
	void withdraw(){
		if(amount<=0 && amount>=balance){
			amount-=balance;
			System.out.println("withdraw your balance	"+balance);
		}
		else{
			System.out.println("sufficent balance");
		}
		
	}
		
	
	// Display method for printing object values 
	
	 void display(){
		System.out.println("enter the bank name 				\n	:"+bankName);
		System.out.println("Enter the name of the bankBranch name\n	:"+bankBranch);
		System.out.println("Enter the name of code of the ifsc number	:"+ifsc);
		System.out.println("Enter the acount account number 	:"+accNum);
		System.out.println("Enter the name of the account holder	:"+accHName);
		System.out.println("Show the balance of the account	:"+balance);
	}
}