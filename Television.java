class Television  {
static boolean isConnectivityPort;
static String name="Samsung";
static String color="Black";
static double price=60000.00;
static int minVolume;
static int maxVolume=90;
static int currentVolume;
public static void main(String Television[])
  {
System.out.println("main started");
onOrOff();
increaseVolume();
increaseVolume();
onOrOff();
decreaseVolume();
decreaseVolume();
onOrOff();
System.out.println("main ended");
  }
        public static boolean onOrOff() 
		{
        System.out.println("onOrOff method started");
        if(isConnectivityPort==false)
		{
		isConnectivityPort=true;
        System.out.println("Television is turned on...");
        }
        else if(isConnectivityPort==true)
 {
 isConnectivityPort=false;
 System.out.println("Television is turned off....");
 }
 System.out.println("onOrOff method ended");
 return isConnectivityPort;
        }
 public static int increaseVolume(){
	System.out.println("increaseVolume method started");
	 if(isConnectivityPort==true){
	if(currentVolume<maxVolume){
		System.out.println("currentVolume is less than maxVolume proceed");
		
		currentVolume=currentVolume+1;
			System.out.println("the currentVolume is"+currentVolume);
	}
	 else{
		 System.out.println("max Volume reached...");
	 }
	 }
	 else{
		 System.out.println("user turn on the Television");
	 }
	 
	System.out.println("increaseVolume method ended");
	return currentVolume;
 }	 
	 public static int decreaseVolume(){
	System.out.println("decreaseVolume method started");
	 if(isConnectivityPort==true){
	if(currentVolume>minVolume){
		System.out.println("currentVolume is less than minVolume proceed");
		
		currentVolume=currentVolume+1;
			System.out.println("the currentVolume is"+currentVolume);
	}
	 else{
		 System.out.println("min Volume reached...");
	 } 
	 }
	 
	 else{
		 System.out.println("user turn on the Television");
	 }
	 
	System.out.println("decreaseVolume method ended");
	return currentVolume;
 }
}
 