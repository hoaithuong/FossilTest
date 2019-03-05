package com.fossil.Question_1;

public class Main {
    public static void main(String args[]) {
        Car toyota = new Car(100);
        System.out.println("A Toyota car is a car with: maxSpeed = " + toyota.maxSpeed);
        Car bmw = new Car(200);
        System.out.println("A BMW car is a car with: maxSpeed = " + bmw.maxSpeed);
        toyota.run();
        bmw.run();
    }
}

class Car
{
    public int wheels;
    public int doors;
    public int seats;
    public int maxSpeed;

    public Car(int ms) {
        wheels = 4;
        doors = 4;
        seats = 5;
        maxSpeed = ms;
    }

    public void run()
    {
        for(int i = 0; i<10; i++)
        {
            System.out.println(maxSpeed);
        }
    }

    public void info()
    {
        System.out.println("Wheels = " + wheels);
        System.out.println("Doors = " + doors);
        System.out.println("Seats = " + seats);
        System.out.println("MaxSpeed = " + maxSpeed);
    }
}