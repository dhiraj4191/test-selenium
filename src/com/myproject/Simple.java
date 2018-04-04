package com.myproject;

class Simple{
	static int test2 = 1; //instance variable
	public static void main(String[] arg) {
		int a = 1;
		float b = a;
		float c = 1.0f;
		int d = (int)c;
		int e = 11 ;
		int f = 2;
		boolean g = true;
		boolean h = false;
		String test = ""; //local variable
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a--);	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(g && h);
		System.out.println(h || g);
		
		System.out.print(g || h?e:a);
	}
	
	public String test() {
		System.out.println(test2);
		return "abc";
	}
}