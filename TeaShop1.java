class TeaShop1
{
static String teaNames[]={null,null,null,null,null};
static int index;
public static boolean addTeaName(String teaName)
 {
System.out.println("method started");
boolean isAdded=false;
if(teaName!=null){
teaNames[index++]=teaName;
System.out.println("tea added");
isAdded=true;
}
else{
System.out.println("the tea is not found");
} 
System.out.println("method ended");
return isAdded;
 }

public static void getTeaNames()
{
	System.out.println("teaName started");
	System.out.println("list of tea names available are:");
	for(int ind=0;ind<teaNames.length;ind++)
	{
		System.out.println(teaNames[ind]);
}
}
public static boolean updateTeaName(String oldTeaName , String updatedTeaName)
{
	System.out.println("updatedTeaName method started");
	System.out.println("updateTeaName added");
	boolean isupdated=false;
	for(int ind=0;ind<teaNames.length;ind++)
	{
		if(teaNames[ind].equals(oldTeaName))
		{
			teaNames[ind]=updatedTeaName;
			isupdated=true;
		}
	}
	System.out.println("updatedTeaName method ended");
	return isupdated;
}
}