package poly;

public class ImpIAttatchable implements IAttachable {

	@Override
	public void driving() {

		System.out.println("������");
		
	}

	@Override
	public int sum() {
		return 75;
	}

	@Override
	public float sum(int a, int b) {
		return a+b;
	}

}
