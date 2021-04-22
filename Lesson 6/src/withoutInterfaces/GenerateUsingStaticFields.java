package withoutInterfaces;

import java.util.List;

public class GenerateUsingStaticFields {

    static List generate(List list) {
        {
            Person person = new Person();
            Address address = new Address();
            person.setName("Alex");
            person.setAge(12);
            person.setSex("male");
            address.setCountry("Belarus");
            address.setCity("Minsk");
            person.setAddress(address);
            list.add(person);
        }
        {
            Person person = new Person();
            Address address = new Address();
            person.setName("Nikolay");
            person.setAge(32);
            person.setSex("male");
            address.setCountry("Belarus");
            address.setCity("Vitebsk");
            person.setAddress(address);
            list.add(person);
        }
        {
            Person person = new Person();
            Address address = new Address();
            person.setName("Roma");
            person.setAge(54);
            person.setSex("male");
            address.setCountry("Poland");
            address.setCity("Minsk");
            person.setAddress(address);
            list.add(person);
        }
        return list;
    }
}
