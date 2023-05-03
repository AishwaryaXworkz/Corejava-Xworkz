class Restaurant1{
	static String menuNames[]={null, null, null, null, null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addMenuName(String menuName){
		System.out.println("addMenuName method started");
		boolean isAdded=false;
		if(menuName!=null && index<menuNames.length ){
			menuNames[index++]=menuName;
			isAdded=true;
		}
		else{
		System.out.println("Enter valid menuName");
		System.out.println("oops......maximum menuName");
		}
		System.out.println("addMenuName method ended");
		return isAdded;
	}
	public static void getMenuNames(){
		System.out.println("getMenuName method started");
		System.out.println("List of  menu names available are : ");
		for(int index=0;index<menuNames.length;index++){
			System.out.println(menuNames[index]);
			
		}
		
	}
	public static boolean updateMenuName(String oldMenuName ,String updatedMenuName){
		System.out.println("updateMenuName method started");
		System.out.println("updateMenuName");
		boolean isUpdated=false;
		for(int index=0;index<menuNames.length;index++){
			if(menuNames[index].equals(oldMenuName)){
			menuNames[index]=updatedMenuName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMenuName method ended");
		return isUpdated;
	}
	public static String getMenuName(String menuName)
	{
	for(int index=0;index<menuNames.length;index++)
	{
	if(menuNames[index].equals(menuName))
	{
	return menuNames[index];
	}
	}
	return "no menu Name found";
	}
}