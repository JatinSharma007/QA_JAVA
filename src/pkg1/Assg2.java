package pkg1;

public class Assg2 {
	
	public int sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum result of is " +c);
		return c;
	}
	public int sub(int a1, int b1) {
		int c1=a1-b1;
		System.out.println("Sub result   is " +c1);
		return c1;
	}
	public int multi(int a2, int b2) {
		int c2=a2*b2;
		System.out.println("Multi result is " +c2);
		return c2;
	}
	public void div(int a3, int b3) {
		int c3=a3/b3;
		System.out.println("Final result is " +c3);
		
}
	
	public void summ(int a,int b, int c, int d, int e, int f)// Or we can introduce a single method to do all the arithmetic operation
	{
		int g=((((a+b)+c)-d)*e/f);
		System.out.println("Final result by alternate way is  "+g);
	}
	public static void main(String[] args) {
		Assg2 js=new Assg2();
		int x= js.sum(10, 2);
		int y= js.sum(x, 2);
		int z= js.sub(y, 2);
		int k=js.multi(z, 2);
		js.div(k, 2);
		
		js.summ(10,2, 2, 2, 2, 2);
		
		
	}
}
