package withInterfaces;

import java.util.List;
import java.util.Scanner;

public class GeneratePersons {

    static List generate(List list) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Choose what to do: \n1 - Generate from console \n2 - Generate using random " +
                "\n3 - Use static fields\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                GenerateFromConsole.generate(list);
                break;
            case 2:
                GenerateUsingRandom.generate(list);
                break;
            case 3:
                GenerateUsingStaticFields.generate(list);
                break;
            default:
                System.out.println("Invalid value!");
        }
        return list;
    }

}
