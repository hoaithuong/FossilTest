package com.fossil.Question_3;

public class Main {
    public static void main(String args[]) {
        Car toyota = new Car(100);
        Car bmw = new Car(200);
        Thread t1 = new Thread(toyota);
        Thread t2 = new Thread(bmw);
        t1.setPriority(6);
        t1.start();
        t2.start();
    }
}

class Car implements Runnable
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
