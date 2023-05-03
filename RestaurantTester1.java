class RestaurantTester1{
	public static void main(String menu[]){
		System.out.println("Main method started");
		Restaurant1.getMenuNames();
		Restaurant1.addMenuName("soup"); 
        Restaurant1.addMenuName("Salad & Papad");
		Restaurant1.addMenuName("Chicken");
		Restaurant1.addMenuName("chinese Veg Starter");
		Restaurant1.addMenuName("Tandoori");
		Restaurant1.addMenuName("Roll on");
		Restaurant1.addMenuName("pizza");
		Restaurant1.addMenuName("chat");
		Restaurant1.addMenuName("desert");
		Restaurant1.addMenuName("pasta");
		Restaurant1.addMenuName("ice cream");
		Restaurant1.addMenuName("sandwich");
		Restaurant1.addMenuName("Roti");
		Restaurant1.addMenuName("Rice");
		Restaurant1.addMenuName("Noodles");
		Restaurant1.addMenuName("panipuri");
	    Restaurant1.getMenuNames();
		Restaurant1.updateMenuName("chat","paneer Hydrabadi");
        Restaurant1.getMenuNames();
        String isPresent =Restaurant1.getMenuName("sandwich");
		System.out.println("search item :"+isPresent);
		System.out.println("Main method ended");
	}

}