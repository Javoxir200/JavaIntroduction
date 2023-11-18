import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4(3,2);
    }


//    <aside>
//📔 **Текст задачи:**
//    В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
//
//</aside>
    static void task0(){
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();


        if (hour >= 5 &&  hour < 12) System.out.println("Доброе утро " + name);
        else if (hour < 18) System.out.println("Добрый день " + name);
        else if (hour < 23) System.out.println("Добрый вечер " + name);
        else System.out.println("Доброй ночи" + name);

        scanner.close();
    }

    /*Текст задачи:
    Дан массив двоичных чисел,
    например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/

    static void task1(){
        int[] array = {1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            if (array[i] == 0 || i == array.length - 1) {
                if (count > maxOnes) maxOnes = count;
                count = 0;
            }
        }
        System.out.println(maxOnes);
    }

    /*Текст задачи:
    Дан массив nums = [3,2,2,3] и число val = 3.
    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    а остальные - равны ему.*/

    static void task2(){
        int[] nums = {2,2,3,3,1,4,2,6,8,4,4};
        int val = 2;
        int[] temp = new int[nums.length];
        Arrays.fill(temp, val);
        for (int i = 0, j = 0 ; i < nums.length; i++ ) {
            if(nums[i] != val){
                temp[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    // Текст задачи:
    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    static void task3(String str){

        str = str.toLowerCase();
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    //📔 **Текст задачи:**
    //
    //    Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
    //    Пример 1: а = 3, b = 2, ответ: 9
    //    Пример 2: а = 2, b = -2, ответ: 0.25
    //    Пример 3: а = 3, b = 0, ответ: 1

    static void task4(int a, int b){
        double result = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            result = result * a;
        }

        result = (b > 0 ? result : 1/result );
        System.out.println(result);
    }
}