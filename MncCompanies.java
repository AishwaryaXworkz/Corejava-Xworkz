class MncCompanies
{
static String[] companyNames={"Accenture","Amazon","Apple","IBM","TCS","Deloitte","Microsoft","Cognizant","Nestle","Google"};
public static void main(String companies[]){
System.out.println("main started");
getCompanyNames();
System.out.println("main ended");
}
public static void getCompanyNames()
{
System.out.println("calling getCompanyNames method ");
System.out.println("list of CompanyNames:");
for(int i=0;i<companyNames.length;i++)
{
System.out.println(companyNames[i]);
}
System.out.println("end of getCompanyNames method");
return;
} 
}