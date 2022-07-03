package com.freeit.lesson3;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 27.06.2022
 * Email: dmitriytanenja@gmail.com
 */
public class RandomLetter {
    /**
     * Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
     * При каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold"
     * в зависимости от того, как далеко буква пользователя от загаданной
     */


    public static void main(String[] args) {

        System.out.println("Добро пожаловать в игру 'отгадай букву'  " );

        /*
        блок создания произвольного числа
         */
        Random rand = new Random();
        int randLetter = rand.nextInt(32);
        int hiddenLetter = (int) (randLetter + 'а');
        /*
        let`s go
         */
        Scanner in = new Scanner(System.in);
        boolean endGame = false;
        while (!endGame) {
            System.out.println("Введите букву [от а до я ]: ");
            String userIn = in.nextLine().toLowerCase();
            char userLetter = userIn.charAt(0);
            int Letter = userLetter;
            if (Letter == hiddenLetter) {
                System.out.println("Поздравляем! Скрытая буква  '" + userLetter + "' Вы выйграли!");
                endGame = true;
            } else {
                int difference = Math.abs(Letter - hiddenLetter);
                if (difference > 10) {
                    System.out.println("холодно");
                } else if (difference > 5) {
                    System.out.println("теплее");
                } else if (difference > 2) {
                    System.out.println("горячо");
                } else {
                    System.out.println("очень даже рядом");
                }
            }
        }
    }
}