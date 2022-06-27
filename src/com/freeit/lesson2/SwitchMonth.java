package com.freeit.lesson2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 25.06.2022
 * Email: dmitriytanenja@gmail.com
 */
public class SwitchMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста нажмите число месяца : ");
        int month = in.nextInt();
        System.out.println ( "месяц цифру которого вы нажали: " + monthOfYear(month)+"\n"
                +" пора года : "+ seasonOfYear(month));
    }

    /**
     * блок выбора месяца
     */
    public static String monthOfYear(int month){
        switch (month){

          case 1 -> {
              return"Январь";
          }
          case 2 -> {
              return"Февраль";
          }
          case 3 -> {
              return"Март";
          }
          case 4 -> {
              return"Апрель";
          }
          case 5 -> {
              return"Май";
          }
          case 6 -> {
              return"Июнь";
          }
          case 7 -> {
              return"Июль ";
          }
          case 8 -> {
              return"Август";
          }
          case 9 -> {
              return"Сентябрь";
          }
          case 10 -> {
              return"Октябрь";
          }
          case 11 -> {
              return"Ноябрь";
          }
          case  12 -> {
              return"Декабрь";
          }
            default ->{
              return"нет такого месяца";
            }

        }

    }

    /**
     * блок выбора :  времена года
     */
    public static String seasonOfYear (int month) {
        switch (month){
            case 12, 1 ,2 -> {
                return "Зима";
            }
            case 3,4,5 -> {
                return "Весна";
            }
            case 6,7,8 -> {
                return "Лето";
            }
            case 9,10,11 -> {
                return "Осень";
            }
            default -> {
                return " пора года не соответствует ";
            }
        }

    }
}
