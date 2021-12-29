package tasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

class Task1_Basic {

    /**
     * Функция должна вернуть количество четных чисел в списке.
     * <p>
     * Пример:
     * 0,2 -> 2
     * 1,2,3,5 -> 1
     * <p>
     * Тут подойдут эти методы:
     * - Collection::stream()
     * - Stream::filter()
     * - Stream::count()
     */
    static long countEven(Collection<Integer> numbers) {
        System.out.println(numbers.stream().filter(i -> i % 2 == 0).count());
        return numbers.stream().filter(i -> i % 2 == 0).count();
    }

    /**
     * Функция должна вернуть число строчных символов в строке.
     * <p>
     * Пример:
     * "abcDE" -> 3
     * "ABC" -> 0
     * <p>
     * Тут подойдут эти методы:
     * - String::chars()
     * - Character::isLowerCase()
     * - Stream::count()
     */
    static long countLowercaseLetters(String str) {
        System.out.println(str.chars()
                .filter(Character::isLetter)
                .filter(c -> c - Character.toLowerCase(c) == 0)
                .count());

        return str.chars()
                .filter(Character::isLetter)
                .filter(c -> c - Character.toLowerCase(c) == 0)
                .count();
    }


    /**
     * Функция должна заменить каждое слово в строке его длинной.
     * <p>
     * Слова разделяются одним или более пробелами.
     * <p>
     * Пример:
     * "a b cd" -> "1 1 2"
     * "one two   three" -> "3 3 5"
     * <p>
     * Тут подойдут эти методы:
     * - String::split()
     * - Stream::map()
     * - Stream::collect()
     * - Collectors.joining()
     */
    static String replaceWordsOnLength(String str) {
        System.out.println(Arrays.stream(str.split(" +"))
                .map(String::length)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

        return Arrays.stream(str.split(" +"))
                .map(String::length)
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}