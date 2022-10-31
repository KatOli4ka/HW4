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






    }}
