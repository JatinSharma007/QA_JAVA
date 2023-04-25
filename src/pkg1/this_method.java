package pkg1;

public class this_method
{
public void m1() {
	this.m2();
	System.out.println("method 1");
}
public void m2()
{
	this.m5();
	System.out.println("method 2");
	this.m4();
}
public void m3() {
	this.m1();
	System.out.println("method 3");
}
public void m4()
{
	System.out.println("method 4");
}
public void m5()
{
	System.out.println("method 5");
}
public static void main(String[] args) {
	this_method js=new this_method();
	js.m3();
}
}
