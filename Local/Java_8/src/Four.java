import java.util.function.Consumer;

import jdk.jfr.Percentage;

public class Four {
	public static void main(String[] args) {
		Consumer<Integer>c=percentage->{
		if(percentage>95) {
			System.out.println("you will get a Job in 2026");
		}
		else {
			System.out.println("try again and again");
		}
		};
	
	c.accept(50);
}
}
