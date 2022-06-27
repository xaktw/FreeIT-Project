package com.freeit.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 25.06.2022
 * Email: dmitriytanenja@gmail.com
 */
public class NameSexAge {
    public static void main(String[] args){
        System.out.println("Введите ваше имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println(sex(name));
        System.out.println("Ваш возраст составляет : " + age + " year, " + ageStage(age) );
        // System.out.println("SERVER: " + ageStage(age));
    }
    /**
     * блок возрастного ограничения
     */
    public static String ageStage (int age) {
        if (age < 18) {
            System.out.println("ваш возраст не достиг 18+ ");
            System.out.println("не унывай  , у тебя весь мир впереди *_*");
        } else {
            System.out.println("вы совершеннолетний");
            System.out.println("теперь для вас открыт мир и возможности :)");
        }
        return "Всего хорошего";
    }
    /**
     *  блок распознования по гендерному признаку
     */

    public static String sex(String name) {
        String[] letters = {"а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я"};
        String letter = name.substring(name.length() - 1);
        if (Arrays.asList(letters).contains(letter)) {
            return "Я вас приветствую госпожа " + name;
        } else {
            return "Я вас приветствую господин " + name;
        }
    }
}