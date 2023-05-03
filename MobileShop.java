class MobileShop{
	static String mobileNames[]={null, null, null, null, null,null,null,null,null,null};
	static int index;
	public static boolean addMobileName(String mobileName){
		System.out.println("addMobileName method started");
		boolean isAdded=false;
		if(mobileName!=null && index<mobileNames.length ){
			mobileNames[index++]=mobileName;
			isAdded=true;
		}
		else{
		System.out.println("oops......maximum mobileName");
		}
		System.out.println("addMobileName method ended");
		return isAdded;
	}
	public static void getMobileNames(){
		System.out.println("getMobileName method started");
		System.out.println("List of  mobile names available are : ");
		for(int index=0;index<mobileNames.length;index++){
			System.out.println(mobileNames[index]);
			
		}
		
	}
	public static boolean updateMobileName(String oldMobileName ,String updatedMobileName){
		System.out.println("updateMobileName method started");
			System.out.println("updateMobileName");
		boolean isUpdated=false;
		for(int index=0;index<mobileNames.length;index++){
			if(mobileNames[index].equals(oldMobileName)){
			mobileNames[index]=updatedMobileName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMobileName method ended");
		return isUpdated;
	}
	public static String getMobileName(String mobileName)
	{
	for(int index=0;index<mobileNames.length;index++)
	{
	if(mobileNames[index].equals(mobileName))
	{
	return mobileNames[index];
	}
	}
	return "no mobile Name found";
	}
}