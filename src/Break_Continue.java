// Created by Vadim 20.02.2025 and update 08.03.2025
/* Оператор continue позволяет перескакивать к следующий итерации в цикле
не прерывая сам цикл (в отличие от break), полезен когда нужно пропустить часть цикла
не прерывая при этом код
 */
public class Break_Continue {
    public static void main(String[] args){
        for(int i=0; i<=15; i++){
            if (i%2==0){
                continue;
            }
            System.out.println("Это нечетное число" +i);
        }
    }
}
