import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hitung:" + counter.getCount());
		
		counter.increase();
		
		System.out.println("Hitung:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hitung:" + counter.getCount());
		
	}

}
