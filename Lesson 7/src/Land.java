import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Land extends Transport {
    private int amountOfWheels;
    private int fuelConsumption;

    public Land(int power, int speed, int weight, String brand, int amountOfWheels, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.amountOfWheels = amountOfWheels;
        this.fuelConsumption = fuelConsumption;
    }


    @Override
    public void description() {

    }
}
