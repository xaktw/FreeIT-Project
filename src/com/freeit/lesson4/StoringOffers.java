package com.freeit.lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 05.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class StoringOffers {
    /**
     * Написать программу, которая будет хранить текст по предложениям
     * и для каждого предложения составить частотный словарь
     */

    public static void main(String[] args) {
        String[] offer = {"", "", "" };
        Scanner in = new Scanner(System.in);
        System.out.println("Введите важе предложение:");
        offer[0] = in.nextLine();
        offer[1] = in.nextLine();
        offer[2] = in.nextLine();
        System.out.println("Ваши предложения внесены в базу:");
        String arr = Arrays.toString(offer);

        System.out.println(arr);
        System.out.println("Введите цифру от 1 до 3 , чтобы просмотреть ваше предложение: ");
        int number = in.nextInt();

        System.out.println("Ваше предложение записано в базу под цифрой " + number +". Текст следущий:");
        System.out.println("предложение #"+number+":");

        if (number == 1) {
            System.out.println(offer[0]);
        } else if (number == 2) {
            System.out.println(offer[1]);
        } else if (number == 3) {
            System.out.println(offer[2]);
        }
       else {
            System.out.println("ошибка");
        }
    }
}

