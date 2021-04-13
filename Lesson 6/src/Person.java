import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name = "default";
    private int age = 18;
    private String sex = "man";
    private String phoneNumber = "default";
    private String addressCountry = "default";
    private String addressTown = "default";
    private String addressStreet = "default";


}
