class SuperMarket5
{
static String[] brandsOfTshirts={"ekom","slowave","van heusen","allen solly","scott international","london hills","blive","eyebogler","leotude","us polo","chromozome","veirdo","dyrectdeals","swadesi stuff","tfortees"};
public static void main(String superMarket5[]){
System.out.println("main started");
getBrandsOfTshirts();
System.out.println("main ended");
}
public static void getBrandsOfTshirts()
{
System.out.println("calling getBrandsOfTshirts method ");
System.out.println("list of BrandsOfTshirts:");
for(int i=0;i<brandsOfTshirts.length;i++)
{
System.out.println(brandsOfTshirts[i]);
}
System.out.println("end of getBrandsOfTshirts method");
return;
} 
}