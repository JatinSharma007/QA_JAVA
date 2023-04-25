package pkg1;

public class Class3_constructor {
	public Class3_constructor() {
		System.out.println("Default Constructor");
	}
	public Class3_constructor(int a) {
		System.out.println("One Parameterized Constructor");
	}
	public Class3_constructor(int a, int b) {
		System.out.println("Two Parameterized Constructor");
	}
	public Class3_constructor(int a, int b, int c) {
		System.out.println("Three Parameterized Constructor");
	}
	public Class3_constructor(int a, int b, int c, int d) {
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		Class3_constructor js=new Class3_constructor();//Here we give 0 input so it will show default constructor
		Class3_constructor rs=new Class3_constructor(1);//Here we change reference variable to call 2 constructor or we can change input value to call other constructor too.
	}

}
