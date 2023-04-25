package pkg1;

public class class2 {
	

	public int sum (int a, int b) {
		int c=a+b;
		System.out.println("Sum result is "+c);
		return c;	

}
	public int sub (int a1, int b1) 
	{
		int c1=a1-b1;
		System.out.println("Sum result is "+c1);
		return c1;
	}
	
	public void multi (int a2, int b2) {
		int c2=a2*b2;
		System.out.println("Sum result is "+c2);
	}
	public static void main(String[] args) {
		
	
	class2 js=new class2();
	int sumresult = js.sum(10, 2);
    int subresult = js.sub(10, 2);
    js.multi(sumresult, subresult);
	}
   
	}
   

	

