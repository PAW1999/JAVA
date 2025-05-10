class Company {
	void displaySal(Employees e1){
		System.out.println(e1.age+"\n"+e1.name+"\n"+e1.empId+"\n "+e1.sal+"\n "+e1.deptno);
	}
	void AnualSal(Employees e1){
		System.out.println("Anual Salary	:" + (e1.sal*12));
	}
	void incrementSal(Employees emp, double perc){
		double salIncrement=emp.sal*perc/100;
		emp.sal=salIncrement;
		System.out.println("After Increment	:"+emp.sal);
	}
}
