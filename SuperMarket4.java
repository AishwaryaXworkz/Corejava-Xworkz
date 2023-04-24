class SuperMarket4
{
static String[] soaps={"dettol","mysore sandal","pears","godrej","savlon","santoor","nivea","boroplus","cinthol","yardley","himalaya","chandrika","medimix","lux","ayush"};
public static void main(String superMarket4[]){
System.out.println("main started");
getSoaps();
System.out.println("main ended");
}
public static void getSoaps()
{
System.out.println("calling getSoaps method ");
System.out.println("list of Soaps:");
for(int i=0;i<soaps.length;i++)
{
System.out.println(soaps[i]);
}
System.out.println("end of getSoaps method");
return;
} 
}