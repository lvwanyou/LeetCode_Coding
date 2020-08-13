package day200806;

public class SingleTon {
	private volatile static SingleTon  instance = null;
	private SingleTon() {
		
	}
	public SingleTon getInstance() {
		if(instance == null) {
			synchronized (SingleTon.class) {
				if(instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
}

class SingleTon1{
	private SingleTon1() {
		
	}
	public SingleTon1 getInstance() {
		return Inner.instance;
	}
	private static class Inner{
		private static final SingleTon1 instance = new SingleTon1();
	}
}
