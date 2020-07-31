package basic0731_1;

public class SingletonTest {
	
	public static void main(String[] args) {
		
//		Singleton s1 = Singleton.getInstance();
		
		CaptionTv c = new CaptionTv();
		Tv t = new Tv();
		CaptionTv c1 = new CaptionTv();
		Tv t1 = new CaptionTv();
		CaptionTv c2 = (CaptionTv)new Tv();
		//암묵적/묵시적(implicit)
		//명시적(explicit)
		//upcasting 암묵적으로 자도으로 형변환됨
		//downcasting은 자동으로 형변환이 일어나지 않아 강제로(explicit) 형변환 해야함
		
	}

	
	
	
	
	
}
