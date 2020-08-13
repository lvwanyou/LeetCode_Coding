package day200811;

public class Test {
	int i;
	int z;
	int k;
	
	class A{
		public void setTestFields() {
			i = 1;
		}
		
	}
	public void setInfo() {
		new A().setTestFields();
	}
	public void showInfo() {
		System.out.println(this.i);
		System.out.println(this.k);
		System.out.println(this.z);
	}
	public static void main(String[] args) {
		Test  t = new Test();
		t.setInfo();
		t.showInfo();
	}
}
