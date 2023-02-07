package app;

public class Main {
    public static void main(String[] args) {
        int [] array = {1, 3, 4, 10, -19};
        getSum(array);
    }

    private static void getSum(int[] array){
        int sum = 0;
        for (int digit: array) {
            sum = sum + digit;
        }
        System.out.print("Sum: " + sum);
    }

}
