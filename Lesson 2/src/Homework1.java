import java.util.Scanner;
public class Homework1 {
    public static void result(int a, int b){
        System.out.println(a+b);
    }

    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        result(a,b);
    }
}
