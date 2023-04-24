class IceCream
{
static String[] brands={"ben&jerry's","haagen dazs","blue bunny","dreyer's","talenti","bluebell","magnum","tillamook","hershey","havmor","amul","perry's","tip top","vannilla","dessert"};
public static void main(String iceCream[]){
System.out.println("main started");
getBrands();
System.out.println("main ended");
}
public static void getBrands()
{
System.out.println("calling getBrands method ");
System.out.println("list of Brands:");
for(int i=0;i<brands.length;i++)
{
System.out.println(brands[i]);
}
System.out.println("end of getBrands method");
return;
} 
}