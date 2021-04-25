import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Light extends Land {
    private String bodyType;
    private int amountOfPassengers;

    public Light(int power, int speed, int weight, String brand, int amountOfWheels, int fuelConsumption, String bodyType, int amountOfPassengers) {
        super(power, speed, weight, brand, amountOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public void description() {
        System.out.print("The power is " + getPower() + " HP\nThe maximum speed is " + getSpeed() + " km/h\nThe weight is " + getWeight() +
                " tons\nThe brand is " + getBrand() + "\nThe amount of wheels is " + getAmountOfWheels() + "\nThe fuel consumption is "
                + getFuelConsumption() + " per 100 km\nThe body type is " + bodyType + "\nAnd the maximum amount of passengers is "
                + amountOfPassengers + countPower(getPower()) + "\n\n");
    }

    public void movingInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many hours the car will be on the road: ");
        double time = scanner.nextDouble();
        System.out.println("For the time " + time + " hours " + getBrand() + " car brand moving with the maximum speed " +
                getSpeed() + " k/h will move to " + getSpeed() * time + " kilometers and " + getFuelConsumption() * time +
                " liters of fuel will be used\n\n");
    }
}
