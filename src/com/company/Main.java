package com.company;

public class Main {
    public static int money = 500;
    public static void main(String[] args) {
        User Ivan = new User(10, "Иван");
        Ivan.start();

        User Igor = new User(20, "Игорь");
        Igor.start();

        User Dima = new User(30, "Дима");
        Dima.start();

        User Andrey = new User(40, "Андрей");
        Andrey.start();

        User Vova = new User(50, "Вова");
        Vova.start();

        User Tolyan = new User(60, "Толян");
        Tolyan.start();
    }
    private static final Object key = new Object();

    public static boolean test(int consumption, String name) throws InterruptedException {
        synchronized (key) {
            Thread.sleep(10);
            System.out.println("Лежит: " + money + ".\t" + name + " хочет снять: " + consumption + ".");
            if (money >= consumption) {
                money -= consumption;
                System.out.println("Снимаем: " + consumption);
                return false;
            } else {
                System.out.println("Денег нема...");
                return true;
            }
        }
    }
}
