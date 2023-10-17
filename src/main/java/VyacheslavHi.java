import java.util.Scanner;

public class VyacheslavHi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.print("Введите имя: ");
        String name = scanner.next();
        if(name.equalsIgnoreCase("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}

