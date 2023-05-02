class RestaurantTester{
	public static void main(String menu[]){
		Restaurant.addMenuName("soup");
        Restaurant.addMenuName("Salad & Papad");
		Restaurant.addMenuName("Chicken");
		Restaurant.addMenuName("chinese Veg Starter");
		Restaurant.addMenuName("Tandoori");
		Restaurant.addMenuName("Roll on");
		Restaurant.addMenuName("pizza");
		Restaurant.addMenuName("chat");
		Restaurant.addMenuName("desert");
		Restaurant.addMenuName("pasta");
		Restaurant.addMenuName("ice cream");
		Restaurant.addMenuName("sandwich");
		Restaurant.addMenuName("Roti");
		Restaurant.addMenuName("Rice");
		Restaurant.addMenuName("Noodles");
	    Restaurant.getMenuNames();
   Restaurant.updateMenuName("chat","paneer Hydrabadi");
   Restaurant.getMenuNames();
	}

}