class OttPlatform
{
static String[] englishSeries={"stranger things","wednesday","family man","anne","haunting","the office","hollywood","the boys","dexter","daredevil","narcos","homicide","foyle's war","line of duty","mr robot"};
static String[] hindiSeries={"Farzi","november story","breathe","aarya","malgudi days","rana naidu","ghoul","rudra","inside edge","aranyak","kaafir","grahan","aashram","candy","decoupled"};
static String[] tamilSeries={"vilangu","auto shankar","sathya","fingertip","navarasa","pubgoa","recce","triples","mugilan","story of things","queen","thiravam","vadham","postman","high"};
public static void main(String OttPlatform[]){
System.out.println("main started");
getEnglishSeries();
getHindiSeries();
getTamilSeries();
System.out.println("main ended");
}
public static void getEnglishSeries()
{
System.out.println("calling getEnglishSeries method ");
System.out.println("list of EnglishSeries:");
for(int i=0;i<englishSeries.length;i++)
{
System.out.println(englishSeries[i]);
}
System.out.println("end of getEnglishSeries method");
return;
} 
public static void getHindiSeries()
{
System.out.println("calling getHindiSeries method ");
System.out.println("list of HindiSeries:");
for(int i=0;i<hindiSeries.length;i++)
{
System.out.println(hindiSeries[i]);
}
System.out.println("end of getHindiSeries method");
return;
} 
public static void getTamilSeries()
{
System.out.println("calling getTamilSeries method ");
System.out.println("list of TamilSeries:");
for(int i=0;i<tamilSeries.length;i++)
{
System.out.println(tamilSeries[i]);
}
System.out.println("end of getTamilSeries method");
return;
} 
}