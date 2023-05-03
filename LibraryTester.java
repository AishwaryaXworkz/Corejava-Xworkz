class LibraryTester{
	public static void main(String booknames[]){
	    System.out.println("Main method started");
	    Library.addBookName("To kill a mockingbird");
		Library.addBookName("Jane Eyre");
		Library.addBookName("The catcher in the rye");
		Library.addBookName("The great gatsby");
		Library.addBookName("Nineteen Eightyfour");
		Library.addBookName("Anna Karenina");
		Library.addBookName("Ulysses");
		Library.addBookName("Beloved");
		Library.addBookName("Catch 22");
        Library.addBookName("The sun also rises");
		Library.addBookName("the lord of the rings");
		Library.addBookName("pride and prejudice");
		Library.addBookName("Don Quixote");
		Library.addBookName("lord of the files");
		Library.addBookName("the grapes of wrath");
		Library.addBookName("Story book");
		Library.getBookNames();
   Library.updateBookName("the lord of the rings","David copperfield");
   Library.getBookNames();
        String isPresent =Library.getBookName("Beloved");
		System.out.println("search book :"+isPresent);
		System.out.println("Main method ended");
	}

}