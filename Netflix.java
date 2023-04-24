class Netflix
{
static String kannadaMovies[]={"googly","KGF","mungaru male","yajammana","kranthi","kanthara","vedha","uppi","upendra","A"};
static String tamilMovies[]={"ps1","shivaji","enemy","singham","sir","vikram","pasha","sir","master"};
public static void main(String netflix[])
{
System.out.println("main started");
getKannadaMovies();
getTamilMovies();
System.out.println("main ended");
}
public static void getKannadaMovies()
{
System.out.println("calling getKannadaMovies method ");
System.out.println("list of Kannada Movies:");
for(int i=0;i<kannadaMovies.length;i++)
{
System.out.println(kannadaMovies[i]);
}
System.out.println("end of getKannadaMovies method");
return;
} 
public static void getTamilMovies()
{
System.out.println("calling getTamilMovies method ");
System.out.println("list of Tamil Movies:");
for(int i=0;i<tamilMovies.length;i++)
{
System.out.println(tamilMovies[i]);
}
System.out.println("end of getTamilMovies method");
return;
} 
}