public class Sem2 {
    public static void main(String[] args) {
        task0(10, 'a', 'f');
    }

    static void task0(int n, char c1, char c2){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2 ; i++) {
            stringBuilder.append(c1).append(c2);
        }
        System.out.println(stringBuilder);
    }

    static void task1(String str){ // aabbaashdnasbdjhbash
    // Текст задачи:
    // Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
    // a4b3c1d2
        char[] chars = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length ; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            } else {
                stringBuilder.append(chars[i-1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        System.out.println(stringBuilder);
    }


}
