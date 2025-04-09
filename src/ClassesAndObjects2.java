/** Created by Vadim 31.03.2025
 * Здесь пример того, что вызывая метод мы можем впихнуть в него информацию (объекты)
 * и делаем мы этом в классе Persone (тут "е" в конце добавлена умышленно, чтобы
 * данные не дублировали друг друга из другого созданного подкласса с таким же
 * именем, но из другого урока.)
**/
public class ClassesAndObjects2 {
    public static void main(String[] args) {
        Persone person1 = new Persone();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        Persone person2 = new Persone();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        /** Это другой урок
         * от 09.04.2025 - в нем разбирается функция return
         * переменные int про пенсию выведены уже после объявления return
         **/
        int year1=person1.calculateYearsToRetirement();

        int year2=person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии:"+year1+" лет");
        System.out.println("Второму человеку до пенсии:"+year2+" лет");
    }
}
class Persone {
    String name;
    int age;

    int calculateYearsToRetirement (){
        int years = 65-age;
        return years; // Эта переменная возвращает данные после выполнения ими функции
    }
    void speak(){
        System.out.println("Меня зовут "+ name + ",мне "+ age+ " лет.");
    }
}