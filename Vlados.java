package com.company;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Vlados {                                 //Создать класс
    public void firstMethod(int x, int y){           //Создать 1-ый метод который принимает 2 аргумента
        ////////////////////////////////////////////////////
        double value = Math.pow(x,y); //Возвести Х в степень У.
        String text = "x^y=" + value;
        System.out.println(text);
        ////////////////////////////////////////////////////
        System.out.println("x+y=" + (x+y));         //Вывести сумму Х + У.
        ////////////////////////////////////////////////////
        int z = 0;                              //У раз добавить Х к переменной Z(изначально 0).
        for (int i = 0; i < y; i++){
            z += x;
        }
        System.out.println("z="+ z);
        ////////////////////////////////////////////////////
    }

    public void secondMethod(int x, int y){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss"); //указываем форматы вывода даты
        Date currentDate = new Date(); //берем сегодняшнюю дату
        Calendar c = Calendar.getInstance(); //создаем обертку календаря что бы добавлять нужные значения
        c.setTime(currentDate); //указываем для календаря нашу дату
        c.add(Calendar.DATE, x); //добавляем "х" дней
        c.add(Calendar.HOUR, y); //добавляем "у" часов
        Date currentDatePlusArgs = c.getTime(); //выводим нашу дату из обёртки календаря
        System.out.println(dateFormat.format(currentDatePlusArgs)); // выводим дату по указанному в начале формату
    }
}
