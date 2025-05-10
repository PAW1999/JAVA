package p2;
import p1.A;
class  c extends A{
	public static void main(String[] args) {
		A a1=new A();
		
		System.out.println("Hello World!");
		//System.out.println("a: "+ a1.a);
		//System.out.println("b: "+ a1.b);
		//System.out.println("c: "+ a1.c);
		
		C c1 = new C();
		System.out.println("c: "+ c1.c);
		System.out.println("d: "+ c1.d);
	}
}
