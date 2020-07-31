package basic0731_1;

public class Singleton {

	private static Singleton s = new Singleton();

	private Singleton() { //외부에서 Singleton 생성자 호출할 수 없음

	}

	public static Singleton getInstance() { //외부에서 이 메서드 호출할 수 있음.
		if (s == null)
			s = new Singleton();
		return s;
	}

}
