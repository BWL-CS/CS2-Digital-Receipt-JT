import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     ReceiptPartA.main(args);
     ReceiptPartB.main(args);
     ReceiptPartC.main(Args);
     ReceiptPartD.main(args);
  }
}


//part a
class ReceiptPartA {
  public static void main(String[] args) {
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     High School Snack Bar          *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$1.50          *");
     System.out.println("*     Candy ..........$1.25          *";
     System.out.println("*     Hot Dog ........$2.75          *");
     System.out.println("*     Hamburger ......$3.50          *");
     System.out.println("*                                    *");
     System.out.println("**************************************");
  }
}



// Part B -- variables
class ReceiptPartB {
  public static void main(String[] args) {
     String highSchoolName = "BWL";
     double drinkPrice = 1.50; //prices
     double candyPrice = 1.25;
     double hotDogPrice = 2.75
     double hamburgerPrice = 3.50;

     //print
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*     " + highSchoolName + " Snack Bar");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice);
     System.out.println("*     Candy ..........$" + candyPrice);
     System.out.println("*     Hot Dog ........$" + hotDogPrice);
     System.out.println("*     Hamburger ......$" + hamburgerPrice);
     System.out.println("*                                    *");
     System.out.println("**************************************");
  }
}

//PART C
class ReceiptPartC {
  public static void main(String[] args) {
     String highSchoolName = "BWL";
     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotDogPrice = 2.75;
     double hamburgerPrice = 3.50;

     int orderNumber;
     int drinkQuantity, candyQuantity, hotDogQuantity, hamburgerQuantity;
     double salesTaxRate = 0.8875;
     double orderSubtotal, taxAmount, grandTotal;

     // random stuff
     orderNumber = (int)(Math.random() * 100) + 1;
     drinkQuantity = (int)(Math.random() * 3);
     candyQuantity = (int)Math.random() * 3;
     hotDogQuantity = (int)(Math.random() * 3);
     hamburgerQuantity = (int)(Math.random() * 3);

     //calculate costs
     double drinkCost = drinkQuantity * drinkPrice;
     double candyCost = candyQuantity * candyPrice;
     double hotDogCost = hotDogQuantity * hamburgerPrice;
     double hamburgerCost = hamburgerQuantity * hamburgerPrice;

     orderSubtotal = drinkCost + candyCost + hotDogCost + hamburgerCost;
     taxAmount = orderSubtotal * salesTaxRate;
     grandTotal = orderSubtotal + taxAmount;

     // TRUNCATE
     taxAmount = (int)(taxAmount * 100) / 100.0;
     grandTotal = (int)(grandTotal * 100) / 100.0;

     System.out.println("**************************************");
     System.out.println("*     " + highSchoolName + " Snack Bar");
     System.out.println("*     Order #" + orderNumber);
     System.out.println("*");
     System.out.println("*  " + drinkQuantity + "\tDrink\t\t$" + drinkCost);
     System.out.println("*  " + candyQuantity + "\tCandy\t\t$" + candyCost);
     System.out.println("*  " + hotDogQuantity + "\tHot Dog\t\t$" + hotDogCost);
     System.out.println("*  " + hamburgerQuantity + "\tHamburger\t$" + hamburgerCost);
     System.out.println("*");
     System.out.println("*  Subtotal:\t\t$" + orderSubtotal);
     System.out.println("*  Tax:\t\t\t$" + taxAmount);
     System.out.println("*  Total:\t\t$" + grandTotal);
     System.out.println("**************************************");
  }
}


// Part D: user input + initials
class ReceiptPartD {
  public static void main(String[] args) {
     Scanner keyboardInput = new Scanner(System.in);

     double drinkPrice = 1.50;
     double candyPrice = 1.25;
     double hotDogPrice = 2.75;
     double hamburgerPrice = 3.50;

     int orderNumber;
     int drinkQuantity, candyQuantity, hotDogQuantity, hamburgerQuantity;
     double salesTaxRate = 0.08875;
     double orderSubtotal, taxAmount, grandTotal;

     //ask user
     System.out.print("How many drinks? ");
     drinkQuantity = Integer.parseInt(keyboardInput.nextLine());
     System.out.print("How many candies? ");
     int candyQuantity = Integer.parseInt(keyboardInput.nextLine());
     System.out.print("How many hot dogs? ");
     hotDogQuantity = Integer.parseInt(keyboardInput.nextLine());
     System.out.print("How many hamburgers? ");
     hamburgerQuantity = Integer.parseInt(keyboardInput.nextLine());

     System.out.print("Enter your full high school name: ");
     String highSchoolName = keyboardInput.nextLine();

     //Initials
     String schoolInitials = highSchoolName.subString(0, 1);
     String remainingName = highSchoolName.substring(highSchoolName.indexOf(" ") + 1);
     schoolInitials = schoolInitials + remainingName.substring(0, 1);
     remainingName = remainingName.substring(remainingName.indexOf(" ") + 1, remainingName.indexOf(" "));
     schoolInitials = schoolInitials + remainingName.substring(0, 1);

     orderNumber = (int)(Math.random() * 101);

     double drinkCost = drinkQuantity * drinkPrice;
     double candyCost = candyQuantity * candyPrice;
     double hotDogCost = hotDogQuantity * hotDogPrice;
     double hamburgerCost = hamburgerQuantity * hamburgerPrice;

     orderSubtotal = drinkCost + candyCost + hotDogCost + hamburgerCost;
     taxAmount = orderSubtotal * salesTaxRate;
     grandTotal = orderSubtotal + taxAmount;

     taxAmount = (int)(taxAmount * 100) / 100.0;
     grandTotal = (int)(grandTotal * 100) / 100.0;

     System.out.println("**************************************");
     System.out.println("*     " + schoolInitials + " Snack Bar");
     System.out.println("*     Order #" + orderNumber);
     System.out.println("*");
     System.out.println("*  " + drinkQuantity + "\tDrink\t\t$" + drinkCost);
     System.out.println("*  " + candyQuantity + "\tCandy\t\t$" + drinkCost);
     System.out.println("*  " + hotDogQuantity + "\tHot Dog\t\t$" + hotDogCost);
     System.out.println("*  " + hamburgerQuantity + "\tHamburger\t$" + hamburgerCost);
     System.out.println("*");
     System.out.println("*  Subtotal:\t\t$" + orderSubtotal);
     System.out.println("*  Tax:\t\t\t$" + taxAmount);
     System.out.println("*  Total:\t\t$" + grandTotal);
     System.out.println("**************************************");
  }
}
