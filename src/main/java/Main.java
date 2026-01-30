public class Main {

    public static void main(String[] args) {

        System.out.println("Exersice1");
        byte clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("_________________________");

        System.out.println("Exersice2");
        clientOS = 0;
        short clientDeviceYear = 2013;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println("_________________________");

        System.out.println("Exersice3");
        short year = 2026;
        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " год является високосным");
            else
                System.out.println(year + " год является не високосным");
        } else
            System.out.println(year + " год до введения високосного года");
        System.out.println("_________________________");

        System.out.println("Exersice4");
        short deliveryDistance = 2;
        byte days = 1;
        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней: %s день доставки%n", days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 1;
            System.out.printf("Потребуется дней: %s дня доставки%n", days);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 2;
            System.out.printf("Потребуется дней: %s дня доставки%n", days);
        } else
            System.out.println("Доставка не производится");
        System.out.println("_________________________");

        System.out.println("Exersice5");
        byte monthNumber = 6;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
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
                System.out.println("Нет такого месяца");
                break;
        }
        System.out.println("_________________________");

    }
}
