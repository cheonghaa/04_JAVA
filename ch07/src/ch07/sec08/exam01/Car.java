package ch07.sec08.exam01;

public class Car extends Tire{
    public Tire tire;

    public void run() {
        tire.roll();
    }
}
