package withoutInterfaces;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateUsingRandom {

    static final String MALE = "male";
    static final String FEMALE = "female";

    static List generate(List list) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        System.out.print("Enter how many persons to generatePersons: ");
        int k = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        int temp = 0;
        String[] names = {"Alex", "Dimitry", "Roman", "Vasya", "Petya"};
        String[] countries = {"Belarus", "Ukraine", "Russia", "USA"};
        String[] cities = {"Minsk", "Moscow", "Paris", "Kiev"};
        do {
            Person person = new Person();
            Address address = new Address();
            temp = random.nextInt(5);
            person.setName(names[temp]);
            temp = random.nextInt(81);
            person.setAge(temp);
            temp = random.nextInt(10);
            if (temp >= 5) person.setSex(MALE);
            if (temp < 6) person.setSex(FEMALE);
            temp = random.nextInt(4);
            address.setCountry(countries[temp]);
            temp = random.nextInt(4);
            address.setCity(cities[temp]);
            person.setAddress(address);
            list.add(person);
            counter++;
        } while (counter != k);
        return list;
    }
}
