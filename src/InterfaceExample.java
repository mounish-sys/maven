interface Bank{  
float rateOfInterest();  
static void emi() {
	System.out.println("emi is static");
}
default void tenure() {
	System.out.println("tenure is common");
}
}  
class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  

}  
class PNB implements Bank{  
public float rateOfInterest(){return 9.7f;}  
}  
class InterfaceExample{  
public static void main(String[] args){  
Bank b=new SBI();  
Bank p=new PNB();
System.out.println("ROI: "+b.rateOfInterest());  
System.out.println("POI: "+p.rateOfInterest());  
Bank.emi();
p.tenure();
}
}  