package JavaPractice;

public class Apple implements Fruits{

	Apple(){
		m1();
		m2();
	}
	
	@Override
	public void m1() {
		System.out.println("The color of the fruit is "+color);
		
	}

	@Override
	public void m2() {
		System.out.println("The cost of the fruit is "+cost);
		
	}

	
	public static void main(String[] args) {
//		Fruits f1 = new Apple();
		Apple f1 = new Apple();
//		f1.m1();
//		f1.m2();
	}
}
