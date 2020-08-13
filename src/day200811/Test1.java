package day200811;

public class Test1 {
	public static void main(String[] args) {
		A a = new A();
		a.testB();
		a.testC();
		
		int i = 0;
		try {
			System.out.println(3/i);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
class A{
	public void testB() {
		new InnerB().testB();
	}
	public void testC() {
		new  InnerC().testC();
	}
	
	private class InnerB extends B{
		@Override
		public void testB() {
			System.out.println("这是重写后的testB()");
		}
	}
	private class InnerC extends C{
		@Override
		public void testC() {
			System.out.println("这是重写后的testC()");
		}
	}
}

class B{
	public void testB() {
		
	}
}

class C{
	public void testC() {
		
	}
}