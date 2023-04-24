class SuperMarket3
{
static String[] perfumes ={"tupil","secret","fogg","wild stone","magnet","wow","signature","engage","cobra","me","yardley","axe","jasmine","villain","premium"};
public static void main(String superMarket3[]){
System.out.println("main started");
getPerfumes();
System.out.println("main ended");
}
public static void getPerfumes()
{
System.out.println("calling getPerfumes method ");
System.out.println("list of Perfumes:");
for(int i=0;i<perfumes.length;i++)
{
System.out.println(perfumes[i]);
}
System.out.println("end of getPerfumes method");
return;
} 
}