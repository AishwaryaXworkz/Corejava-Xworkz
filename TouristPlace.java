class TouristPlace
{
static String[] placeName={"Mysore","goa","dandeli","gokarna","udupi","malnad","tamilnadu","andra","dehli","malpe","mangalore","agra","ooty","manali","Rajasthan"};
public static void main(String touristPlace[]){
System.out.println("list of placeName are:");
System.out.println("1:"+placeName[0] + "\n"+ "2:"+placeName[1] + "\n"+ "3:"+placeName[2] + "\n"+ "4:"+placeName[3] + "\n"+ "5:"+placeName[4] + "\n"+
                   "6:"+placeName[5] + "\n"+  "7:"+placeName[6] + "\n"+ "8:"+placeName[7] + "\n"+  "9:"+placeName[8] + "\n"+ "10:"+placeName[9] + "\n"+ 
				   "11:"+placeName[10] + "\n"+ "12:"+placeName[11] + "\n"+ "13:"+placeName[12] + "\n"+ "14:"+placeName[13] + "\n"+ "15:"+placeName[14]);
				 System.out.println("list of placeName here:");
				 for(int index=0;index<=placeName.length-1;index++)
				  { 
			  System.out.println(placeName[index]); }					  
				   }
}