public abstract class Food{
	public static void main (String args[]) {
	Food f=new FoodSub();
	f.PrepareToEat();
	f.consume()	;
	f.taste();
	}	
public static final String whom="iam eatable";
	
public Food() {
	

System.out.println("food");

}
public abstract String consume();
public abstract String taste();

protected void PrepareToEat() {
	wash();
	System.out.println("wash ur hands");
}
private void wash() {
	System.out.println("washed ur hands??");
}

}
 class FoodSub extends Food{

	@Override
	public String consume() {
		System.out.println("is consumable");
		return null;
	}

	@Override
	public String taste() {
		System.out.println("is tasty");
		
		return null;
	}
	
}