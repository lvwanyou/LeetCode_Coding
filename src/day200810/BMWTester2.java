package day200810;

public class BMWTester2 {
	public static void main(String[] args) {
		BMW b3 = new BMW3Factory().productBMW();
		b3.showInfo();
		BMW b5 = new BMW5Factory().productBMW();
		b5.showInfo();
		BMW b7 = new BMW7Factory().productBMW();
		b7.showInfo();
	}
}
