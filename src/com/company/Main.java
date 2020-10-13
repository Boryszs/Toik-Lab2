package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle=new Area();
        vehicle.rotate(Rotation.RIGHT);
        vehicle.run(2);
        vehicle.rotate(Rotation.LEFT);
        vehicle.back(2);
        vehicle.rotate(Rotation.RIGHT);
        vehicle.back(2);
        vehicle.rotate(Rotation.LEFT);
        vehicle.run(1);

        System.out.print(vehicle.getPosition());

    }
}
