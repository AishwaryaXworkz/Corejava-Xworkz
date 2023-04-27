class AdditionTester
{
public static void main(String add[])
   {
  System.out.println("main started");
  System.out.println("addition of two numbers");
  System.out.println("addition of three numbers");
    int sumOfTwoNumbers=Addition.add(45,50);
    int sumOfThreeNumbers=Addition.add(90,40,20);
  System.out.println("addition of two numbers:"+sumOfTwoNumbers);
  System.out.println("addition of three numbers:"+sumOfThreeNumbers);
  System.out.println("main ended");
   }
}