public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("«На улице холодно, нужно надеть шапку»");
        }
        if (temperature > 5) {
            System.out.println("«Сегодня тепло, можно идти без шапки»");
        }
    }
    public static void task3() {
        //Задача 3
        System.out.println("Задача №3");
        int carSpeed = 50;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " , то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + carSpeed + " , можно ездить спокойно.");
        }
    }
    public static void task4() {
        //Задача 4
        System.out.println("Задача №4");
        int agePeople = 24;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если человеку " + agePeople + " лет, то ему нужно ходить в детский сад.");
        }
        if (agePeople >= 7 && agePeople <= 18) {
            System.out.println("Если человеку " + agePeople + " лет, то ему нужно ходить в школу.");
        }
        if (agePeople > 18 && agePeople <= 24) {
            System.out.println("Если человеку " + agePeople + " лет, то его место в университете.");
        }
        if (agePeople > 24)
            System.out.println("Если человеку " + agePeople + " лет, то ему пора ходить на работу.");
    }
    public static void task5() {

    }

}