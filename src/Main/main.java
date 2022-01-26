/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 26/01/2022
 */

package Main;
import java.util.Scanner;
import Pizza.pizza;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pizza Pizza = new pizza();
        System.out.println("Enter the pizza name you want to eat.");
        Pizza.name = sc.nextLine();
        //System.out.println("Enter the Ingredients you want to add in Pizza");
        Pizza.ingredients = new String[]{"Cheese", "Tomato"};
        System.out.println("Enter the size of Pizza /n Small = 7, Medium = 10, Large = 12");
        Pizza.sizeInInches = sc.nextInt();
        double pizzaPrice = Pizza.calculatePrice(Pizza.ingredients, Pizza.sizeInInches);
        System.out.println("\"pizzaPrice\" = " + pizzaPrice);

    }
}