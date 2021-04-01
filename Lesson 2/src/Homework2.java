import java.util.Scanner;
public class Homework2 {
    public static void result(int a, int b){
        int res = 0;
        if(a>b) {res = a;} else {res = b;}
        System.out.println(res);;
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
