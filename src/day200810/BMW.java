package day200810;

public interface BMW {
	public abstract void showInfo();
}

class BMW3 implements BMW{

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(" ����һ�� 3ϵ");
	}
	
}
class BMW5 implements BMW{

	@Override
	public void showInfo() {
		System.out.println(" ����һ�� 5ϵ");
	}
	
}
class BMW7 implements BMW{

	@Override
	public void showInfo() {
		System.out.println(" ����һ�� 7ϵ");
		
	}
	
}