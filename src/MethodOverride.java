

 class SwipeMachine {
void readCard() {
	System.out.println("readcard method for normal cards");
}
}

class ChipCardMachine extends SwipeMachine{
	void readCard() {
	System.out.println("chipcard method for swipemachine");	
	}
	
}
class MethodOverride {
public static void main(String args[]) {
	SwipeMachine normal=new SwipeMachine();
	normal.readCard();
	normal=new ChipCardMachine();
	normal.readCard();
}

}
