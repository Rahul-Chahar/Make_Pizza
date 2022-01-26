/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 26/01/2022
 */

package Pizza;

public class pizza {
    //Field, attribute, member variable
    private double priceInRupees;
    public int sizeInInches;
    public String[] ingredients;
    public String name;


    /**
     * price of one ingredient with decimal is fix -->10.0 rs
     * */
    final double PRICE_OF_ONE_INGREDIENT_IN_RUPEES = 10.0;

    /**
     * Price of different size of pizza's in rupees
     **/
    final double PRICE_FOR_SMALL_PIZZA_IN_RUPEES = 350.0;
    final double PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES = 500.0;
    final double PRICE_FOR_LARGE_PIZZA_IN_RUPEES = 650.0;

    public double calculatePrice(String [] ingredients, int sizeInInches){
        return ((ingredients.length*PRICE_OF_ONE_INGREDIENT_IN_RUPEES)+calculatePriceBaseOnSize(sizeInInches));
    }

    /**
     *This method calculate price according to size
     **/
    private double calculatePriceBaseOnSize(int sizeInInches){
        return switch (sizeInInches){
            case 7 -> PRICE_FOR_SMALL_PIZZA_IN_RUPEES;
            case 10 -> PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES;
            case 12 -> PRICE_FOR_LARGE_PIZZA_IN_RUPEES;
                default -> PRICE_FOR_SMALL_PIZZA_IN_RUPEES;
        };
    }
}