import java.time.LocalDate;
import java.util.function.Supplier;

public class Five {
	public static void main(String[] args) {
		Supplier<String>s=()->"todays date is"+" "+LocalDate.now();
		System.out.println(s.get());
}
}

