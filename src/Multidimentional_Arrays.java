// Created by Vadim 14.03.2025
/*
* Использование многомерных массивов данных позволяет обращаться, например,
* к матрицам и брать сразу несколько чисел.
 */
public class Multidimentional_Arrays {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        int [][] matrix = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        System.out.println(matrix[2][2]); /*первое число отвечает за строку,
       второе за столбец, счет начинается с 0, поэтому ответ 9 */
        System.out.println(matrix[1][0]);
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                System.out.print(matrix [i] [j] + " "); /*out.print вместо prinln чтобы не
                ответ в каждом цикле (т.е. каждое число не выдавало с новой строки*/
            }
            System.out.println();
        }
    }
}
