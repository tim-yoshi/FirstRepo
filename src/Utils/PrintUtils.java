package takeout.Utils;

import static takeout.Utils.PrintUtils.CommonPrintMethod.*;

public class PrintUtils {

    public static class CommonPrintMethod {

        public static void print(String text) {
            System.out.print(text);
        }

        public static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            print("______________________________________");
        }
    }



    public static void printMenuTitle () {
        println();
        println();
        println();
        print("------------------- Menu Title -------------------");
        println();
        println();
        println();
    }

    public static void printMainDishesTitle() {
        print("Our Best Main Dishes");
        println();
        println();
    }

    public static void printSidesTitle() {
        print("Our Healthy Sides");
        println();
        println();
    }


    public static void printDrinksTitle() {
        print("Our Tasty Drinks");
        println();
        println();
    }

    public static void printPrice(double price) {
        if (price < 10) {
            print("    ---    $ " + price);
        } else {
            print("    ---    $" + price);
        }
    }




}
