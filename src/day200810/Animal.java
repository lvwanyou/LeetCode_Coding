package day200810;

public abstract class Animal {
	public abstract void test();
	public abstract void move();
}

class Dog extends Animal{

	@Override
	public void test() {
		
	}

	@Override
	public void move() {
		System.out.println("�����ƶ���ʽ���ܣ�");		
	}
}

abstract class Fish extends Animal{
	public abstract void test();
	@Override
	public void move() {
		System.out.println("����ƶ��������Σ�");
	}	
}


class Test implements TestInf1, TestInf2{

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
