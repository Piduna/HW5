package org.sourceit.piduna.homework_5_1;

import java.util.Arrays;

/**
 * Created by Valeriu on 26.08.2015.
 */
public class Main {
    public static void main(String[] args) {

        Car[] car = new Car[5];
        car[0] = new Car(1, "Volvo", "2612AXA");
        car[1] = new Car(1, "Volvo", "2612AXA");
        car[2] = new Car(1, "Volvo", "2612AXA");
        car[3] = new Car(8, "Volvo", "2612AXA");
        car[4] = new Car(2, "Volvo", "2612AXA");

        System.out.println("array for equals & hashcode:");
        System.out.println(car[0].toString());
        System.out.println(car[1].toString());
        System.out.println(car[2].toString());

        System.out.println(" ");
        System.out.println("equals:");
        System.out.println(car[0].equals(car[0]));
        System.out.println(car[0].equals(car[1]));
        System.out.println(car[0].equals(car[1]) == car[0].equals(car[2]) == car[1].equals(car[2]));
        System.out.println(car[0].equals(null));
        System.out.println(" ");
        System.out.println("hashcode:");
        System.out.println(car[0].hashCode());
        System.out.println(car[1].hashCode());
        System.out.println(car[2].hashCode());
        System.out.println(car[0].hashCode() == car[1].hashCode());
        System.out.println(" ");
        System.out.println("compareTo:");
        System.out.println(car[0].compareTo(car[3]));
        System.out.println(car[0].compareTo(car[1]));
        System.out.println(car[3].compareTo(car[0]));
        System.out.println(" ");
        System.out.println("sort compareTo:");
        Arrays.sort(car);
        for (int i=0; i < car.length; i++) {
            System.out.println("Car{" +
                    "id='" + car[i].id + '\'' +
                    ", car_name='" + car[i].car_name + '\'' +
                    ", number='" + car[i].number + '\'' +
                    '}');
        }
    }
}
