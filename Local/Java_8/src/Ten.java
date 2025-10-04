import java.util.List;
import java.util.function.Function;

public class Ten {
	public static void main(String[] args) {
	Function<List<String>, List<String>> l=Test::m1;
	                           //   Test()::m1;  if method is non static
	
	}

}
class Test{
	public static List<String>  m1(List<String>l){
		return l.stream().map(s->s.toUpperCase()).toList();
	}
}
