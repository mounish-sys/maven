package lamdaexpression;

import java.util.function.BiPredicate;

@FunctionalInterface
interface usepass{
	boolean unpd(String un,String pwd);
}
public class UsernamePeassword {
public static void main(String args[]) {
	BiPredicate<String, String> predicate = (un, pwd) -> (pwd.equals(un.toUpperCase()));
	System.out.println(predicate.test("mounish", "MOUNISH"));
}
}
