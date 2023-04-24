class WashingMachine   {
static boolean isPlugged;
static String name="Bosch";
static double price=50000.00;
static int minCapacity;
static int maxCapacity=6;
static int currentCapacity;
public static void main(String washingmachine[])
  {
System.out.println("main started");
onOrOff();
increaseCapacity();
increaseCapacity();
onOrOff();
decreaseCapacity();
decreaseCapacity();
onOrOff();
System.out.println("main ended");
  }
        public static boolean onOrOff() 
		{
        System.out.println("onOrOff method started");
        if(isPlugged==false)
		{
		isPlugged=true;
        System.out.println("washingmachine is turned on...");
        }
        else if(isPlugged==true)
 {
 isPlugged=false;
 System.out.println("WashingMachine is turned off....");
 }
 System.out.println("onOrOff method ended");
 return isPlugged;
        }
 public static int increaseCapacity(){
	System.out.println("increaseCapacity method started");
	 if(isPlugged==true){
	if(currentCapacity<maxCapacity){
		System.out.println("currentCapacity is less than maxCapacity proceed");
		
		currentCapacity=currentCapacity+1;
			System.out.println("the currentCapacity is"+currentCapacity);
	}
	 else{
		 System.out.println("max capacity reached...");
	 }
	 }
	 else{
		 System.out.println("user turn on the washingmachine");
	 }
	 
	System.out.println("increaseCapacity method ended");
	return currentCapacity;
 }	 
	 public static int decreaseCapacity(){
	System.out.println("decreaseCapacity method started");
	 if(isPlugged==true){
	if(currentCapacity>minCapacity){
		System.out.println("currentCapacity is less than minCapacity proceed");
		
		currentCapacity=currentCapacity+1;
			System.out.println("the currentCapacity is"+currentCapacity);
	}
	 else{
		 System.out.println("min capacity reached...");
	 } 
	 }
	 
	 else{
		 System.out.println("user turn on the WashingMachine");
	 }
	 
	System.out.println("decreaseCapacity method ended");
	return currentCapacity;
 }
}
 