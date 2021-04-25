package withInterfaces;

import java.util.List;
import java.util.Scanner;

public class InputDataFactory {

    private static PersonDao inputData;

    public PersonDao generatePersons(List list) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Choose what to do: \n1 - Generate from console \n2 - Generate using random " +
                "\n3 - Use static fields\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                inputData = new GenerateFromConsole();
                inputData.generate(list);
                break;
            case 2:
                inputData = new GenerateUsingRandom();
                inputData.generate(list);
                break;
            case 3:
                inputData = new GenerateUsingStaticFields();
                inputData.generate(list);
                break;
            default:
                System.out.println("Invalid value!");
        }
        return inputData;
    }

}
