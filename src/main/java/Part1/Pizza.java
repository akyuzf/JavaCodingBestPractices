package Part1;

/*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
    Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
 */
public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniTopping;
    private int hamToppings;


    public Pizza(String size, int cheeseToppings, int pepperoniTopping, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniTopping = pepperoniTopping;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniTopping() {
        return pepperoniTopping;
    }

    public void setPepperoniTopping(int pepperoniTopping) {
        this.pepperoniTopping = pepperoniTopping;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }


    public double calcCost() {

        if (size.equalsIgnoreCase("Small")) {
            return 10 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else if (size.equalsIgnoreCase("Medium")) {
            return 12 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else if (size.equalsIgnoreCase("Large")) {
            return 14 + (cheeseToppings * 2) + (pepperoniTopping * 2) + (hamToppings * 2);
        } else {
            return 0;
        }

    }

    public String getDescription() {
        return size + " Pizza with " + cheeseToppings + " Cheese toppings, " + pepperoniTopping + " Pepperoni toppings, and " + hamToppings + " Ham toppings." +
                "\nTotal Price: " + calcCost();
    }

}
