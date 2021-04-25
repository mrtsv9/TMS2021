import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Air extends Transport {
    private int wingspan;
    private int minLenOfRunway;

    public Air(int power, int speed, int weight, String brand, int wingspan, int minLenOfRunway) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minLenOfRunway = minLenOfRunway;
    }

    @Override
    public void description() {

    }
}
