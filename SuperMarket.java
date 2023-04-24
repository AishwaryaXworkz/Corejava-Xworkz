class SuperMarket
{
static String[] groceries={"grains","bread","oil","fat","dairy","eggs","vegetables","fruits","seeds","nuts","condiments","honey","vinegar","sugar","cheese"};
public static void main(String superMarket[]){
System.out.println("main started");
getGroceries();
System.out.println("main ended");
}
public static void getGroceries()
{
System.out.println("calling getGroceries method ");
System.out.println("list Groceries:");
for(int i=0;i<groceries.length;i++)
{
System.out.println(groceries[i]);
}
System.out.println("end of getGroceries method");
return;
} 
}