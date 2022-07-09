package com.freeit.lesson5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 05.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class Notebook {
    /**
     * Создать класс записной книжки, в котором хранятся записи дел.
     * Создать в этом классе метод, который выводит частотный словарь для определенной записи
     * (запись можно определить по номеру/индексу)
     */
    String day;
    String activity;
    String place;

    int beginning;
    int ending;

    @Override
    public String toString() {
        return "Notebook{" +
                "day='" + day + '\'' +
                ", activity='" + activity + '\'' +
                ", place='" + place + '\'' +
                ", beginning=" + beginning +
                ", ending=" + ending +
                '}';
    }
    public void rec(){
        System.out.println("Notebook{" +
                "day='" + day + '\'' +
                ", activity='" + activity + '\'' +
                ", place='" + place + '\'' +
                ", beginning=" + beginning +
                ", ending=" + ending +
                '}');
    }
}