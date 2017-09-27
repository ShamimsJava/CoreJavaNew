package exceptionHandling;

import java.io.IOException;

class M2{
	void method() throws IOException{
		System.out.println("device operation performed..");
	}
}

class ThrowsExample3{
	public static void main(String[] args) throws IOException{
		M2 m = new M2();
		m.method();
		
		System.out.println("normal flow....");
	}
}

