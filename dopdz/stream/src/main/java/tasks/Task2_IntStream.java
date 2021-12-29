package tasks;

import java.util.List;
import java.util.stream.IntStream;

public class Task2_IntStream {

    /**
     * Задача перемножить все числа переданные в список.
     * <p>
     * Метод должен вернуть -1 в 2-х случаях:
     * 1. Если в функцию попадает пустой стрим
     * 2. Если результат умножения превышает 100
     * <p>
     * Примеры:
     * <p>
     * (2,3) -> 6
     * (2,2,2) -> 8
     * () -> -1
     * (50, 3) -> -1
     * <p>
     * Понадобиться:
     * - Stream::reduce
     * - Optional::filter
     * - Optional::orElse
     */

    public static Integer multiply(List<Integer> linkedListOfNumbers) {
        System.out.println(linkedListOfNumbers.stream()
                .reduce((a, b) -> a * b).filter(i -> i <= 100).orElse(-1));

        return linkedListOfNumbers.stream()
                .reduce((a, b) -> a * b).filter(i -> i <= 100).orElse(-1);
    }

    /**
     * Найти среднее чисел в массиве, или вернуть исключение, если массив пустой.
     * <p>
     * см. Стримы для примитивов в https://annimon.com/article/2778
     * <p>
     * Понадобиться:
     * - IntStream::of
     * - IntStream::average
     * - Optional:orElseThrow
     */

    public static double findAverage(int[] numbers) {
        System.out.println(IntStream.of(numbers).average().orElseThrow());

        return IntStream.of(numbers).average().orElseThrow();
    }

}
