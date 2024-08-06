package oops;

public class MainClass {


    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "tommy";
        d1.age = 9;
        d1.color = "brown";
        d1.walk();
        d1.bark();

    }
    static class  Dog{

        String name;
        String color;
        int age;

        void walk() {
            System.out.println(name +" is Walking");
        }

        void bark(){
            System.out.println(name +" is Barking");
        }
    }

    static class Cat{

    }
}

