package withInterfaces;

import java.util.List;
import java.util.Scanner;


public class MilitaryOffice {

    final Scanner scanner = new Scanner(System.in);

    public void showAllPersons(List list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    public void showAllSortByAge(List list) {
        int ageBegin;
        int ageEnd;
        System.out.print("Enter from what age:");
        ageBegin = scanner.nextInt();
        System.out.print("Enter to what age: ");
        ageEnd = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Person person = (Person) list.get(i);
            if (person.getAge() >= ageBegin && person.getAge() <= ageEnd) {
                System.out.println(list.get(i));
            }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

}


