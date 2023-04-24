class Temples
{
static String[] godNames={"ganesha","jesus","lakshmi","lord shiva","madesha","lord vishnu","venkateshwara","basaveshwara","mallikarjuna","kedarnath","vaidyanath","ramanathaswamy","ghrushneshwar","mahankal","nageshwara"};
public static void main(String temples[]){
System.out.println("main started");
getGodNames();
System.out.println("main ended");
}
public static void getGodNames()
{
System.out.println("calling getGodNames method ");
System.out.println("list of GodNames:");
for(int i=0;i<godNames.length;i++)
{
System.out.println(godNames[i]);
}
System.out.println("end of getGodNames method");
return;
} 
}