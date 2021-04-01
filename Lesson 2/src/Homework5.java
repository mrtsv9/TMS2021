import java.util.Scanner;
public class Homework5 {
    public static void main(String[] args){
        double res = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter th first cathet: ");
        double first = input.nextDouble();
        System.out.println("Enter th second cathet: ");
        double second = input.nextDouble();
        res = Math.pow(Math.pow(first, 2) + Math.pow(second, 2), 0.5);
        System.out.println("And the hepotenuse is: " + res);
    }
}
