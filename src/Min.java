import java.util.Scanner;

public class Min {

    public static void main(String[] args) {

        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        System.out.println("Введите второе число");
        int type2 = scanner.nextInt();
        if (type < type2)
        System.out.println("Минимальное число из введенных - " + type);
        else if (type > type2)
        System.out.println("Минимальное число из введенных - " + type2);

        }
    }
