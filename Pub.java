class Pub
{
static String[] pubName={"ABC","skyye","toit","high ultra lounge","district","loft 38","fenny's","church street social","the biere club","guzzlers inn","pecos","13th floor","windmill craftworks","opus","love shack"};
public static void main(String pub[]){
System.out.println("main started");
getPubName();
System.out.println("main ended");
}
public static void getPubName()
{
System.out.println("calling getPubName method ");
System.out.println("list of PubName:");
for(int i=0;i<pubName.length;i++)
{
System.out.println(pubName[i]);
}
System.out.println("end of getPubName method");
return;
} 
}