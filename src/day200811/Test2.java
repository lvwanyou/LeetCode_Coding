package day200811;

public class Test2 {
	public static void main(String[] args) {
		BB b = new BB();
		/*
		 * try { b.test(); } catch (Exception e) { System.out.println("我只是看看异常"); }
		 */
		try {
			b.test1(-100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class BB {
	int i;

	public void test() throws Exception {
		BB b = null;
		System.out.println(b);
	}

	public void test1(int age) throws Exception {
		if (age >= 0) {
			System.out.println("年龄为： " + age);
		} else {
			throw new Exception("年龄不能为负数");
		}
	}
}