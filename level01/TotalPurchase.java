import java.util.*;
 class TotalPurchase {
    public static void main(String[] args) {
        //Creating Scanner object to take input from user.
        Scanner input = new Scanner(System.in);
        //Taking input form user of each unit item.
        System.out.println("Enter price of each unit item : ");
        double unitPrice = input.nextDouble();
        //Taking input of how much item is purchased.
        System.out.println("Enter the quantity of item purchased : ");
        int quantity = input.nextInt();
        //calculating total price of the purchase.
        double totalPurchase = unitPrice * (double)quantity;
        //printing the output to the screen
        System.out.println("The total purchase price is INR "+totalPurchase+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
        //closeing the object of input.
        input.close();
    }
}
