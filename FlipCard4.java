import java.util.Scanner;
class FlipCard4 {
	String name;
	String Email;
	char ch;
	 public void GetFlipCard4(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name=sc.nextLine();
		
		System.out.println("Enter email: ");
		Email=sc.nextLine();
		
		System.out.println("Enter character: ");
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z' ) || (ch>='A' && ch<='Z')||(ch<='0'&&ch<='9'){
			System.out.println("All Size allowed int this ");
		}
		else{
			System.out.println("all size is not eligible");
		}
	}
}
