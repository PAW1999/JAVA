import java.util.Scanner;
class  Student5{
	double fee;
	long MobileNo;
	int Age;
	String Sname;
	String Email;
	String Course;
}	
	/*public void GetStudent(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total student of requirment");
		fee=sc.nextDouble();
		System.out.println("Enter fee o-f Student			:"+fee);
		MobileNo=sc.nextLong();
		System.out.println("Enter the contact no of Student	:"+MobileNo);
		Age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Age of student		:"+Age);
		Sname=sc.nextLine();
		System.out.println("Enter the name of student		:"+Sname);
		Email=sc.nextLine();
		System.out.println("Enter the Email of Student		:"+Email);
		Course=sc.nextLine();
		System.out.println("Enter the course name			:"+Course);
		
	}
	
	
	
	public static void main(String[] args) 
	{ 
		Student5 sc=new Student5();
		sc.GetStudent();
		
	}
	
	
	*/
	
	
	class College{
		String  CollegeName;
		String CollegeId;
		public void get(){
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter college name");
		CollegeName =sc1.nextLine();
		
		}
	}
	

class Test_java{
	public static void main(String []args){
			College cl=new College();
			College3 cl3=new College3();
			cl3.get();
			cl.get();

}
}




