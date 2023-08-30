import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class exercise4 {
    public static void main(String[] args) {
        System.out.println("Please, enter your text: ");
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        if(text.equals("")){
            throw new RuntimeException("Empty string is forbidden!!!");
        }else System.out.println("Your text is " + text);
    }


}
