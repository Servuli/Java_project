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
    }
}
class Persone {
    String name;
    int age;
    void speak(){
        System.out.println("Меня зовут "+ name + ",мне "+ age+ " лет.");
    }
}