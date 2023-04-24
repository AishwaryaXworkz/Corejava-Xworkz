class SuperMarket2
{
static String[] shampoos ={"head&shoulder","wow","himalaya","loreal","dove","sunsilk","beer","biotique","nyle","plum","vatika","clinic plus","chik","clear","tresemme"};
public static void main(String superMarket2[]){
System.out.println("main started");
getShampoos();
System.out.println("main ended");
}
public static void getShampoos()
{
System.out.println("calling getShampoos method ");
System.out.println("list of Shampoos:");
for(int i=0;i<shampoos.length;i++)
{
System.out.println(shampoos[i]);
}
System.out.println("end of getShampoos method");
return;
} 
}