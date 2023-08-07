package Syncronisation;

public class SyncExample {
	public static void main(String[] args) {
		MathUtils obj = new MathUtils();
		
		Thread1 t1 = new Thread1(obj);
		Thread thread2 = new Thread(new Thread2(obj));
		t1.start();
		thread2.start();
	}
}
