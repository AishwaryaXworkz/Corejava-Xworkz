class TouristPlace
{
static String[] placeName={"Mysore","goa","dandeli","gokarna","udupi","malnad","tamilnadu","andra","dehli","malpe","mangalore","agra","ooty","manali","Rajasthan"};
public static void main(String touristPlace[]){
System.out.println("main started");
getPlaceName();
System.out.println("main ended");
}
public static void getPlaceName()
{
System.out.println("calling getPlaceName method ");
System.out.println("list of PlaceName:");
for(int i=0;i<placeName.length;i++)
{
System.out.println(placeName[i]);
}
System.out.println("end of getPlaceName method");
return;
} 
}