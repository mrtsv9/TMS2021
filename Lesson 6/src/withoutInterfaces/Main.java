package withoutInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        GeneratePersons.generate(persons);
        MilitaryOffice.showAllPersons(persons);
        MilitaryOffice.showFromAddress(persons);
        MilitaryOffice.showFromAge(persons);
    }

}
