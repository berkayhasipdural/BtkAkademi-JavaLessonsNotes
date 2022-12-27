package threadingDemo1;

public class Main {

	public static void main(String[] args) {
		KronometreThread thread1 = new KronometreThread("thread1");
		thread1.start();
		KronometreThread thread2 = new KronometreThread("thread3");
		thread2.start();
		KronometreThread thread3 = new KronometreThread("thread3");
		thread3.start();
		
	}

}
