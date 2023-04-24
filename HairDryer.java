class HairDryer  {
static boolean isHandled;
static String name="Philips";
static String color="pink";
static int price=800;
static int minSpeed;
static int maxSpeed=2;
static int currentSpeed;
public static void main(String HairDryer[])
  {
System.out.println("main started");
onOrOff();
increaseSpeed();
increaseSpeed();
onOrOff();
decreaseSpeed();
decreaseSpeed();
decreaseSpeed();
onOrOff();
System.out.println("main ended");
  }
        public static boolean onOrOff() {
System.out.println("onOrOff method started");
 if(isHandled==false){
 isHandled=true;
 System.out.println("HairDryer is turned on...");
 }
 else if(isHandled==true)
 {
 isHandled=false;
 System.out.println("HairDryer is turned off....");
 }
 System.out.println("onOrOff method ended");
 return isHandled;
 }
 public static int increaseSpeed(){
	System.out.println("increaseSpeed method started");
	 if(isHandled==true){
	if(currentSpeed<maxSpeed){
		System.out.println("currentSpeed is less than maxSpeed proceed");
		
		currentSpeed=currentSpeed+1;
			System.out.println("the currentSpeed is"+currentSpeed);
	}
	 else{
		 System.out.println("max Speed reached...");
	 }
	 }
	 else{
		 System.out.println("user turn on the HairDryer");
	 }
	 
	System.out.println("increaseSpeed method ended");
	return currentSpeed;
 }	 
	 public static int decreaseSpeed(){
	System.out.println("decreaseSpeed method started");
	 if(isHandled==true){
	if(currentSpeed>minSpeed){
		System.out.println("currentSpeed is less than minSpeed proceed");
		
		currentSpeed=currentSpeed+1;
			System.out.println("the currentSpeed is"+currentSpeed);
	}
	 else{
		 System.out.println("min Speed reached...");
	 } 
	 }
	 
	 else{
		 System.out.println("user turn on the HairDryer");
	 }
	 
	System.out.println("decreaseSpeed method ended");
	return currentSpeed;
 }
}
 