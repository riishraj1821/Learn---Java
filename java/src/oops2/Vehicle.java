package oops2;

import java.util.Scanner;

public class Vehicle {
    String model ;
    int wheelCount;

    Vehicle(int wheelCount){
        this.wheelCount=wheelCount;
        System.out.println(wheelCount+" Wheeler Is Running");
    }

    Vehicle(){
        System.out.println("Creating a Vehicle Instance");
    }


    void Start(){

        System.out.println("Vehicle is Starting");


    }

}
