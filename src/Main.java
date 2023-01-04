public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        //task7();
    }

    public static void task1() {
        //Задача 1
        System.out.println("Задача №1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать.");
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
        } else {
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
        //Задача 5
        System.out.println("Задача №5");
        int ageChildren = 7;
        boolean parent = true;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему нельзя кататься на аттракционе.");
        }
        if (parent == true && ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Нельзя кататься на аттракционе без сопровождения взрослого");
        }
        if (ageChildren >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        //Задача 6
        System.out.println("Задача №6");
        int totalCapacity = 102;
        int seatCapacity = 60;

        int carrentPerson = 103;
        if (carrentPerson >= totalCapacity) {
            System.out.println("Свободных мест нет");
        } else {
            if (carrentPerson >= seatCapacity) {
                System.out.println("Есть Стоячие места");
            } else {
                System.out.println("Есть Сидячие места");
            }
        }
    }
}