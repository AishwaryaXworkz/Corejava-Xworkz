class Speaker   {
static boolean isConnected;
static String name="Noise";
static double price=4000.00;
static int minVolume;
static int maxVolume=8;
static int currentVolume;
public static void main(String speaker[])
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
        public static boolean onOrOff() {
System.out.println("onOrOff method started");
 if(isConnected==false){
 isConnected=true;
 System.out.println("speaker is turned on...");
 }
 else if(isConnected==true)
 {
 isConnected=false;
 System.out.println("speaker is turned off....");
 }
 System.out.println("onOrOff method ended");
 return isConnected;
 }
 public static int increaseVolume(){
	System.out.println("increaseVolume method started");
	 if(isConnected==true){
	if(currentVolume<maxVolume){
		System.out.println("currentVolume is less than maxVolume proceed");
		
		currentVolume=currentVolume+1;
			System.out.println("the currentVolume is"+currentVolume);
	}
	 else{
		 System.out.println("max volume reached...");
	 }
	 }
	 else{
		 System.out.println("user turn on the speaker");
	 }
	 
	System.out.println("increaseVolume method ended");
	return currentVolume;
 }	 
	 public static int decreaseVolume(){
	System.out.println("decreaseVolume method started");
	 if(isConnected==true){
	if(currentVolume>minVolume){
		System.out.println("currentVolume is less than minVolume proceed");
		
		currentVolume=currentVolume+1;
			System.out.println("the currentVolume is"+currentVolume);
	}
	 else{
		 System.out.println("min volume reached...");
	 } 
	 }
	 
	 else{
		 System.out.println("user turn on the speaker");
	 }
	 
	System.out.println("decreaseVolume method ended");
	return currentVolume;
 }
}
 