package oops;

import java.util.zip.ZipFile;

public class MethodOverLoading {
    static class Greet {

        //    static void greet() {
//        System.out.println("hello, Good Morning");
//    }
//
//    void greet(String name){
//        System.out.println("hello " + name + " good morning");
//
        void greet(String name, int count) {
            for (int i = 0; i <= count; i++) {
                System.out.println("hello " + name + " good morning");
            }
        }
    }


    public static void main(String[] args) {
        Greet g = new Greet();
        g.greet("anuj", 5);

    }
}