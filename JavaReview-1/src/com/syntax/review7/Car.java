package com.syntax.review7;

public class Car {

    protected String make,model;

    int year,horsePower;

    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make,String model,int year,int horsePower){
        this(make, model);
        this.year=year;
        this.horsePower=horsePower;
    }

    public void start(){
        System.out.println(make+" starts");
    }
    public void drive(int speed){
        System.out.println(make+" drive with speed "+speed);
    }


    protected String drive(String destination){
        System.out.println(make+" drives to "+destination);
        return destination;
    }

    void drive(int speed,String destination){
        System.out.println(make+" drive to "+destination+" with speed:"+speed);
    }

    void drive(String destination,int speed){
        System.out.println(make+" drive to "+destination+" with speed:"+speed);
    }



}



