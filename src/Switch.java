import java.util.Scanner;
// Created by Vadim 04.03.2025
/* Оператор switch выполнит конкретное условие если введенные данные будут
совпадать со значением переменной. Полезно, когда нужно выбрать один код из нескольких.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
