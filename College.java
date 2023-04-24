class College
{
static String[] departmentNames={"BCA","MCA","BBA","MBA","Business","Marketing","Sales","Bcom","Mcom","tourists"};
public static void main(String college[]){
System.out.println("list of colleges:");
System.out.println("1:"+departmentNames[0] + "\n"+ "2:"+departmentNames[1] + "\n"+ "3:"+departmentNames[2] + "\n"+ "4:"+departmentNames[3] + "\n"+ "5:"+departmentNames[4] + "\n"+
                   "6:"+departmentNames[5] + "\n"+  "7:"+departmentNames[6] + "\n"+ "8:"+departmentNames[7] + "\n"+  "9:"+departmentNames[8] + "\n"+ "10:"+departmentNames[9]);
				 System.out.println("list of departments are:");
				 for(int index=0;index<=departmentNames.length-1;index++)
				  { 
			  System.out.println(departmentNames[index]); }					  
				   }
}