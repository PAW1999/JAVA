import java.util.Scanner;
class Employee{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the of the first no :");
	double sal1=sc.nextDouble();
	System.out.println("result  :"+sal1);
	double sal2=sc.nextDouble();
	System.out.println("result    :"+sal2);
	double salDiff=sal1-sal2;
	System.out.println("result  :"+ salDiff);
	}
}