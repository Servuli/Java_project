/**
 * Created by Vadim 20.03.2025
 * Мы изучаем на этом уроке классы, методы и основные элементы проекта.
 * */
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут "+person1.name +","+"мне "+person1.age +" лет.");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        System.out.println("Меня зовут "+person2.name +","+"мне "+person2.age +" лет.");
    }
}
/**
 * Public (публичный класс может быть только один и он основной
 */
class Person {
    String name;
    int age;
    /**
     * Только что я создал дополнительный класс, их может быть сколько угодно
     * Важный момент - так как класс public может быть только один дополнительный класс
     * не должен располагаться в фигурных скобках основного класса.
     * У класса могут быть:
     * 1) Данные (поля класса)
     * 2) Действия которые он может совершать (методы).
     */
}