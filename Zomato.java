class Zomato{
  public static double searchItem(String itemName)
  {
  System.out.println("searchItem method started");
  double price=0.0;
 if("Masala Dose"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 150.00;
  }
   if("gobi"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 50.00;
  }
   if("French fries"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  price= 60.00;
  }
   if("veg biriyani"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 120.00;
  }
   if("idly"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 30.00;
  }
   if("pizza"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 230.00;
  }
   if("burger"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 250.00;
  } 
  if("samosa"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 10.00;
  }
   if("fried rice"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 350.00;
  }
   if("pani puri"==itemName)
  {
  System.out.println("thanks for selecting"+itemName);
  return 70.00;
  }
  
  System.out.println("searchItem method ended");
  return price;
  }
  }

  