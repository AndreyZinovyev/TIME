package com.company;

public class Main {

    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);
        Time t2 = new Time();
        System.out.println(t2);
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println("Час: " + t1.getHour());
        System.out.println("Минута: " + t1.getMinute());
        System.out.println("Секунда: " + t1.getSecond());
        System.out.println(t1);
        System.out.println("Час: " + t1.getHour());
        System.out.println("Минута: " +t1.getMinute());
        System.out.println("Секунда: " +t1.getSecond());
        t1.setTime(58, 59, 23);
        System.out.println(t1); // toString()
// // Проверка метода next Second() и каскадных операций
        System.out.println(t1.nextSecond()); //Возвращает объект класса Timer.
//Вызов метода toString() класса Time
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
