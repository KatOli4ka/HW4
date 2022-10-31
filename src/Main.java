public class Main {
    public static void main(String[] args) {
        int clientOS=1;
        if(clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
                    }else {
            System.out.println("Установите версию приложения для Android по ссылке");}



        int clientDeviceYear =2014;
        int iOS=1;
        int android=0;
        if (clientDeviceYear<2015 && iOS==1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015 || iOS == 1) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (clientDeviceYear < 2015 || android == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }

        }



            int year=2021;
            if (year %100==0 && year%400==0){
                System.out.println(year+" является високосным годом");}
            else if (year%4==0 && year%100>0){
                System.out.println(year+" является високосным годом");}
            else {
                System.out.println(year+" не является високосным годом");}



        int deliveryDistance = 95;
        int day=1;
        int day2=day+1;
        int day3=day2+1;
        if (deliveryDistance<20) {
            System.out.println("Потребуется " + day + " день на доставку");
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется " + day2 + " дня на доставку");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется " + day3 + " дня на доставку");
            } else {
                System.out.println("ничего");
            }}

        int monthNumber=12;
        switch(monthNumber){
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Лето");break;
            case 10:
            case 11:
            case 12:
                System.out.println("Осень");
                break;
            default:
               System.out.println("Такого месяца не существует");}
    }

}


