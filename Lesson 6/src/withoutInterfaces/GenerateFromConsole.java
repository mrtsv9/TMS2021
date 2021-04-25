package withoutInterfaces;

import java.util.List;
import java.util.Scanner;

public class GenerateFromConsole {
    public static List<Person> generate(List list) {
        final Scanner scanner = new Scanner(System.in);
        int k = 1;
        int age;
        String field;
        do {
            Person person = new Person();
            Address address = new Address();
            System.out.println("Enter a name: ");
            field = scanner.nextLine();
            person.setName(field);
            System.out.println("Enter a age: ");
            age = scanner.nextInt();
            person.setAge(age);
            scanner.nextLine();
            System.out.println("Enter a sex (male/female): ");
            field = scanner.nextLine();
            person.setSex(field);
            System.out.println("Enter a country: ");
            field = scanner.nextLine();
            address.setCountry(field);
            System.out.println("Enter a city: ");
            field = scanner.nextLine();
            address.setCity(field);
            person.setAddress(address);
            list.add(person);
            System.out.println("Do you want to continue adding persons or not?\n" +
                    "(Press 1 if you want yo exit)");
            k = scanner.nextInt();
            scanner.nextLine();
        } while (k != 1);
        return list;
    }
}
