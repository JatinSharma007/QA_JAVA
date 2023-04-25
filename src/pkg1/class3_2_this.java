package pkg1;

public class class3_2_this {

		public class3_2_this() 
		{
			this (1, 1, 1);
			System.out.println("Default Constructor");
		}
		public class3_2_this(int a) {
			this();
			System.out.println("One Parameterized Constructor");
		}
		public class3_2_this(int a, int b) {
			this(1, 2, 3, 4);
			System.out.println("Two Parameterized Constructor");
		}
		public class3_2_this(int a, int b, int c) {
			System.out.println("Three Parameterized Constructor");
		}
		public class3_2_this(int a, int b, int c, int d) {
			this (1);
			System.out.println("Four Parameterized Constructor");
		}
		public static void main(String[] args) {
			class3_2_this js=new class3_2_this(2, 3);//Here we give 0 input so it will show default constructor

		}



}
