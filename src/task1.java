public class task1 {
    public static void main(String[] args){
        int counter = 0;
        for (String arg : args) {
            if (Integer.parseInt(arg) > 0) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " positive numbers");
    }
}
