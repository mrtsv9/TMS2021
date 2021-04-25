package withoutInterfaces;


import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> citizens = new ArrayList<>();

    public PersonRegistry(List<Person> people) {
        this.citizens = people;
    }

    public List<Person> list() {
        return null;
    }

    public List<Person> list(Address address) {
        List<Person> people = new ArrayList<>();
        for (Person person : citizens) {
            Address personAddress = person.getAddress();
            if (personAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        if (people.size() == 0) {
            System.out.println("There are no persons with this city");
        }
        return people;
    }

    public List<Person> list(int ageBegin, int ageEnd) {
        List<Person> people = new ArrayList<>();
        for (Person person : citizens) {
            if (person.getAge() <= ageEnd && person.getAge() >= ageBegin) {
                people.add(person);
            }
        }
        return people;
    }


}
