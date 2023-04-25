package pkg1;

public class Class3_1 {
	int a1, b1, c1, d1,e1;
	public Class3_1(int a, int b, int c, int d, int e) 
	{
		a1= a;
		b1= b;
		c1= c;
		d1= d;
		e1= e;
	}
	public static void main(String[] args) {
		Class3_1 rs=new Class3_1(1, 2, 2, 41, 41);
		System.out.println("value of a " +rs.a1);
		System.out.println("value of b  " +rs.b1);
		System.out.println("value of c " +rs.c1);
		System.out.println("value of d " +rs.d1);
		System.out.println("value of e " +rs.e1);
	}
	}
