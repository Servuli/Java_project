public class Break {
    /* Created by Vadim 03.03.2025
    break позволяет прервать цикл, если в нем необходима остановка
     */
    public static void main(String[] args) {
            int i = 0;
            while (true){
                if (i==15){
                    break;
                }
                System.out.println(i);
                i++;
            }
        System.out.println("Мы вышли из цикла");
        }
}
