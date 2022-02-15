package com.sa.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("red", 2010, 10, false);
        Lexus rx350 = new Lexus("black", 2020, 15, true);
        Toyota supra = new Toyota("white", 2021, 20, true);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());

//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.accelerateSpeed());
//        System.out.println(civic.accelerateSpeed());
//
//        System.out.println(civic.decelerateSpeed());
//        System.out.println(civic.decelerateSpeed());
//        System.out.println(civic.decelerateSpeed());

        System.out.println(civic.convertToElectric());
        System.out.println(civic.convertToElectric());
    }
}
