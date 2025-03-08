// Created by Vadim 08.03.2025
/* Изучение цикла for each, позволяющий проходится по массивам
и по любой другой структуре данных */
public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers [0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет"; // Инициализируем ячейки, наполняем их значениями
        strings[1] = "Пока"; // Счет ведется всегда с нуля, т.е. 3== 0,1.2;
        strings[2] = "Джава";
        for (int i = 0; i< strings.length; i++){ /*просто проходимся по циклу
        - по каждому элементу массива*/
            System.out.println(strings[i]);
        }
        /* Цикл for each проходится по каждому элементу массива позволяя делать что-нибудь
        с каждым из этих элементов*/
        System.out.println(); // Пустая строка, чтобы отделять выводимое из предыдущих строк
        for (String string:strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x: numbers1){
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
