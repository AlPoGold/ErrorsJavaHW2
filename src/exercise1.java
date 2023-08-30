import java.util.Scanner;

public class exercise1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Please, enter your number: ");
            //сделала через строку, чтобы float-числа вводить с точкой, как обычно, а не через запятую
            String numString = scan.next();
            try{
                double number = Double.parseDouble(numString);
                System.out.println("Your number is " + number);
                scan.close();
                break;
            } catch (Exception e) {
                System.out.println("You have entered the wrong data!");
            }
        }
    }
}
