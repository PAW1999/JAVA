import java.util.Scanner;
class  FlipCard2{
	double Amount;
	FlipCard3 f3 = new FlipCard3();
	public void GetFlip(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount :");
		Amount=sc.nextDouble();
		
		System.out.println("Enter the value of total Amount");
		if(Amount<=1000){
			System.out.println(" you are eligible for shoping to the basis of the amount  ");
		}
		else{
			System.out.println("You are not eligible for shoping related of amount");
		}
		
	}
}