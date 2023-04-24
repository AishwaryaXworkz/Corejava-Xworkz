class Fan  {
static boolean isSwitched;
static String name="Bajaj";
static String color="White";
static int price=8000;
static int minSpeed;
static int maxSpeed=65;
static int currentSpeed;
public static void main(String Fan[])
  {
System.out.println("main started");
onOrOff();
increaseSpeed();
increaseSpeed();
onOrOff();
decreaseSpeed();
decreaseSpeed();
onOrOff();
System.out.println("main ended");
  }
        public static boolean onOrOff() 
		{
        System.out.println("onOrOff method started");
        if(isSwitched==false)
		{
		isSwitched=true;
        System.out.println("fan is turned on...");
        }
        else if(isSwitched==true)
 {
 isSwitched=false;
 System.out.println("fan is turned off....");
 }
 System.out.println("onOrOff method ended");
 return isSwitched;
        }
 public static int increaseSpeed(){
	System.out.println("increaseSpeed method started");
	 if(isSwitched==true){
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
		 System.out.println("user turn on the Fan");
	 }
	 
	System.out.println("increaseSpeed method ended");
	return currentSpeed;
 }	 
	 public static int decreaseSpeed(){
	System.out.println("decreaseSpeed method started");
	 if(isSwitched==true){
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
		 System.out.println("user turn on the Fan");
	 }
	 
	System.out.println("decreaseSpeed method ended");
	return currentSpeed;
 }
}
 