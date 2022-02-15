package com.sa.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public int accelerateSpeed() {
        if(this.speed < maxSpeed) {
            this.speed += 5;
        } else {
            System.out.println("Cannot increase speed because of max speed limit.");
        }
        return this.speed;
    }

    public int decelerateSpeed() {
        if(this.speed > 0) {
            this.speed -= 5;
        } else {
            System.out.println("Unable to decrease speed because it the current speed is 0.");
        }
        return this.speed;
    }

    public boolean convertToElectric() {
        if(!this.isElectric) {
            this.isElectric = true;
        } else {
            System.out.println("The Car is already electric.");
        }
        return this.isElectric;
    }
}
