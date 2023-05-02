class Theatre{
	static String movieNames[]={null, null, null, null, null,null,null,null,null,null};
	static int index;
	public static boolean addMovieName(String movieName){
		System.out.println("addMovieName method started");
		boolean isAdded=false;
		if(movieName!=null){
			movieNames[index++]=movieName;
			isAdded=true;
		}
		else{
		System.out.println("Enter valid movieName");
		}
		System.out.println("addMovieName method ended");
		return isAdded;
	}
	public static void getMovieNames(){
		System.out.println("getMovieName method started");
		System.out.println("List of  movie names available are : ");
		for(int index=0;index<movieNames.length;index++){
			System.out.println(movieNames[index]);
			
		}
		
	}
	public static boolean updateMovieName(String oldMovieName ,String updatedMovieName){
		System.out.println("updateMovieName method started");
			System.out.println("updateMovieName");
		boolean isUpdated=false;
		for(int index=0;index<movieNames.length;index++){
			if(movieNames[index].equals(oldMovieName)){
			movieNames[index]=updatedMovieName;
			isUpdated=true;	
			}	
		}
		System.out.println("updateMovieName method ended");
		return isUpdated;
	}
}