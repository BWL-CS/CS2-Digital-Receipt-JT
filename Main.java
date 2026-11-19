import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

          double drinkPrice = 1.50;
            double candyPrice = 1.25;
          double hotDogPrice = 2.75;
          double hamburgerPrice = 3.50;

  int orderNumber;
  int drinkQuantity, candyQuantity, hotDogQuantity, hamburgerQuantity;
  double salesTaxRate = 0.08875;
  double orderSubtotal, taxAmount, grandTotal;

     System.out.print("How many drinks? ");
     drinkQuantity = Integer.parseInt(input.nextLine());
     System.out.print("How many candies? ");
     candyQuantity = Integer.parseInt(input.nextLine());
     System.out.print("How many hot dogs? ");
   hotDogQuantity = Integer.parseInt(input.nextLine());
     System.out.print("How many hamburgers? ");
     hamburgerQuantity = Integer.parseInt(input.nextLine());

        System.out.print("Enter your full high school name: ");
        String highSchoolName = input.nextLine();

        String schoolInitials = highSchoolName.substring(0, 1);
        String remainingWords = highSchoolName.substring(highSchoolName.indexOf(" ") + 1);
        schoolInitials = schoolInitials + remainingWords.substring(0, 1);
         remainingWords = remainingWords.substring(remainingWords.indexOf(" ") + 1);
        schoolInitials = schoolInitials + remainingWords.substring(0, 1);

orderNumber = (int)(Math.random() * 100 + 1);

            double drinkCost = drinkQuantity * drinkPrice;
            double candyCost = candyQuantity * candyPrice;
            double hotDogCost = hotDogQuantity * hotDogPrice;
            double hamburgerCost = hamburgerQuantity * hamburgerPrice;

   orderSubtotal = drinkCost + candyCost + hotDogCost + hamburgerCost;
   taxAmount = orderSubtotal * salesTaxRate;
     grandTotal = orderSubtotal + taxAmount;


       System.out.println("**************************************");
       System.out.println("*                                    *");
       System.out.println("*      " + schoolInitials + " Snack Bar");
       System.out.println("*      Order #" + orderNumber);
       System.out.println("*                                   *");
       System.out.println("*  " + drinkQuantity + "\tDrink\t\t$" + drinkCost + "           *");
      System.out.println("*  " + candyQuantity + "\tCandy\t\t$" + candyCost + "               *");
       System.out.println("*  " + hotDogQuantity + "\tHot Dog\t\t$" + hotDogCost + "              *");
       System.out.println("*  " + hamburgerQuantity + "\tHamburger\t$" + hamburgerCost + "          *");
       System.out.println("*                                    *");
       System.out.println("*  Subtotal:\t\t$" + orderSubtotal);
       System.out.println("*  Tax:\t\t\t$" + taxAmount);
       System.out.println("*  Total:\t\t$" + grandTotal);
       System.out.println("*                                    *");
       System.out.println("*************************************");

     input.close();
  }
}

 