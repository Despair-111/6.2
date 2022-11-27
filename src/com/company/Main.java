package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        List<Car> list = Car.asList();

        Scanner priceScanner = new Scanner(System.in);
        Car[] carArray = new Car[5];
        list.toArray(carArray);
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if(carArray[i].getMaxSpeed() > carArray[j].getMaxSpeed()){
                    Car a = carArray[i];
                    carArray[i]=carArray[j];
                    carArray[j]=a;
                }
            }
        }

        int price = priceScanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (carArray[i].getPrice() <= price) {
                System.out.println(carArray[i].toString());
            }
        }
    }
}


