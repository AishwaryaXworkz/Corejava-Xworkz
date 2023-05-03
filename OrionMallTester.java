class OrionMallTester{
	public static void main(String shops[]){
	System.out.println("Main method started");
		OrionMall.addShopName("Nykaa");
        OrionMall.addShopName("Feeling perfume Bar");
		OrionMall.addShopName("Parcos");
		OrionMall.addShopName("Kama Ayurveda");
		OrionMall.addShopName("Celio");
		OrionMall.addShopName("Calvin Klein");
		OrionMall.addShopName("Fossil");
		OrionMall.addShopName("Art");
		OrionMall.addShopName("Footwear");
		OrionMall.addShopName("Gifts");
		OrionMall.addShopName("Fragrance");
		OrionMall.addShopName("Adidas");
		OrionMall.addShopName("Gopizza");
		OrionMall.addShopName("Domino's");
		OrionMall.addShopName("Empire");
		OrionMall.addShopName("GoHut");
		OrionMall.getShopNames();
	OrionMall.updateShopName("Art","Entertainment");
   OrionMall.getShopNames();
   String isPresent =OrionMall.getShopName("Gopizza");
		System.out.println("search shop :"+isPresent);
		System.out.println("Main method ended");
	}

}