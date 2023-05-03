class Library{
	static String bookNames[]={null, null, null, null, null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addBookName(String bookName){
		System.out.println("addBookName method started");
		boolean isAdded=false;
		if(bookName!=null && index<bookNames.length){
			bookNames[index++]=bookName;
			isAdded=true;
		}
		else{
		System.out.println("oops......maximum bookName");
		}
		System.out.println("addBookName method ended");
		return isAdded;
	}
	public static void getBookNames(){
		System.out.println("getBookName method started");
		System.out.println("List of  booknames available are : ");
		for(int index=0;index<bookNames.length;index++){
			System.out.println(bookNames[index]);
			
		}
		
	}
	public static boolean updateBookName(String oldBookName ,String updatedBookName){
		System.out.println("updateBookName method started");
		System.out.println("updateBookName");
		boolean isUpdated=false;
		for(int index=0;index<bookNames.length;index++){
			if(bookNames[index].equals(oldBookName)){
			bookNames[index]=updatedBookName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateBookName method ended");
		return isUpdated;
	}
	public static String getBookName(String bookName)
	{
	for(int index=0;index<bookNames.length;index++)
	{
	if(bookNames[index].equals(bookName))
	{
	return bookNames[index];
	}
	}
	return "no book Name found";
	}
}