class Student  {
	double sal;
	double sal1;
	public static void main(String[] args) 
	{ 
		
		Student sc=new Student();
		sc.sal=Double.parseDouble(args[0]);
		System.out.println("result "+ sc.sal);
		
		sc.sal1=Double.parseDouble(args[1]);
		System.out.println("Result :"+ sc.sal1);
	}
}
