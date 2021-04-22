package withoutInterfaces;

import java.util.List;
import java.util.Scanner;


public class MilitaryOffice {

    static void showAllPersons(List list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void showFromAddress(List list) {
        final Scanner scanner = new Scanner(System.in);
        Address address = new Address("", "");
        System.out.println("Enter a city: ");
        String city = scanner.nextLine();
        address.setCity(city);
        PersonRegistry personRegistry = new PersonRegistry(list);
        list = personRegistry.list(address);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void showFromAge(List list) {
        final Scanner scanner = new Scanner(System.in);
        int ageBegin;
        int ageEnd;
        System.out.print("Enter from what age: ");
        ageBegin = scanner.nextInt();
        System.out.print("Enter to what age: ");
        ageEnd = scanner.nextInt();
        PersonRegistry personRegistry = new PersonRegistry(list);
        list = personRegistry.list(ageBegin, ageEnd);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}


