package withInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void print() {
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        InputDataFactory factory = new InputDataFactory();
        factory.generatePersons(persons);
        MilitaryOffice office = new MilitaryOffice();
        office.showAllPersons(persons);
        office.showAllSortByAge(persons);
    }

}
