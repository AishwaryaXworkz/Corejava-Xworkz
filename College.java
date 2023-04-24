class College
{
static String[] departmentNames={"BCA","MCA","BBA","MBA","Business","Marketing","Sales","Bcom","Mcom","tourists"};
public static void main(String college[]){
System.out.println("main started");
getDepartmentNames();
System.out.println("main ended");
}
public static void getDepartmentNames()
{
System.out.println("calling getdepartmentNames method ");
System.out.println("list of departmentNames:");
for(int i=0;i<departmentNames.length;i++)
{
System.out.println(departmentNames[i]);
}
System.out.println("end of getdepartmentNames method");
return;
} 
}