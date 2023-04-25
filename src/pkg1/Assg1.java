package pkg1;

public class Assg1 {
	int age;
	int roll_no;
	public void method ()
	{
		System.out.println("welcome to all of you");
	}public void method1() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Assg1 js=new Assg1();
		js.age=16;
		js.roll_no=93;
		System.out.println("Age is  "+js.age);
		System.out.println("Roll no. is "+js.roll_no);
		js.method();
		js.method1();
	}

}
