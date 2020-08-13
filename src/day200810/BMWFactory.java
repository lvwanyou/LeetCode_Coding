package day200810;

public interface BMWFactory {
	BMW productBMW();
}
class BMW3Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		// TODO Auto-generated method stub
		System.out.println("������3ϵ");
		return new BMW3();
	}

}
class BMW5Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		System.out.println("������5ϵ");
		return new BMW5();
	}

}
class BMW7Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		System.out.println("������7ϵ");
		return new BMW7();
	}

}