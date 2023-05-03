class TheatreTester{
	public static void main(String movie[]){
	System.out.println("Main method started");
		Theatre.addMovieName("Googly");
		Theatre.addMovieName("KGF");
		Theatre.addMovieName("Ugramm");
		Theatre.addMovieName("RangiTaranga");
		Theatre.addMovieName("Kantara");
		Theatre.addMovieName("Vikrant rona");
		Theatre.addMovieName("777 charlie");
		Theatre.addMovieName("Love Mocktail");
		Theatre.addMovieName("Kirik party");
		Theatre.addMovieName("amurtha varshini");
		Theatre.addMovieName("vedha");
		Theatre.getMovieNames();
	Theatre.updateMovieName("Love Mocktail","Kranti");
    Theatre.getMovieNames();
	String isPresent =Theatre.getMovieName("777 charlie");
		System.out.println("search movie :"+isPresent);
		System.out.println("Main method ended");
	}

}