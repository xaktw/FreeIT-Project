package com.freeit.lesson3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 27.06.2022
 * Email: dmitriytanenja@gmail.com
 */


public class FrequencyDictionary {
    /**
     * Написать частотный словарь
     * - посчитать сколько раз каждое слово встречается в предложении
     * и вывести результат в консоль
     */
    public static void main(String[] args) {
        System.out.println("Здраствуйте!" +"\n"+"Введите текст: ");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        /**
        toLowerCase Преобразует символы в строке в нижний регистр
         */
        System.out.println("Слова из текста: " + Arrays.toString(words));
        /**
         * Метод Arrays.toString() возвращает строковое представление одномерного массива, разделяя элементы запятой.
         */
        for (int i = 0; i < words.length; i++) {
            int countOfRepetition = 0;
              for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                  countOfRepetition++;
                }
              }
           System.out.println("Слово " + words[i] + " повторяется " + countOfRepetition + " раз(a).");
        }
    }
}
