class Garage
{
static String[] workersName={"Agarwal","Ganesh","Rohan","Sumith","sourav","Arijit","Sujith","Srikanth","Banerjee","sanjeev","karthik","Roy","Abhishek","Harshith","Abdul"};
public static void main(String garage[]){
System.out.println("main started");
getWorkersName();
System.out.println("main ended");
}
public static void getWorkersName()
{
System.out.println("calling getWorkersName method ");
System.out.println("list of WorkersName:");
for(int i=0;i<workersName.length;i++)
{
System.out.println(workersName[i]);
}
System.out.println("end of getWorkersName method");
return;
} 
}