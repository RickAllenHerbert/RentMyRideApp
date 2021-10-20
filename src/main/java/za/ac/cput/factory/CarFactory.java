package za.ac.cput.factory;

import za.ac.cput.entity.Car;

/* Car.java
   Entity for the Car
   Author: Rick Allen Herbert (219014337)
   Date: 05 June 2021
*/
public class CarFactory {

    public static Car createCar(String numberPlate, String color, String make, String model, double rentedPrice, String location, boolean rented) {

        Car car = new Car.Builder()
                .numberPlate(numberPlate)
                .color(color)
                .make(make)
                .model(model)
                .rentalPrice(rentedPrice)
                .location(location)
                .rented(rented)
                .build();

        return car;
    }
}
