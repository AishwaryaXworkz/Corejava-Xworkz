class TeaShopTester1{
public static void main(String tea[])
{
System.out.println("Main method started");
TeaShop1.addTeaName("black tea");
TeaShop1.addTeaName("normal tea");
TeaShop1.addTeaName("lemon tea");
TeaShop1.addTeaName("masala tea");
TeaShop1.addTeaName("chocolate tea");
TeaShop1.addTeaName("green tea");
TeaShop1.getTeaNames();
TeaShop1.updateTeaName("normal tea" , "ginger tea");
TeaShop1.getTeaNames();
        String isPresent =TeaShop1.getTeaName("black tea");
		System.out.println("search tea :"+isPresent);
		System.out.println("Main method ended");
}
}