package com.freeit.lesson5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: xaktw
 * Date: 09.07.2022
 * Email: dmitriytanenja@gmail.com
 */
public class Runner {
    public static void main(String[] args) {
       Notebook notebook = new Notebook();
        //System.out.println(notebook);
        Scanner in = new Scanner(System.in);
        System.out.println("День: ");
        notebook.day=in.nextLine();
        System.out.println("Заметка: ");
        notebook.activity= in.nextLine();
        System.out.println("Место: ");
        notebook.place= in.nextLine();
        System.out.println("Начало:");
        notebook.beginning= in.nextInt();
        System.out.println("Окончание: ");
        notebook.ending= in.nextInt();

        notebook.rec();

    }

}
