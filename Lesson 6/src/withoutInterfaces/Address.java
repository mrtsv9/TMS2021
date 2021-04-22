package withoutInterfaces;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private String country = "default";
    private String city = "default";
}
