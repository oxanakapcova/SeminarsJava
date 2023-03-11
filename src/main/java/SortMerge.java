package src.main.java;
import java.util.Random;
public class SortMerge {
    public static void main(String[] args) {
        int[] testArray = new int[] {1, 34, 29, 10, 10, 10, 0, -23, -48, 2};
        System.out.println(arrayForPrint(testArray));
        testArray = mergeSort(testArray);
        System.out.println(arrayForPrint(testArray));
        int size = 1_000_000;
        int[] checkArray = getArray(size);
        long res = checkTime(checkArray);
        System.out.println(res);
    }
    public static int[] mergeSort(int[] array) {
        int[] tmp;// временный массив
        int[] currentArray = array; // текущий то что получаем на сортировку
        int[] currentRes = new int[array.length]; //тот куда заливаем полученные данные

        int size = 1; // вначале 1 позже увеличиваем вдвое
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentArray, i, currentArray,i +size,currentRes, i, size);
                }// слияние пар массивов через описанную функцию слияние и переданные нужные аргументы

            tmp = currentArray; // переписываем значения
            currentArray = currentRes;
            currentRes = tmp;

            size = size * 2;//увеличение с учетом алгоритма сортировки

            //System.out.println(arrayForPrint(currentArray));// чтоб видеть результат сортировки по частям
            }
            return currentArray;
    }
    private static void merge(int[] first, int firstStart, int[] second, int secondStart, int[] result,
                                  int resultStart, int size) {
        int index1 = firstStart;// будем сдвигать нужный
        int index2 = secondStart;
// вычисляем конец массивов, функция вернет меньший из 2 аргументов
        int firstEnd = Math.min(firstStart + size, first.length);
        int secondEnd = Math.min(secondStart + size, second.length);

        if (firstStart + size > first.length) {
            if (firstEnd - firstStart >= 0)
                System.arraycopy(first, firstStart, result, firstStart, firstEnd - firstStart);
            return;
        }
// вычисляем количество итераций для объединения двух массивов(сумма всех элементов)
        int iterationCount = firstEnd - firstStart + secondEnd - secondStart;

        for (int i = resultStart; i < resultStart + iterationCount; i++) {
            // непосредственно сравнение и сортировка, плюс проверяем не дошли ли до конца какого то массива
            if (index1 < secondEnd && (index2 >= secondEnd || first[index1] < second[index2])) {
                result[i] = first[index1];
                index1++; // увеличиваем индекс нужного нам массива, другой в этот момент не трогаем
            } else {
                result[i] = second[index2];
                index2++;
            }
        }
    }
    private static String arrayForPrint(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {//чтобы не добавлять перед первым числом
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static int[] getArray(int size) {
        int []array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    // замер времени алгоритма
    public static long checkTime(int[] array) {
        long begin = System.currentTimeMillis();
        mergeSort(array);
        long end = System.currentTimeMillis();
        return (end - begin);
    }
}
