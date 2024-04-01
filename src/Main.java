public class Main {
    public static void checkLeapYear(int year) {  //метод первой задачи
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOsAndDeviceYear(int clientDeviceYear, int clientOS) {//метод второй задачи
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculationDeliveryDays(int deliveryDistance) {//метод третьей задачи
        int deliveryDays;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 666;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {

        int year = 1996;  //вводные параметры для задач
        int clientOS = 1;
        int deliveryDistance = 34;

        checkLeapYear(year);//по критериям, нужен вывод в консоль только на первой и второй задаче, выводы уже прописаны внутри метода.
        checkOsAndDeviceYear(year, clientOS);

        int deliveryDays = calculationDeliveryDays(deliveryDistance); //в третьей задаче вывод в консоль не требовался, но мне необходимо убедиться в корректности возвращаемых значений
        System.out.println(deliveryDays);
    }
}