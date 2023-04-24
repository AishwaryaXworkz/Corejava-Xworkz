class Hospital
{
static String[] doctorNames={"Agarwal","Ganesh","Rohan","Sumith","sourav","Arijit","Sujith","Srikanth","Banerjee","sanjeev","karthik","Roy","Abhishek","Harshith","Abdul"};
public static void main(String hospital[]){
System.out.println("main started");
getDoctorNames();
System.out.println("main ended");
}
public static void getDoctorNames()
{
System.out.println("calling getDoctorNames method ");
System.out.println("list of DoctorNames:");
for(int i=0;i<doctorNames.length;i++)
{
System.out.println(doctorNames[i]);
}
System.out.println("end of getDoctorNames method");
return;
} 
}