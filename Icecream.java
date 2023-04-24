class IceCream
{
static String[] brands={"ben&jerry's","haagen dazs","blue bunny","dreyer's","talenti","bluebell","magnum","tillamook","hershey","havmor","amul","perry's","tip top","vannilla","dessert"};
public static void main(String iceCream[]){
System.out.println("list of Icecream are:");
System.out.println("1:"+brands[0] + "\n"+ "2:"+brands[1] + "\n"+ "3:"+brands[2] + "\n"+ "4:"+brands[3] + "\n"+ "5:"+brands[4] + "\n"+
                   "6:"+brands[5] + "\n"+  "7:"+brands[6] + "\n"+ "8:"+brands[7] + "\n"+  "9:"+brands[8] + "\n"+ "10:"+brands[9] + "\n"+ 
				   "11:"+brands[10] + "\n"+ "12:"+brands[11] + "\n"+ "13:"+brands[12] + "\n"+ "14:"+brands[13] + "\n"+ "15:"+brands[14]);
				 System.out.println("list of icecreambrands here:");
				 for(int index=0;index<=brands.length-1;index++)
				  { 
			  System.out.println(brands[index]); }					  
				   }
}