import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Civilian extends Air {
    private int amountOfPassengers;
    private boolean includingBusinessClass;


    public Civilian(int power, int speed, int weight, String brand, int wingspan, int minLenOfRunway,
                    int amountOfPassengers, boolean includingBusinessClass) {
        super(power, speed, weight, brand, wingspan, minLenOfRunway);
        this.amountOfPassengers = amountOfPassengers;
        this.includingBusinessClass = includingBusinessClass;
    }

    public void description() {
        System.out.print("The power is " + getPower() + " HP\nThe maximum speed is " + getSpeed() + " km/h\nThe weight is " + getWeight() +
                " tons\nThe brand is " + getBrand() + "\nThe wingspan is " + getWingspan() +
                " meters \nThe minimum length of runway is " + getMinLenOfRunway() + " meters \nThe maximum amount of passengers is "
                + amountOfPassengers + countPower(getPower()));
        if (includingBusinessClass) System.out.println("And this plane have business class!\n\n\n");
        else System.out.println("But this plane does not have business class\n\n\n");
    }

    public void checkPassengers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of passengers: ");
        int amount = scanner.nextInt();
        if (amountOfPassengers > amount)
            System.out.println("Everything is ok, tell all the passengers to get on the board!\n\n\n");
        else
            System.out.println("It is to much, we cant get on the board all this passengers! Need to kill someone :(\n\n\n");
    }

}
