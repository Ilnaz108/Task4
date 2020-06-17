import java.util.Scanner;

public class numberDescription {

    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        double type = scanner.nextInt();
        if (type < 0)
            System.out.println("Число отрицательное");
        else if (type > 0)
            System.out.println("Число положительное");
        else if (type < 10 && type > 0)
            System.out.println("Число однозначное");
        else if (type < 100 && type > 9)
            System.out.println("Число двузначное");
        else if (type < 1000 && type > 99)
            System.out.println("Число трехзначное");
       // else if (type % 2)==0;
       // System.out.println("Число четное");

    }
}
