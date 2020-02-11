package lamdaexpression;

import java.util.Comparator;
import java.util.stream.Stream;

public class Max {
public static void main(String args[]) {
	Stream.of(-12,1,2,42,3,5).max(Comparator.comparing(i -> i))
	.ifPresent(maxInt->System.out.println("Maximum number in the set is " + maxInt));
}
}
