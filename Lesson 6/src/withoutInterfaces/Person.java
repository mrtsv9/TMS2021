package withoutInterfaces;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private String name = "default";
    private int age = 18;
    private String sex = "man";
    private Address address;

    @Override
    public String toString() {
        return "withoutInterfaces.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }

    public void setAddress(String country, String city) {
        address.setCountry(country);
        address.setCity(city);
    }

}
