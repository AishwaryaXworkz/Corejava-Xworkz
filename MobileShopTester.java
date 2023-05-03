class MobileShopTester{
	public static void main(String movie[]){
	System.out.println("Main method started");
		MobileShop.addMobileName("Vivo");
        MobileShop.addMobileName("Samsung");
		MobileShop.addMobileName("oppo");
		MobileShop.addMobileName("Mi 10i");
		MobileShop.addMobileName("1 plus");
		MobileShop.addMobileName("iphone");
		MobileShop.addMobileName("Lava");
		MobileShop.addMobileName("Nokia");
		MobileShop.addMobileName("Realme");
		MobileShop.addMobileName("karbonn");
		MobileShop.addMobileName("iphone 14pro");
		MobileShop.getMobileNames();
	MobileShop.updateMobileName("Lava","Honor");
    MobileShop.getMobileNames();
	 String isPresent =MobileShop.getMobileName("Samsung A33");
		System.out.println("search mobile :"+isPresent);
		System.out.println("Main method ended");
	}

}