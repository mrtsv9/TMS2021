package withInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void print() {
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        GeneratePersons.generate(persons);
        MilitaryOffice.showAllPersons(persons);
    }

}
