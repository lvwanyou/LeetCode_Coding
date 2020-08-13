package day200810;

public interface BMWFactory {
	BMW productBMW();
}
class BMW3Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		// TODO Auto-generated method stub
		System.out.println("生成了3系");
		return new BMW3();
	}

}
class BMW5Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		System.out.println("生成了5系");
		return new BMW5();
	}

}
class BMW7Factory implements BMWFactory {

	@Override
	public BMW productBMW() {
		System.out.println("生成了7系");
		return new BMW7();
	}

}