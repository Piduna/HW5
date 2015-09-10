package org.sourceit.piduna.homework_5_3;

/**
 * Created by Valeriu on 04.09.2015.
 */
public class Car implements Comparable{

    //i don't want to create getters. mod default
    int id;
    String car_name;
    String number;

    public Car(int id, String car_name, String number) {
        this.id = id;
        this.car_name = car_name;
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (car_name != null ? !car_name.equals(car.car_name) : car.car_name != null) return false;
        return !(number != null ? !number.equals(car.number) : car.number != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (car_name != null ? car_name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    public int compareTo (Object o) {
        Car entry = (Car)o;
        if (this.id < entry.id) return -1;
        else if(this.id > entry.id) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", car_name='" + car_name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}