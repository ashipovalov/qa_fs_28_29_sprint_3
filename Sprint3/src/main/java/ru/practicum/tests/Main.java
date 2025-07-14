package ru.practicum.tests;

//Этот комментарий оставлен на сервере
public class Main {
    public static void main(String[] args) {
System.out.println("Для демонстрации конфликта и стратегии разрешения оного");
        System.out.printf("Hello and welcome!");
        System.out.println("Даешь конфликты и ура");
        System.out.println("Даешь конфликты и не ура");
        for (int i = 1; i <= 5; i++) {
            System.out.println("А это коммит из IDE");
System.out.println("Привет из консольного коммита");
            System.out.println("i = " + i);
        }
    }
}
