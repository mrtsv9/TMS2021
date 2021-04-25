import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Freight extends Land {
    private int loadCapacity;


    public Freight(int power, int speed, int weight, String brand, int amountOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, speed, weight, brand, amountOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void description() {
        System.out.print("The power is " + getPower() + " HP\nThe maximum speed is " + getSpeed() + " km/h\nThe weight is " + getWeight() +
                " tons\nThe brand is " + getBrand() + "\nThe amount of wheels is " + getAmountOfWheels() + "\nThe fuel consumption is "
                + getFuelConsumption() + " per 100 km\nThe load capacity is " + loadCapacity + countPower(getPower()) + "\n\n");
    }

    public void checkLoadCapacity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total weight of the freight in kilograms: ");
        int weight = scanner.nextInt();
        if (loadCapacity * 1000 > weight) System.out.println("The truck is loaded!\n\n\n");
        else System.out.println("You need the bigger truck, you cant load all these to that truck!\n\n\n");
    }

}
