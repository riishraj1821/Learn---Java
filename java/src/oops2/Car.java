package oops2;

public class Car extends Vehicle{
    String color;
    void Start(){
        super.Start();
        System.out.println("Car is Starting");
        System.out.println(this.model + " Model Car is running");
    }
    Car(){
        super(4);
        System.out.println("car is beaing created");
    }

    public static void main(String[] args) {
        Car Alto = new Car();
        Alto.model = "2021";
        Alto.Start();

    }
}
