package src.main.java;
import java.util.Objects;

public class Hometask2 {
    //1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
    public static String ifStringIs(String yourString, String containedString) {
        if (yourString.contains(containedString)) {
            return "True";
        } else {
            return "False";
        }
    }

    // 2.  Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
    // (вхождение в обратном порядке).
    public static String isReverse(String firstString, String secondString) {
        StringBuilder firstBuilder = new StringBuilder(firstString);
        StringBuilder secondBuilder = new StringBuilder(secondString);
        if (firstBuilder.reverse().toString().equals(secondBuilder.toString())) {
            // переворачиваем ->перевод в строку -> сравниваем тоже переведя в строку
            return "True";
        }
        return "False";
    }
    //  3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    public static String recReverse(String yourString) {
    if (yourString.isEmpty()) {
        return yourString;
    }
    return recReverse(yourString.substring(1)) + yourString.charAt(0);
    }
    //  4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59
    //  3 – 56 = -53  и 3 * 56 = 168 Используем метод StringBuilder.append().
    public static String simpleCalc(int firstNumber, int secondNumber, String sign) {
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(sign, "+")) {
            return sb
                    .append(firstNumber)
                    .append(" + ")
                    .append(secondNumber)
                    .append(" = ")
                    .append((firstNumber + secondNumber)).toString();
        } else if (Objects.equals(sign, "-")) {
            return sb
                    .append(firstNumber)
                    .append(" - ")
                    .append(secondNumber)
                    .append(" = ")
                    .append((firstNumber - secondNumber)).toString();
        } else if (Objects.equals(sign, "*")) {
            return sb
                    .append(firstNumber)
                    .append(" * ")
                    .append(secondNumber)
                    .append(" = ")
                    .append((firstNumber * secondNumber)).toString();

        } else {
            return "I dont know what i need to do";
        }
        // если надо вывести все 3 результата то нужно все appends в одну строку без ветвлений, можно добавить "/n'
        // из условия я не поняла до конца что от меня ожидалось на выводе
    }
//  5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
    public static String changeSignToWorld (String yourString) {
        StringBuilder sb = new StringBuilder(yourString);
        int indexEl;
        while ((indexEl = sb.indexOf("=")) != -1) {
            sb.deleteCharAt(indexEl);
            sb.insert(indexEl,"равно");
        }
        return sb.toString();
        // если надо удалить несколько одинаковых символов, то оформлено через цикл while
    }

    // 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

    public static String replaceString(String yourString, String what, String forWhat) {
        StringBuilder sb = new StringBuilder(yourString);
        int start;
        while ((start = sb.indexOf(what)) != -1) {
            sb.replace(start, (start+1), forWhat);
        }
            return sb.toString();
        // также через цикл если надо несколько удалить, в данном случае он избыточен

    }
    // 7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

    public static long compareTimeWithSb(String string) {
        long begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(string);
        int start;
        while ((start = sb.indexOf("=")) != -1) {
            sb.replace(start, start + 1, "равно");
        }
        long end = System.currentTimeMillis();
        return end - begin;
    }
    public static long compareTimeWithStr (String str) {
        long begin = System.currentTimeMillis();
        str = str.replace("=", "равно");
        long end = System.currentTimeMillis();
        return end-begin;
    }



    public static void main(String[] args) {
        System.out.println(ifStringIs("mystring", "nothing"));
        System.out.println(isReverse("not", "ton"));
        String myString = simpleCalc(5,6, "*");
        System.out.println(myString);
        System.out.println(changeSignToWorld(myString));
        System.out.println(replaceString(myString, "=", "равно"));
        String str = "=/".repeat(1000);
        System.out.println(compareTimeWithSb(str));
        System.out.println(compareTimeWithStr(str));
        String forReverse = "123456 789";
        System.out.println(recReverse(forReverse));



    }





}

