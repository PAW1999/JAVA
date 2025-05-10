import java.util.Scanner;
class SimpleIf {
	/*public static void main(String[] args) 
	{
		if(0){
			
		System.out.println("a");
		System.out.println("b");
		}
		System.out.println("c");
	}
}
*/
/*public static void main(String[] args){
	if('0'){
		System.out.println("a");
		System.out.println("b");
	}
	System.out.println("c");
	
	}
}*/
/*public static void main(String[] args){
	if('a'<'b'){
		System.out.println("a");
		System.out.println("b");
	}
	System.out.println("c");
	
	}
}*/
/*public static void main(String[] args){
	if(-1.1){
		System.out.println("a");
		System.out.println("b");
	}
	System.out.println("c");
	
	}
}*/
/*public static void main(String[] args){
	if(5==5){
		System.out.println("a");
		System.out.println("b");
	}
	System.out.println("c");
	
	}
}*/
/*public static void main(String[] args){
	if("abc">"ab"){
		System.out.println("a");
		System.out.println("b");
	
	System.out.println("c");
	}
	}
}
*/
/*public static void main(String[] args){
	int n;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	if(n<0){
		n=-n;
		System.out.println("a");
	}
		else {
		System.out.println("b");
	}
	System.out.println("c");
	
	}
}
java not alowed goto as a like c,c++
public static void main(String [] args){
	int i;
	Scanner sc=new Scanner(System.in);
	i=sc.nextInt();
	start:
		System.out.println("Result :"+i);
	i++;
	if(i<=10) goto start ;
}
}

public static void main(String [] args){
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Tack the value from user");
	ch = sc.next().charAt(0);
	/*if(a='a'  && a='z '||  a='A'&& a='Z'|| a='' && a='9'){
		System.out.println("it is a specil character  :"+a);
		else{
			System.out.println("it is not a special character ");
			if(ch>='a' && ch<='z'){
				System.out.println("Lower case char");
			}
		}
	}
	*/
	/*blic static void main(String[] args){
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value from user");
		ch=sc.next().charAt(0);
if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
	System.out.println("it is not a specil character: "+ch);
}
else
		{
	System.out.println("it is a special character :"+ch);
		}
	}
}*/

/*public static void main(String[] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of character from user");
	ch=sc.next().charAt(0);
	if(ch>=97 && ch<=122 || ch<97 && ch>122){
		System.out.println("Lower case char	:"+ch);
	}
	else
	{
		System.out.println("not a lower case	:"+ch);
		}
	}
}

*/
/*public static void main(String[] args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of the student");
	n=sc.nextInt();
	if(!(n>10 && n<=99 || n<=-10 && n>=-99)){
		System.out.println("It is a two digit number	"+n);
	}
	//se if(! (n>=10 && n<=99 || n<=-10 && n>=-99))
	
		System.out.println("It not a two digit number	:"+n);
		}
	}

}
*/
/*public static void main(String[]args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value ");
	n=sc.nextInt();
	if(n%2==0)
	{
		System.out.println("even");
	}
		else
		{
			System.out.println("odd");
		}
}
}
public static void main(String [] args){
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of the numeber");
	ch=sc.next().charAt(0);
	if(ch>='a' && ch<='z'|| ch<='A' && ch>='Z'|| ch>='0'&& ch<='9'){
		System.out.println("It is not a special character");
	}
		else{
			System.out.println("It is a special character");
		}
}}

public static void main(String[]args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value ");
	n=sc.nextInt();
	if(n/2*2==0)
	{
		System.out.println("even");
	}
		else
		{
			System.out.println("odd");
		}
}
}

public static void main(String[]args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value ");
	n=sc.nextInt();
	if((n&1)==0)
	{
		System.out.println("even");
	}
		else
		{
			System.out.println("odd");
		}
}
}

public static void main(String[] args){
	if(n%4==0){
		System.out.println("leap year");
	}
	else{
		System.out.println("common year");
		
	}
}
}

public static void main(String[] args){
	int n;
	Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
			if(n%2==0){
				System.out.pritnl("even");
		}
			else if(n%2==0){
				System.out.println("odd");
		}
	}
}


public static void main(String[] agrs){
	int a,b;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Enter the value ");
	if(a>b){
		System.out.println("a is big");
	}
	else{
		System.out.println("b is big");	
		}
	}	
}

public static void main(String[] args){
	int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		n=sc.nextInt();
		
		if(n>0){
			System.out.println("+ve");
		}
		else if(n<0){
			System.out.println("-ve");
			
		}
		else{
			System.out.println("zero");
		}
	}
}

public static void main(String [] args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	n=sc.nextInt();
	
}
*/

/*nested if*/
/*public static void main(String[] args){
	int pin,c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	pin=sc.nextInt();
	if(pin==1234){
		System.out.println("Wellcome to HDFC ATM");
	}
	else{
		c++;
		if(c==3){
			System.out.println("your blocked for 24-hours");
		}
		else{
			System.out.println("Invalid PIN");
		     }
		}
	}
	
}*/
/*IRCTR LOGIN:*/
/*public static void main(String [] args){
	char user[20], pass [20],cap[20];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter user name");
	user=sc.nextLine();
	
	System.out.println("tack the number from user");
	pass = sc.next();
	System.out.println("Enter pass word");
	pass=sc.next();
	System.out.println("Enter the captcha");
	
}*/
public static void main(String []args){
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Check the week day in month:");
	n=sc.nextInt();
	switch(n){
	case 1 :System.out.println("sunday");break;
	case 2 :System.out.println("Monday");break;
	case 3 :System.out.println("saturday");break;
	case 4 :System.out.println("tuesday");break;
	case 5 :System.out.println("wednesday");break;
	default: System.out.println("Invalid day");
		}
	}
}