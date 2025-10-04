import java.util.function.Predicate;

public class Third_26_9 {
	public static void main(String[] args) {
		Predicate<Integer>p=percentage->percentage>35;
		System.out.println(p.test(67));
		Predicate<String>p1=name-> name=="john";
		System.out.println(p1.test("john"));
	}
}



