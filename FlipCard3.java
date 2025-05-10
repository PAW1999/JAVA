import java.util.Scanner;
class FlipCard3{
	int age;
	FlipCard4 f4 = new FlipCard4();
	public void	GetFlipcard3(){
			Scanner sc = new Scanner(System.in);
			age=sc.nextInt();
			System.out.println("Enter age of the customer");
			if(age>=18 && age<=21){
				System.out.println("You are Eligible for shoping ");
			}
			else{
				System.out.println("You are not Eligible for shoping ");
			}
	}
}
