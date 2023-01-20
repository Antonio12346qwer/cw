package org.example;
// В CharOperations в 3 строке import static org.example.Printer.printInQuotes;
//как раз импортирует этот класс в тот класс , что бы использовать метод printInQuotes там
//можешь зайти в CharOperations нажать ctrl + f
// и вставить туда printInQuotes и увидишь где он там его использует
//ctrl + f это поиск по классу , ctrl + shift + f поиск по проекту
public class Printer {
    static void printInQuotes(String text){
        System.out.println("\""+text+"\"");
    }
}
