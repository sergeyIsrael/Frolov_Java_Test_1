import java.util.Scanner;

public class Number7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(number > 7){
            System.out.println("Привет");
        }
    }
}

