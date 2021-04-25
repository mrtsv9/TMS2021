import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Military extends Air {
    private boolean includingCatapult;
    private int amountOfRockets;


    public Military(int power, int speed, int weight, String brand, int wingspan, int minLenOfRunway,
                    boolean includingCatapult, int amountOfRockets) {
        super(power, speed, weight, brand, wingspan, minLenOfRunway);
        this.includingCatapult = includingCatapult;
        this.amountOfRockets = amountOfRockets;
    }

    public void description() {
        System.out.print("The power is " + getPower() + " HP\nThe maximum speed is " + getSpeed() + " km/h\nThe weight is " + getWeight() +
                " tons\nThe brand is " + getBrand() + "\nThe wingspan is " + getWingspan() +
                " meters \nThe minimum length of runway is " + getMinLenOfRunway() + " meters \nThe amout of rockets is " + amountOfRockets
                + countPower(getPower()));
        if (includingCatapult) System.out.println("And this plane have catapult!\n\n\n");
        else System.out.println("But this plane does not have catapult\n\n\n");
    }

    public void openFire() {
        if (amountOfRockets != 0) System.out.println("Missile fired...\n\n\n");
        else System.out.println("The are not any missiles left!\n\n\n");
    }

    public void catapult() {
        if (includingCatapult) System.out.println("Catapulting went successfully!\n\n\n");
        else System.out.println("This plane doesn't have catapulting system!\n\n\n");
    }

}
