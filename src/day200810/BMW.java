package day200810;

public interface BMW {
	public abstract void showInfo();
}

class BMW3 implements BMW{

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(" 这是一辆 3系");
	}
	
}
class BMW5 implements BMW{

	@Override
	public void showInfo() {
		System.out.println(" 这是一辆 5系");
	}
	
}
class BMW7 implements BMW{

	@Override
	public void showInfo() {
		System.out.println(" 这是一辆 7系");
		
	}
	
}