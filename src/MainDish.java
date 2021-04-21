package takeout;

public class MainDish {

    private String mainDishName;
    private double mainDishPrice;

    public MainDish(String mainDishName, double mainDishPrice) {
        this.mainDishName = mainDishName;
        this.mainDishPrice = mainDishPrice;
    }

    public String getMainDishName() {
        return mainDishName;
    }

    public void setMainDishName(String mainDishName) {
        this.mainDishName = mainDishName;
    }

    public double getMainDishPrice() {
        return mainDishPrice;
    }

    public void setMainDishPrice(double mainDishPrice) {
        this.mainDishPrice = mainDishPrice;
    }
}
