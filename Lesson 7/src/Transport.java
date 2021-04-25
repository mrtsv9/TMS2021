import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Transport {
    private int power;
    private int speed;
    private int weight;
    private String brand;

    public abstract void description();

    public String countPower(int power) {
        power *= 0.74;
        return "\nAnd the power in kilowatts is " + power + "\n";
    }

}
