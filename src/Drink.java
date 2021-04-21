package takeout;

public class Drink {

    private String drinkName;
    private double drinkPrice;

    public Drink(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }
}
