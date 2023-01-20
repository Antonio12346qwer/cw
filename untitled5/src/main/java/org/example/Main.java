package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
//        убрал переменные теперь они инициализируется в Charoperation локально
        CharOperations charOperations = new CharOperations();
        charOperations.checkAction(exp);
//        Вызвал класс с логикой и собственно все


    }
}