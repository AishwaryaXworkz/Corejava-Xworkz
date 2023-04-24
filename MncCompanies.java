class MncCompanies
{
static String[] companyNames={"Accenture","Amazon","Apple","IBM","TCS","Deloitte","Microsoft","Cognizant","Nestle","Google"};
public static void main(String companies[]){
System.out.println("list of Mnccompanies:");
System.out.println("1:"+companyNames[0] + "\n"+ "2:"+companyNames[1] + "\n"+ "3:"+companyNames[2] + "\n"+ "4:"+companyNames[3] + "\n"+ "5:"+companyNames[4] + "\n"+
                   "6:"+companyNames[5] + "\n"+  "7:"+companyNames[6] + "\n"+ "8:"+companyNames[7] + "\n"+  "9:"+companyNames[8] + "\n"+ "10:"+companyNames[9]);
				 System.out.println("list of MncCompanies are:");
				 for(int index=0;index<=companyNames.length-1;index++)
				  { 
			  System.out.println(companyNames[index]); }					  
				   }
}