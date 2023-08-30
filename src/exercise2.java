import java.util.Random;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the length of your array: ");
        try {

            // Что за число d? Оно всегда будет выдавать исключение, я предполагаю, что по логике кода,
            // это длина массива, но длина массива всегда в коде определена, т.е
            // что длину массива нам нужно ввести с консоли, соответственно мы обрабатываем возможность введения 0
            // или не числа
            int d = scan.nextInt();
            int[] intArray = new int[d];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = random.nextInt(1,11);
            }
            double catchedRes1 = sumArray(intArray) / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch(Exception e){
            System.out.println("You have entered the wrong data!");
        }
    }
    public static int sumArray(int[] array){
        int sum = 0;
        for (int elem: array
        ) {
            sum+=elem;
        }
        return sum;
    }
}
