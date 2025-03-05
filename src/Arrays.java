// Created by Vadim 05.03.2025
public class Arrays {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных          //[10]
        int[] numbers = new int[5];//                       numbers=>[массив] Ссылочный тип данных
        for (int i = 0;i<numbers.length;i++){
            numbers [i] = i*10;
        }
        //*System.out.println(numbers[0]);// комп ведет отсчет с 0 т.е. 5 ячеек это 0 1 2 3 4
        for (int i = 0;i<numbers.length;i++){
            System.out.println(numbers [i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for (int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}
