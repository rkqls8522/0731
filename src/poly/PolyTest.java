package poly;

public class PolyTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(computer);
		b.summary();
		System.out.println();
		b.refund(computer);
		b.summary();
	}

}
