class SuperMarket1
{
static String[] chocolates={"Dairy milk","milky bar","hershey's","kisses","snickers","kitkat","dark chocolate","luvit","5 star","perk","shots","moments","hazelnut","almond treat","fabelle"};
public static void main(String superMarket1[]){
System.out.println("main started");
getChocolates();
System.out.println("main ended");
}
public static void getChocolates()
{
System.out.println("calling getChocolates method ");
System.out.println("list of Chocolates:");
for(int i=0;i<chocolates.length;i++)
{
System.out.println(chocolates[i]);
}
System.out.println("end of getChocolates method");
return;
} 
}