package basic0731_1;

public class Singleton {

	private static Singleton s = new Singleton();

	private Singleton() { //�ܺο��� Singleton ������ ȣ���� �� ����

	}

	public static Singleton getInstance() { //�ܺο��� �� �޼��� ȣ���� �� ����.
		if (s == null)
			s = new Singleton();
		return s;
	}

}
