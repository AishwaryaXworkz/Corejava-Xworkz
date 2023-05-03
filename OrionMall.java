class OrionMall{
	static String shopNames[]={null, null, null, null, null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addShopName(String shopName){
		System.out.println("addShopName method started");
		boolean isAdded=false;
		if(shopName!=null && index<shopNames.length){
			shopNames[index++]=shopName;
			isAdded=true;
		}
		else{
		System.out.println("oops......maximum shopName");
		}
		System.out.println("addShopName method ended");
		return isAdded;
	}
	public static void getShopNames(){
		System.out.println("getShopName method started");
		System.out.println("List of  shopnames available are : ");
		for(int index=0;index<shopNames.length;index++){
			System.out.println(shopNames[index]);
			
		}
		
	}
	public static boolean updateShopName(String oldShopName ,String updatedShopName){
		System.out.println("updateShopName method started");
		System.out.println("updateShopName");
		boolean isUpdated=false;
		for(int index=0;index<shopNames.length;index++){
			if(shopNames[index].equals(oldShopName)){
			shopNames[index]=updatedShopName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateShopName method ended");
		return isUpdated;
	}
	public static String getShopName(String shopName)
	{
	for(int index=0;index<shopNames.length;index++)
	{
	if(shopNames[index].equals(shopName))
	{
	return shopNames[index];
	}
	}
	return "no shop Name found";
	}
}