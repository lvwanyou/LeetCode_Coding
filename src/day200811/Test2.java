package day200811;

public class Test2 {
	public static void main(String[] args) {
		BB b = new BB();
		/*
		 * try { b.test(); } catch (Exception e) { System.out.println("��ֻ�ǿ����쳣"); }
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
			System.out.println("����Ϊ�� " + age);
		} else {
			throw new Exception("���䲻��Ϊ����");
		}
	}
}