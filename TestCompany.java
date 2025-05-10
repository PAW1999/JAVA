class TestCompany {
	public static void main(String[] args) 
	{
		Employees e1=new Employees();
		e1.age=21;
		System.out.println("Empoyee Age		:"+e1.age);
		e1.name="pawan";
		System.out.println("Employee Name	:"+e1.name);
		e1.empId="pawankuawrqe253246@gamil.com";
		System.out.println("zemployee emain	:"+e1.empId);
		e1.sal=654234;
		System.out.println("Employee sal	:"+e1.sal);
		e1.deptno="B-tech";
		System.out.println("Employee deptno	:"+e1.deptno);
		
		System.out.println("	");
		Company cn=new Company();
		System.out.println("\n");
		cn.displaySal(e1);
		cn.AnualSal(e1);
		cn.incrementSal(e1,20);
		System.out.println("current sal	:"+e1.sal);
	}
}
