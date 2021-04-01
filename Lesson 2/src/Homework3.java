import java.util.Scanner;
public class Homework3 {
    public static void result(int arr[], int len){
        int res = 0;
        for(int i = 0; i < len; i++) {
            res += arr[i];
        }
        System.out.println("The average number is " + ((double)res/(double)len));
    }

    public static void  main(String[] args){
        int arr[];
        arr = new int[10];
        int len = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        len = input.nextInt();
        if(len > 10) {
            do {
                System.out.println("But actually not more then 10 ");
                System.out.println("Enter length of the array: ");
                len = input.nextInt();
            } while (len > 10 && len > 10);
        }
        if(len < 0) {
            do {
                System.out.println("and not less then 0.. ");
                System.out.println("Enter length of the array: ");
                len = input.nextInt();
            } while (len < 0 && len > 10);
        }
        for (int i = 0; i < len; i++){
            System.out.println("Enter " +  (i+1) + " element");
            arr[i] = input.nextInt();
        }

       result(arr, len);
    }
}
