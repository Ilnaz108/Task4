import java.util.Scanner;

public class numberDescription {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double type = scanner.nextInt();
        if (type < 0)
            System.out.println("Число отрицательное");
        if (type > 0)
            System.out.println("Число положительное");
        if (type < 10 && type > 0)
            System.out.println("Число однозначное");
        if (type < 100 && type >= 9)
            System.out.println("Число двузначное");
        if (type < 1000 && type >= 99)
            System.out.println("Число трехзначное");
        if (type % 2 == 0)
            System.out.println("Число четное");
        else if (type % 2 != 0)
        System.out.println("Число нечетное");

    }

}
