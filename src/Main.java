import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.ColorSupported;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Cupcake cupCake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        Drink drink = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupCake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupCake.setprice(price);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText1 = input.nextLine();
        double price1 = Double.parseDouble(priceText1);
        redVelvet.setprice(price1);


        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText2 = input.nextLine();
        double price2 = Double.parseDouble(priceText2);
        chocolate.setprice(price2);

        System.out.println("We are deciding on the price for our standard drink. Here is the description:");
        drink.type();
        System.out.println("How much would you like to charge for the drink? (Input a numerical number taken to 2 decimal places): ");
        String priceText3 = input.nextLine();
        double price3 = Double.parseDouble(priceText3);
        drink.setprice(price3);
;
        System.out.println("We are deciding on the price for our Soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places): ");
        String priceText4 = input.nextLine();
        double price4 = Double.parseDouble(priceText4);
        soda.setprice(price4);

        System.out.println("We are deciding on the price for our Soda. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places): ");
        String priceText5 = input.nextLine();
        double price5 = Double.parseDouble(priceText5);
        milk.setprice(price5);

        cupcakeMenu.add(cupCake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
        drinkMenu.add(drink);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
    }
}
class Cupcake {
    public double price ;
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}
class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}
class Chocolate extends Cupcake {
    public void type() {
    System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}
class Drink {
    public double price;
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public void type() {
        System.out.println("A basic drink without any flavors, simple Water.");
    }
}
class Soda extends Drink {
    public void type() {
        System.out.println("Carbonated water: Soda");
    }
}
class Milk extends Drink {
    public void type() {
        System.out.println("Fresh and healthy non-skimmed cows milk.");
    }
}
