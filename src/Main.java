public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int clientOS = 0;
        System.out.println("Задание 1");

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }

        //int clientOS = 0;
        int clientDeviceYear = 2015;
        System.out.println("Задание 2");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Система не распознана");
        }

        int year = 2021;
        System.out.println("Задание 3");
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        int deliveryDays = 1;
        System.out.println("Задание 4");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 1; // + 1 день
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;
        System.out.println("Задание 5");
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует (номер должен быть от 1 до 12)");
        }
    }
}

/*  Задание 3
year > 1584 -входной фильтр, если год меньше, программа сразу уйдет в else, даже не считая остатки.
year % 4 == 0 -«каждый четвертый». Оператор % находит остаток от деления. Если год % 4 равен нулю, значит, год делится на 4 нацело.
year % 100 != 0 - исключение «кроме каждого сотого». «Да, год делится на 4, но он не должен делиться на 100».Отсеиваем годы, как 1700, 1800 и 1900.
|| (year % 400 == 0) - искл. из исключения. Даже если год делится на 100 (что плохо для високосного), он всё равно станет високосным, если делится на 400. Именно поэтому 2000-й год был високосным.
*/