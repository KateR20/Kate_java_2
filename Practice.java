
import java.util.Scanner;
import java.security.SecureRandom;

public class Practice {
    public static void main(String[] args) {

        String[] sandwiches = {"Ham", "Cheese", "PB & J", "Turkey"};
        String[] drinks = {"Water", "Juice", "Pop"};
        String[] desserts = {"Cake", "Cookies", "Ice Cream"};

        SecureRandom rand = new SecureRandom();
        for(int i = 0; i < 5; i++) {

    int sIndex = rand.nextInt(sandwiches.length);
    int dIndex = rand.nextInt(drinks.length);
    int desIndex = rand.nextInt(desserts.length);

    System.out.println("Lunch " + (i + 1) + ":");
    System.out.println(sandwiches[sIndex]);
    System.out.println(drinks[dIndex]);
    System.out.println(desserts[desIndex]);
    System.out.println();

}

        int sIndex = rand.nextInt(sandwiches.length);
        int dIndex = rand.nextInt(drinks.length);
        int desIndex = rand.nextInt(desserts.length);

        System.out.println("Your lunch:");
        System.out.println(sandwiches[sIndex]);
        System.out.println(drinks[dIndex]);
        System.out.println(desserts[desIndex]);
    }
}