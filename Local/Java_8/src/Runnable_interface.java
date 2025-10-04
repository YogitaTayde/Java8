
public class Runnable_interface {
	public static void main(String[] args) {
	new Thread(()->Thread.currentThread().getName()).start();
	System.out.println(Thread.currentThread().getName());
	 }
	
	}
