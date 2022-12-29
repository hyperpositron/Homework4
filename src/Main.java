public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
    }
    public static void task1() {
        //Задача 1
        System.out.println("Задача №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+" , то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен "+age+" , он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        //Задача 2
        System.out.println("Задача №2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.");
        }
        if (temperature > 5) {
            System.out.println("«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.");
        }

    }
}