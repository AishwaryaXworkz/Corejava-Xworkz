class Garage
{
static String[] workersName={"Agarwal","Ganesh","Rohan","Sumith","sourav","Arijit","Sujith","Srikanth","Banerjee","sanjeev","karthik","Roy","Abhishek","Harshith","Abdul"};
public static void main(String garage[]){
System.out.println("list of Workers available:");
System.out.println("1:"+workersName[0] + "\n"+ "2:"+workersName[1] + "\n"+ "3:"+workersName[2] + "\n"+ "4:"+workersName[3] + "\n"+ "5:"+workersName[4] + "\n"+
                   "6:"+workersName[5] + "\n"+  "7:"+workersName[6] + "\n"+ "8:"+workersName[7] + "\n"+  "9:"+workersName[8] + "\n"+ "10:"+workersName[9] + "\n"+ 
				   "11:"+workersName[10] + "\n"+ "12:"+workersName[11] + "\n"+ "13:"+workersName[12] + "\n"+ "14:"+workersName[13] + "\n"+ "15:"+workersName[14]);
				 System.out.println("list of workers available using here:");
				 for(int index=0;index<=workersName.length-1;index++)
				  { 
			  System.out.println(workersName[index]); }					  
				   }
}